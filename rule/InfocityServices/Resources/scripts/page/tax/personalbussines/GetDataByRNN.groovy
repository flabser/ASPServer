package page.tax.personalbussines

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.tax.TaxIndServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByRNN extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		TaxIndServiceProxy proxy = new TaxIndServiceProxy(session.user); 
		try {
			String rnn = formData.get("rnn")[0];
			def validator =  _Validator.checkRNN_kz(rnn);
			def result = proxy.getDataByRNN(rnn,lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("TaxIndService -> getFullData").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					def entry = new _Tag("entry","")
					def businessName = new _Tag("businessname"+i,it.businessName)
					entry.addTag(businessName)
					def businessType = new _Tag("businesstype"+i,it.businessType)
					entry.addTag(businessType)
					def resultrnn = new _Tag("rnn"+i,it.rnn)
					entry.addTag(resultrnn)
					def iin = new _Tag("iin"+i,it.iin)
					entry.addTag(iin)
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					entry.addTag(fio)
					def id = new _Tag("id"+i,it.id.toString())
					entry.addTag(id)
					tag.addTag(entry)
					i++;
					
				}
			}else{
			}
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
