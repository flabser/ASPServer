package page.udp

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.udp.UDPServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataBySRTS extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		UDPServiceProxy proxy = new UDPServiceProxy(session.user); 
		try {
			String srtsSerial = formData.get("srtsserial")[0];
			String srtsNumber = formData.get("srtsnumber")[0];
			def result = proxy.getDataBySRTS(srtsSerial,srtsNumber,lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("UDPService -> getDataByOwnerId").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					def resultgrnz = new _Tag("grnz"+i,it.grnz)
					tag.addTag(resultgrnz)
					def model = new _Tag("model"+i,it.model)
					tag.addTag(model)
					def year = new _Tag("year"+i,it.year)
					tag.addTag(year)
					def srts = new _Tag("srts"+i,it.srts)
					tag.addTag(srts)
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
