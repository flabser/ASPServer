package page.gbd

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
                createLine("", address.districtName) +
                createLine("", address.regionName) +
                createLine("", address.cityName) +
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
        try {
            String iin = formData.get("iin")[0];

            GBDFL2009Service_ServiceLocator l = new GBDFL2009Service_ServiceLocator();
            GBDFL2009Service_PortType service = l.getGBDFL2009ServiceBinding(session.user);

            SystemInfo_ info = new SystemInfo_("1", "1", Calendar.getInstance(), "1", "1", "25", "");
            FullResponse_[] response = service.getPersonByIIN(new IINRequest_(iin, info));

            def tag = new _Tag("root","")

            if(response.length > 0){
                tag.setAttr("countelements", 1);
                def fullResponse_ = response[0];

                def fioh = new _Tag("fio", fullResponse_.getCurrentFIO().getSurName() + " "
                        + fullResponse_.getCurrentFIO().getFirstName() + " "
                        + fullResponse_.getCurrentFIO().getMiddleName())
                tag.addTag(fioh)

                def birthdate = new _Tag("birthdate", fullResponse_.getCommonInfo().getBirthDate().time.format("dd.MM.yyyy"))
                tag.addTag(birthdate)

                def citizenship = new _Tag("citizenship", (String)fullResponse_.getCommonInfo().getCitizenshipName())
                tag.addTag(citizenship)

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

                tag.addTag(new _Tag("iin", (String)fullResponse_.getCommonInfo().getIIN()))

                tag.setAttr("doccount", fullResponse_.documentList.length);
                for (int i = 0; i < fullResponse_.documentList.length; i++) {
                    Document_ doc = fullResponse_.documentList[i];
                    tag.addTag(new _Tag("docnum" + (i + 1), (String)doc.docNumber))
                    tag.addTag(new _Tag("docname" + (i + 1), (String)doc.docName))
                    tag.addTag(new _Tag("docdate" + (i + 1), (String)doc.docIssueDate.time.format("dd.MM.yyyy")))
                    tag.addTag(new _Tag("docissuer" + (i + 1), (String)doc.docIssuerName))
                }
            }
            def xml = new _XMLDocument(tag)
            setContent(xml);
        } catch (Exception re) {
            println(re);
        }
    }
}
