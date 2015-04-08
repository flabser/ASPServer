package page.udp

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.udp.UDPServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByOrgName extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		UDPServiceProxy proxy = new UDPServiceProxy(session.user); 
		try {
			String orgname = formData.get("orgname")[0];
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]
			
			def result = proxy.getDataByOrgName(orgname, page.toInteger(), pagesize.toInteger(),lang)
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("UDPService -> getDataByOwnerId").toString());
			tag.addTag(getfulldataccess);
			def countelements;
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					if(it.birthDate != null){
						def birthdate = new _Tag("birthDate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
						tag.addTag(birthdate)
					}else{
						def birthdate = new _Tag("birthDate"+i,"")
						tag.addTag(birthdate)
					}
					def rnn = new _Tag("rnn"+i,it.rnn)
					tag.addTag(rnn)
					def iin = new _Tag("iin"+i,it.iin)
					tag.addTag(iin)
					def lastName = new _Tag("lastName"+i,it.lastName)
					tag.addTag(lastName)
					def phone = new _Tag("phone"+i,it.phone)
					tag.addTag(phone)
					def okpo = new _Tag("okpo"+i,it.firstName)
					tag.addTag(okpo)
					def address = new _Tag("address"+i,it.address.region.name +" "+ it.address.street +" " + it.address.house + " " + it.address.flat)
					tag.addTag(address)
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(id);
					countelements = i;
					i++;
				}
				tag.setAttr("countelements",countelements);
			}else{
			}
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
