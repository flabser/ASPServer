package page.bti

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.bti.BTIServiceProxy
import kz.lof.webservices.store.bti.Street
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByAddress extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		BTIServiceProxy proxy = new BTIServiceProxy(session.user); 
		try {
			String buildingkind = formData.get("buildingkind")[0];
			//String streetid = formData.get("streetid")[0];
			Street street = new Street();
			street.setId(formData.get("streetid")[0].toInteger())
			String house = formData.get("house")[0];
			String flat = formData.get("flat")[0];
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]
			
			String extras = '';
			def result = proxy.getDataByAddress(buildingkind.toInteger(), street, house, flat, extras, page.toInteger(), pagesize.toInteger(), lang);
			def tag = new _Tag("root","")
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("BTIService -> getDataByOwnerId").toString());
			tag.addTag(getfulldataccess);
			tag.setAttr("count",result.getTotalFound());
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
					def dockind = new _Tag("dockind"+i,it.DKind.name)
					tag.addTag(dockind)
					def doctype = new _Tag("doctype"+i,it.DType.name)
					tag.addTag(doctype)
					def docnumber = new _Tag("docnumber"+i,it.DNumber)
					tag.addTag(docnumber)
					if(it.DRegDate != null){
						def docregdate = new _Tag("docregdate"+i,_Helper.getDateAsStringShort(it.DRegDate.getTime()))
						tag.addTag(docregdate)
					}else{
						def docregdate = new _Tag("docregdate"+i,"")
						tag.addTag(docregdate)
					}
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
