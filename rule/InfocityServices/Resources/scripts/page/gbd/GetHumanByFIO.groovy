package page.gbd
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.lof.webservices.gbdfl.*
import kz.nextbase.script._Session
import kz.nextbase.script._Tag
import kz.nextbase.script._WebFormData
import kz.nextbase.script._XMLDocument
import kz.nextbase.script.events._DoScript

class GetHumanByFIO extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user); 
		try {
			String firstname = formData.get("firstname")[0];
			String middlename = formData.get("middlename")[0];
			String lastname = formData.get("lastname")[0];
			String isCitizen = formData.get("iscitizen")[0];
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]

			GBDFL2009Service_ServiceLocator l = new GBDFL2009Service_ServiceLocator();
			GBDFL2009Service_PortType service = l.getGBDFL2009ServiceBinding(session.user);

			FIO_ fio = new FIO_(firstname, middlename, lastname);

			SystemInfo_ info = new SystemInfo_("1", "1", Calendar.getInstance(), "1", "1", "25", "");

			//собственно сам запрос
			FullResponse_[] response = service.getPersonByFIO(new FIORequest_(fio, info));

//			Assert.assertTrue(response != null && response.length > 0);
			def tag = new _Tag("root","")
			def i = 0;
			for (FullResponse_ fullResponse_ : response) {
				i++;
				//фио
				/*System.out.println(fullResponse_.getCurrentFIO().getFirstName());
				System.out.println(fullResponse_.getCurrentFIO().getSurName());
				System.out.println(fullResponse_.getCurrentFIO().getMiddleName());*/
				def fioh = new _Tag("fio"+i, fullResponse_.getCurrentFIO().getFirstName() +" "+ fullResponse_.getCurrentFIO().getSurName() + " " + fullResponse_.getCurrentFIO().getMiddleName())
				tag.addTag(fioh)

				def birthdate = new _Tag("birthdate"+i, fullResponse_.getCommonInfo().getBirthDate())
				tag.addTag(birthdate)
				//дата рождения
				//System.out.println(fullResponse_.getCommonInfo().getBirthDate());
				def regplace = new _Tag("regplace"+i, fullResponse_.getCommonInfo().getCapableCourtName())
				tag.addTag(regplace)
				//место регистрации
				//System.out.println(fullResponse_.getCommonInfo().getCapableCourtName());

				//национальность
				def nationality = new _Tag("nationality"+i, fullResponse_.getCommonInfo().getNationalityName())
				tag.addTag(nationality)
				//System.out.println(fullResponse_.getCommonInfo().getNationalityName());

//          номер Удостоверения
				def idnumber = new _Tag("idnumber"+i, fullResponse_.getCommonInfo().getCapableNumber())
				tag.addTag(idnumber)

				def iin = new _Tag("iin"+i, fullResponse_.getCommonInfo().getBirthCertificateNumber())
				tag.addTag(iin)
				//System.out.println(fullResponse_.getCommonInfo().getBirthCertificateNumber());
//          или этот
				//System.out.println(fullResponse_.getCommonInfo().getCapableNumber());

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
