package page.util
import kz.lof.webservices.Utils
import kz.nextbase.script._Session
import kz.nextbase.script._Tag
import kz.nextbase.script._WebFormData
import kz.nextbase.script._XMLDocument
import kz.nextbase.script.events._DoScript

class checksrv extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		try {
			String host = formData.get("host")[0];
			def tag = new _Tag("root","")
			def answerserver = Utils.checkHost(host)
			answerserver.value
			def value = new _Tag("value" , answerserver.value)
			tag.addTag(value)
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}
}
