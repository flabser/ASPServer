package page.tax.personalbussines

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.tax.TaxIndServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByFIO extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		TaxIndServiceProxy proxy = new TaxIndServiceProxy(session.user); 
		try {
			String firstname = formData.get("firstname")[0];
			String middlename = formData.get("middlename")[0];
			String lastname = formData.get("lastname")[0];
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]
			
			def result = proxy.getDataByFIO(lastname,firstname,middlename,page.toInteger(),pagesize.toInteger(),lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("TaxIndService -> getFullData").toString());
			tag.addTag(getfulldataccess);
			def countelements;
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					def businessName = new _Tag("businessname"+i,it.businessName)
					tag.addTag(businessName)
					def businessType = new _Tag("businesstype"+i,it.businessType)
					tag.addTag(businessType)
					def rnn = new _Tag("rnn"+i,it.rnn)
					tag.addTag(rnn)
					def iin = new _Tag("iin"+i,it.iin)
					tag.addTag(iin)
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(id);
					countelements = i;
					i++;
				}
				tag.setAttr("countelements",countelements);
			}else{
			}
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
