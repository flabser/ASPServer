package handler.service_udp_getdatabyOrgName

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
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
			String orgname = formData.get("orgname")[0];
			def result = proxy.getDataByOrgName(orgname, 1, 100,lang)
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					msgBox (it.lastName ,"lastName"+i);
					DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
					if(it.birthDate != null){
						msgBox ( DOB.format(it.birthDate.getTime()),"birthDate"+i);
					}else{
						msgBox ("","birthDate"+i);
					}
					msgBox ( it.rnn,"rnn"+i);
					msgBox ( it.phone,"phone"+i);
					msgBox ( it.firstName,"okpo"+i);
					msgBox (it.address.region.name +" "+ it.address.street +" " + it.address.house + " " + it.address.flat,"address"+i);
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
