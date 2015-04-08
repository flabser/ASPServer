package page.glossary

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.social.SocialServiceProxy
import kz.lof.webservices.store.social.Street
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;

class GetStreetsSocial extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		SocialServiceProxy proxy = new SocialServiceProxy(session.user);
		try {
			String street = formData.get("street")[0];
			def tag = new _Tag("root","")
			def result = proxy.getStreets(street, lang)
			def streets =  new _Tag("streets","");
			result.each{
				def entry = new _Tag("entry","");
				def name = new _Tag("name",it.nameStreet);
				entry.addTag(name);
				def streetid = new _Tag("id",it.idStreet.toString());
				entry.addTag(streetid);
				streets.addTag(entry);
				
			}
			tag.addTag(streets);
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
