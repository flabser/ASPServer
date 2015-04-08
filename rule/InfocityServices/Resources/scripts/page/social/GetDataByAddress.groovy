package page.social

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.social.SocialServiceProxy
import kz.lof.webservices.store.social.Address
import kz.lof.webservices.store.social.HumanFullData
import kz.lof.webservices.store.social.Street
import kz.lof.webservices.store.uaig.FullData;
import kz.lof.webservices.store.ump.PersonFullData;
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByAddress extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		SocialServiceProxy proxy = new SocialServiceProxy(session.user); 
		try {
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]
			Address address = new Address();
			Street street = new Street();
			street.setIdStreet(formData.get("streetid")[0].toInteger())
			address.setStreet(street);
			address.setHouse(formData.get("house")[0]);
			address.setFlat(formData.get("flat")[0])
			String extras = '';
			def result = proxy.getHumanByAddress(((Address[])[address].toArray()), page.toInteger(), pagesize.toInteger(), lang);
			def tag = new _Tag("root","")
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("SocialService -> getHumanById").toString());
			tag.addTag(getfulldataccess);
			tag.setAttr("count",result.getTotalFound());
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getCrowd().each {
					def fio = new _Tag("fio"+i,it.lastname + " " + it.firstname + " " + it.middlename)
					tag.addTag(fio)
					def fulladdress = new _Tag("address"+i,it.address.getStreet().nameStreet+", " + it.address.getHouse() +" " + it.address.getFlat())
					tag.addTag(fulladdress)
					def idPerson = new _Tag("idPerson"+i,it.idPerson)
					tag.addTag(idPerson)
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
