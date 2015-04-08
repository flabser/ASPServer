package handler.service_getdatabyfio

import java.rmi.RemoteException;
import java.util.Map;
import kz.lof.webservices.clients.tax.*
import kz.lof.webservices.store.tax.*
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler;
import kz.flabs.dataengine.ActivityStatusType


class Trigger extends _DoHandler {

	@Override
	public void doHandler(_Session session, Map<String, String[]> formData,	String lang) {
		TaxIndServiceProxy proxy = new TaxIndServiceProxy(session.user); 
		
		try {
			String firstname = formData.get("firstname")[0];
			String middlename = formData.get("middlename")[0];
			String lastname = formData.get("lastname")[0];
			def result = proxy.getDataByFIO(firstname,middlename,lastname,1,20,lang);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					msgBox (it.businessName ,"businessName"+i);
					msgBox (it.businessType.toString() ,"businessType"+i);
					msgBox ( it.rnn,"rnn"+i);
					msgBox ( it.iin,"iin"+i);
					msgBox ( it.lastName + " " + it.firstName + " " + it.middleName   ,"fio"+i);
					msgBox ( it.id.toString()  ,"id"+i);
					i++;
				}
				msgBox (result.getTotalFound().toString(),"count");
			}else{
				msgBox ("0","count");
			}
			//act.postActivity("service_getDataByFIO","firstname=" + firstname+" "+"middlename="+ middlename+" "+"lastname="+ lastname)
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
	}

	@Override
	public void doHandler(_Session session, _WebFormData formData) {
		// TODO Auto-generated method stub
		
	}

}
