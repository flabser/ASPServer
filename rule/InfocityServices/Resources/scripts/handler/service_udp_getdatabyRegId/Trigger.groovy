package handler.service_udp_getdatabyRegId

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
			String firstname = formData.get("firstname")[0];
			String middlename = formData.get("middlename")[0];
			String lastname = formData.get("lastname")[0];
			def result = proxy.getDataByFIO(firstname,middlename,lastname,1,20,lang);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					def data = result.getShortData()[0];
					TaxIndFullData fullData = proxy.getFullData(it.id, lang);
					msgBox (it.businessName ,"businessName"+i);
					msgBox (it.businessType.toString() ,"businessType"+i);
					msgBox ( it.rnn,"rnn"+i);
					msgBox ( it.iin,"iin"+i);
					msgBox ( it.lastName + " " + data.firstName + " " + data.middleName   ,"fio"+i);
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
