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
            for (FullResponse_ fullResponse_ : response) {
                i++;
                //фио
                /*System.out.println(fullResponse_.getCurrentFIO().getFirstName());
                System.out.println(fullResponse_.getCurrentFIO().getSurName());
                System.out.println(fullResponse_.getCurrentFIO().getMiddleName());*/
                def fioh = new _Tag("fio"+i, fullResponse_.getCurrentFIO().getFirstName() +" "+ fullResponse_.getCurrentFIO().getSurName() + " " + fullResponse_.getCurrentFIO().getMiddleName())
                tag.addTag(fioh)

                def birthdate = new _Tag("birthdate"+i, fullResponse_.getCommonInfo().getBirthDate().time.format("dd.MM.yyyy"))
                tag.addTag(birthdate)
                //дата рождения
                //System.out.println(fullResponse_.getCommonInfo().getBirthDate());
                def regplace = new _Tag("regplace"+i, createAddress(fullResponse_.getCurrentAddress()));
                tag.addTag(regplace)
                //место регистрации
                //System.out.println(fullResponse_.getCommonInfo().getCapableCourtName());

                //национальность
                def nationality = new _Tag("nationality"+i, (String)fullResponse_.getCommonInfo().getNationalityName())
                tag.addTag(nationality)
                //System.out.println(fullResponse_.getCommonInfo().getNationalityName());

//          номер Удостоверения
                String docNumber = "";
                if(fullResponse_.documentList.length > 0)
                    docNumber = fullResponse_.documentList[0].docNumber;

                def idnumber = new _Tag("idnumber"+i, docNumber)
                tag.addTag(idnumber)

                def iinout = new _Tag("iin"+i, iin)
                tag.addTag(iinout)
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
