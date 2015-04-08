package handler.service_getdatabyrnn

import java.rmi.RemoteException;
import java.util.Map;
import kz.lof.webservices.clients.tax.*
import kz.lof.webservices.store.tax.*
import kz.nextbase.script._Session
import kz.nextbase.script._Validator
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler
import kz.flabs.dataengine.ActivityStatusType


class Trigger extends _DoHandler {

	@Override
	public void doHandler(_Session session, Map<String, String[]> formData,	String lang) {
		String rnn = formData.get("rnn")[0];
		def validator =  _Validator.checkRNN_kz(rnn);
		if (validator == true){
			TaxIndServiceProxy proxy = new TaxIndServiceProxy(session.user); 
			println("Start");
			try {
				def result = proxy.getDataByRNN(rnn,lang);
				if (result.getTotalFound() != 0){
					def i = 1;
					result.getShortData().each {
						def data = result.getShortData()[0];
						TaxIndFullData fullData = proxy.getFullData(it.id, lang);
						msgBox (it.businessName ,"businessName"+i);
						msgBox (it.businessType.toString() ,"businessType"+i);
						msgBox ( it.iin,"iin"+i);
						msgBox ( it.rnn,"rnn"+i);
						msgBox ( it.lastName + " " + data.firstName + " " + data.middleName ,"fio"+i);
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
		}else{
			msgBox ("РНН не соответствует формату","validation");
		}
	}

	@Override
	public void doHandler(_Session session, _WebFormData formData) {
		// TODO Auto-generated method stub
		
	}

}
