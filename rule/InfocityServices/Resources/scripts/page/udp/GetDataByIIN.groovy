package page.udp

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.udp.UDPServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByIIN extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		UDPServiceProxy proxy = new UDPServiceProxy(session.user); 
		try {
			String iin = formData.get("iin")[0];
			def result = proxy.getDataByIIN(iin,lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("UDPService -> getDataByOwnerId").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {					
					def address = new _Tag("address"+i,it.address.region.name +" "+ it.address.street +" " + it.address.house + " " + it.address.flat)
					tag.addTag(address)
					def phone = new _Tag("phone"+i,it.phone)
					tag.addTag(phone)
					if(it.birthDate){
						def birthdate = new _Tag("birthdate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
						tag.addTag(birthdate)
					}else{
						def birthdate = new _Tag("birthdate"+i,"")
						tag.addTag(birthdate)
					}
					def resultiin = new _Tag("iin"+i,it.iin)
					tag.addTag(resultiin)
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(id)
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