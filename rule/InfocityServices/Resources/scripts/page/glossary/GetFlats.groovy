package page.glossary

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.lof.webservices.store.ump.Street
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;

class GetFlats extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user); 
		
		try {
			String streetid = formData.get("streetid")[0];
			String housenumber = formData.get("house")[0];
			String flatnumber = formData.get("flat")[0];
			def tag = new _Tag("root","")
			def result = proxy.getFlats(streetid.toInteger(), housenumber, flatnumber)
			def flats =  new _Tag("flats","");
			result.each{
				def entry = new _Tag("entry","");
				def number = new _Tag("number",it);
				entry.addTag(number);
				flats.addTag(entry);
			}
			tag.addTag(flats);
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
