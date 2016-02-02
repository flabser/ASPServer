package page.gbd
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.lof.webservices.gbdfl.*
import kz.nextbase.script._Session
import kz.nextbase.script._Tag
import kz.nextbase.script._WebFormData
import kz.nextbase.script._XMLDocument
import kz.nextbase.script.events._DoScript

class GetHumanByDoc extends _DoScript {

    private String createAddress(Address_ address){
        if (address == null) return "";

        String result = "" +
                createLine("", address.regionName) +
                createLine("", address.cityName) +
                createLine("", address.districtName) +
                createLine("ул.", address.streetName) +
                createLine("д.", address.buildingNumber) +
                createLine("кв.", address.flatNumber);
        if(result.length() > 0) result = result.substring(0, result.length() - 2);
        return result;
    }

    private String createLine(String prefix, String value){
        if(value != null && value.trim().length() != 0)
            return prefix + value.trim() + ", ";
        return ""
    }
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user);
		try {
			String docnumber = formData.get("doc")[0];

//			String isCitizen = formData.get("iscitizen")[0];
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]

			GBDFL2009Service_ServiceLocator l = new GBDFL2009Service_ServiceLocator();
			GBDFL2009Service_PortType service = l.getGBDFL2009ServiceBinding(session.user);


			SystemInfo_ info = new SystemInfo_("1", "1", Calendar.getInstance(), "1", "1", "25", "");

			FullResponse_[] response = service.getPersonByDocument(new DocumentRequest_(docnumber, info));

//			Assert.assertTrue(response != null && response.length > 0);
			def tag = new _Tag("root","")
			def i = 0;
            for (FullResponse_ fullResponse_ : response) {
                i++;
                //фио
                def fioh = new _Tag("fio", fullResponse_.getCurrentFIO().getFirstName() +" "+ fullResponse_.getCurrentFIO().getSurName() + " " + fullResponse_.getCurrentFIO().getMiddleName())
                tag.addTag(fioh)

                def birthdate = new _Tag("birthdate", fullResponse_.getCommonInfo().getBirthDate().time.format("dd.MM.yyyy"))
                tag.addTag(birthdate)

                def citizenship = new _Tag("citizenship", (String)fullResponse_.getCommonInfo().getCitizenshipName())
                tag.addTag(citizenship)

                //национальность
                def nationality = new _Tag("nationality", (String)fullResponse_.getCommonInfo().getNationalityName())
                tag.addTag(nationality)

                def gender = new _Tag("gender", (String)fullResponse_.getCommonInfo().getSexName())
                tag.addTag(gender)

                def status = new _Tag("status", (String)fullResponse_.getCommonInfo().getStatusName())
                tag.addTag(status)

                def regplace = new _Tag("regplace", createAddress(fullResponse_.getCurrentAddress()));
                tag.addTag(regplace)

                def birthplace = new _Tag("birthplace", createAddress(fullResponse_.getBirthAddress()));
                tag.addTag(birthplace)

                def idnumber = new _Tag("idnumber", docnumber)
                tag.addTag(idnumber)

                tag.addTag(new _Tag("iin", (String)fullResponse_.getCommonInfo().getIIN()))

            }
			tag.setAttr("countelements",i);
			//def tag = new _Tag("root","")
			/*def result = proxy.getHumanByFIO(firstname, lastname, middlename, page.toInteger(),  pagesize.toInteger(), lang)
			tag.setAttr("count",result.getTotalFound().toString());
			if(isCitizen == '1'){
				def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("HumansSearchService -> getFullData").toString());
				tag.addTag(getfulldataccess);
			}else{
				def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("ForeignersSearchService -> getFullData").toString());
				tag.addTag(getfulldataccess);
			}
			def countelements;
			if (result.getTotalFound() != 0){
				//def i = 1;
				result.getShortData().each {
					def birthdate = new _Tag("birthdate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
					tag.addTag(birthdate)
					//def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					def gendervalue = it.gender.toString();
					if (gendervalue == '1'){
						gendervalue = "Мужской";
					}else{
						gendervalue = "Женский";
					}
					def gender = new _Tag("gender"+i,gendervalue)
					tag.addTag(gender)
					def numberid = new _Tag("numberid"+i,it.idDocument[0].number)
					tag.addTag(numberid)
					if (it.gender.toString() == '1'){
						def nationality = new _Tag("nationality"+i,it.nationality.maleName);
						tag.addTag(nationality)
					}else{
						def nationality = new _Tag("nationality"+i,it.nationality.femaleName);
						tag.addTag(nationality)
					}
					def iin = new _Tag("iin"+i,it.iin)
					tag.addTag(iin)
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(id);
					countelements = i;
					i++;
				}
				tag.setAttr("countelements",countelements);
			}else{
			}*/
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

}
