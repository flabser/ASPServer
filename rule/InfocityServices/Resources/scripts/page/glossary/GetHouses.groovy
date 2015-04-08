package page.glossary

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.lof.webservices.store.ump.Street
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;

class GetHouses extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user); 
		
		try {
			String streetid = formData.get("streetid")[0];
			String housenumber = formData.get("house")[0];
			def tag = new _Tag("root","")
			def result = proxy.getHouses(streetid.toInteger(), housenumber)
			def houses =  new _Tag("houses","");
			result.each{
				def entry = new _Tag("entry","");
				def number = new _Tag("number",it);
				entry.addTag(number);
				houses.addTag(entry);
			}
			tag.addTag(houses);
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
