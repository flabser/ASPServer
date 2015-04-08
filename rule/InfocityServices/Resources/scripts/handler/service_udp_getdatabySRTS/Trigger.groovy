package handler.service_udp_getdatabySRTS

import java.rmi.RemoteException;
import java.util.Map;
import kz.lof.webservices.clients.tax.*
import kz.lof.webservices.store.tax.*
import kz.lof.webservices.clients.udp.UDPServiceProxy
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler
import kz.flabs.dataengine.ActivityStatusType


class Trigger extends _DoHandler {

	@Override
	public void doHandler(_Session session, Map<String, String[]> formData,	String lang) {
		UDPServiceProxy proxy = new UDPServiceProxy(session.user); 
		try {
			String srtsSerial = formData.get("srtsserial")[0];
			String srtsNumber = formData.get("srtsnumber")[0];
			def result = proxy.getDataBySRTS(srtsSerial,srtsNumber,lang);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					msgBox (it.grnz ,"grnz"+i);
					msgBox (it.model ,"model"+i);
					msgBox ( it.year,"year"+i);
					msgBox ( it.srts,"srts"+i);
					msgBox ( it.id.toString()  ,"id"+i);
					i++;
				}
				msgBox (result.getTotalFound().toString(),"count");
			}else{
				msgBox ("0","count");
			}
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
	}

	@Override
	public void doHandler(_Session session, _WebFormData formData) {
		// TODO Auto-generated method stub
		
	}

}

