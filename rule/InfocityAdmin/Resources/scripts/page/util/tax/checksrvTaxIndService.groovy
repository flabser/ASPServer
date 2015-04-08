package page.util.tax

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.*;
import kz.lof.webservices.clients.tax.TaxIndService
import kz.lof.webservices.clients.tax.TaxIndServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;

class checksrvTaxIndService extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		TaxIndServiceProxy  proxy = new TaxIndServiceProxy(session.user);
		try {
			def tag = new _Tag("root","")
			def result = proxy.testService()
			def param = new _Tag("param","")
			result.allInfo.each{
				def entry = new _Tag("entry","")
				def value = new _Tag("value" , it.value)
				entry.addTag(value)
				def name = new _Tag("name" , it.name)
				entry.addTag(name)
				param.addTag(entry)
			}
			tag.addTag(param)
			def xml = new _XMLDocument(tag)
			setContent(xml);
			
		} catch (Exception re) {
			println(re);
		}
		
	}
}
