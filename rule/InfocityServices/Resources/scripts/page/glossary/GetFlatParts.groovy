package page.glossary

import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.nextbase.script._Session
import kz.nextbase.script._Tag
import kz.nextbase.script._WebFormData
import kz.nextbase.script._XMLDocument
import kz.nextbase.script.events._DoScript

class GetFlatParts extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user); 
		
		try {
			String streetid = formData.get("streetid")[0];
			String housenumber = formData.get("house")[0];
			String flatnumber = formData.get("flat")[0];
			//String flatpart = formData.get("flatnumber")[0];
			def tag = new _Tag("root","")
			def result = proxy.getFlatParts(streetid.toInteger(), housenumber, flatnumber)
			def flats =  new _Tag("flats","");
			def i= 0
			result.each{
				if(result[i] != null){
					def number = new _Tag("number", result[i]);
					flats.addTag(number);
				}
				i++;
			}
			tag.addTag(flats);
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
