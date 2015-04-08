package page.log.udp

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.*;
import kz.lof.webservices.clients.udp.UDPServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;

class getLogUDPService extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		UDPServiceProxy proxy = new UDPServiceProxy(session.user);
		String date = formData.get("date")[0];
		try {
			def tag = new _Tag("root","")
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			Date dt = format.parse(date);
			def result = proxy.getLog(dt);
			def param = new _Tag("param","")
			result.each{
				def entry = new _Tag("entry","")
				def value = new _Tag("value" , it)
				entry.addTag(value)
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
