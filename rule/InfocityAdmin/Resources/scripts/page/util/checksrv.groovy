package page.util

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.*;
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;

class checksrv extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		try {
			String host = formData.get("host")[0];
			def tag = new _Tag("root","")
			def answerserver = Utils.checkHost(host)
			answerserver.value
			def value = new _Tag("value" , answerserver.value.toString())
			tag.addTag(value)
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}
}
