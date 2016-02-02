package page.gbd
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.lof.webservices.gbdfl.*
import kz.nextbase.script._Session
import kz.nextbase.script._Tag
import kz.nextbase.script._WebFormData
import kz.nextbase.script._XMLDocument
import kz.nextbase.script.events._DoScript

class GetHumanByIIN extends _DoScript {

    private static String createAddress(Address_ address){
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

    private static String createLine(String prefix, String value){
        if(value != null && value.trim().length() != 0)
            return prefix + value.trim() + ", ";
        return ""
    }

    @Override
    public void doProcess(_Session session, _WebFormData formData,	String lang) {
        HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user);
        try {
            String iin = formData.get("iin")[0];

//			String isCitizen = formData.get("iscitizen")[0];
//			String page = formData.get("page")[0]
//			String pagesize = formData.get("pagesize")[0]

            GBDFL2009Service_ServiceLocator l = new GBDFL2009Service_ServiceLocator();
            GBDFL2009Service_PortType service = l.getGBDFL2009ServiceBinding(session.user);


            SystemInfo_ info = new SystemInfo_("1", "1", Calendar.getInstance(), "1", "1", "25", "");

            FullResponse_[] response = service.getPersonByIIN(new IINRequest_(iin, info));

            ///////////////////////test case//////////////////////////
//            FullResponse_ fullResponse_1 =  new FullResponse_();
//            fullResponse_1.currentFIO = new FIO_();
//            fullResponse_1.currentFIO.firstName = "Дарын";
//            fullResponse_1.currentFIO.surName = "Серикбаев";
//            fullResponse_1.currentFIO.middleName = "Жамиханович";
//
//            fullResponse_1.commonInfo = new CommonInfo_()
//            fullResponse_1.commonInfo.birthDate = Calendar.getInstance();
//            fullResponse_1.currentAddress = new Address_()
//            fullResponse_1.currentAddress.cityName = "Almaty"
//            fullResponse_1.currentAddress.districtName = "Medeu"
//            fullResponse_1.currentAddress.streetName = "Dostyk"
//            fullResponse_1.currentAddress.buildingNumber = "99"
//            fullResponse_1.currentAddress.flatNumber = "7"
//
//            fullResponse_1.commonInfo.nationalityName = "Puerto-Rikanian"
//
//            Document_ d = new Document_()
//            d.docNumber = "659433612";
//            fullResponse_1.documentList = new Document_[1];
//            fullResponse_1.documentList[0] = d;
//
//
//            FullResponse_[] response = new FullResponse_[1];
//            response[0] = fullResponse_1;

            ///////////////////////////

//			Assert.assertTrue(response != null && response.length > 0);
            def tag = new _Tag("root","")
            def i = 0;
			def getfulldataccess;
			getfulldataccess = new _Tag("getfulldataccess", session.currentAppUser.hasRole("HumansSearchService -> getFullData").toString())
			tag.addTag(getfulldataccess);
			for (FullResponse_ fullResponse_ : response) {
                i++;
                //фио
                def fioh = new _Tag("fio"+i, fullResponse_.getCurrentFIO().getFirstName() +" "+ fullResponse_.getCurrentFIO().getSurName() + " " + fullResponse_.getCurrentFIO().getMiddleName())
                tag.addTag(fioh)

                def birthdate = new _Tag("birthdate"+i, fullResponse_.getCommonInfo().getBirthDate().time.format("dd.MM.yyyy"))
                tag.addTag(birthdate)
                //дата рождения
                def regplace = new _Tag("regplace"+i, createAddress(fullResponse_.getCurrentAddress()));
                tag.addTag(regplace)
                //место регистрации
                //System.out.println(fullResponse_.getCommonInfo().getCapableCourtName());

                //национальность
                def nationality = new _Tag("nationality"+i, (String)fullResponse_.getCommonInfo().getNationalityName())
                tag.addTag(nationality)

				// номер Удостоверения
                String docNumber = "";
                if(fullResponse_.documentList.length > 0)
                    docNumber = fullResponse_.documentList[0].docNumber;

                def idnumber = new _Tag("idnumber"+i, docNumber)
                tag.addTag(idnumber)

                def iinout = new _Tag("iin"+i, iin)
                tag.addTag(iinout)

            }
            tag.setAttr("countelements",i);
            def xml = new _XMLDocument(tag)
            setContent(xml);
        } catch (Exception re) {
            println(re);
        }

    }

}
