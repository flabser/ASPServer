package page.bti

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.bti.BTIServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByDoc extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		BTIServiceProxy proxy = new BTIServiceProxy(session.user);
		try {
			String dockind = formData.get("dockind")[0];
			String doctype = formData.get("parentdoctype")[0];
			String docnumber = formData.get("docnumber")[0];
			
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]
			def result = proxy.getDataByDoc(dockind.toInteger(), doctype.toInteger(), docnumber, page.toInteger(), pagesize.toInteger(), lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("BTIService -> getFullDataByDoc").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					def fio = new _Tag("fio"+i,it.OLastName + " " + it.OFirstName + " " + it.OMiddleName)
					tag.addTag(fio)
					if(it.OBirthDate != null){
						def birthdate = new _Tag("birthdate"+i,_Helper.getDateAsStringShort(it.OBirthDate.getTime()))
						tag.addTag(birthdate)
					}else{
						def birthdate = new _Tag("birthdate"+i,"")
						tag.addTag(birthdate)
					}
					def buildingkind = new _Tag("buildingkind"+i,it.buildingKind.name)
					tag.addTag(buildingkind)
					def street = new _Tag("street"+i,it.address.street.name)
					tag.addTag(street)
					def house = new _Tag("house"+i,it.address.house)
					tag.addTag(house)
					def flat = new _Tag("flat"+i,it.address.flat)
					tag.addTag(flat)
					def ownerid = new _Tag("id"+i,it.ownerId.toString())
					tag.addTag(ownerid)
					def ownerStatus = new _Tag("status"+i,it.ownerStatus.toString())
					tag.addTag(ownerStatus)
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
