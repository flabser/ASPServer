package handler.service_ump_gethumanbyfio

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import kz.lof.webservices.clients.ump.*
import kz.lof.webservices.store.ump.*
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler
import kz.flabs.dataengine.ActivityStatusType


class Trigger extends _DoHandler {

	@Override
	public void doHandler(_Session session, Map<String, String[]> formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user); 
		
		try {
			String firstname = formData.get("firstname")[0];
			String middlename = formData.get("middlename")[0];
			String lastname = formData.get("lastname")[0];
			String isCitizen = formData.get("isCitizen")[0];
			def result = proxy.getHumanByFIO(firstname, lastname, middlename, isCitizen.toShort(), 1, 100, lang)
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					//def data = result.getShortData()[0];
					//HumanFullData fullData = proxy.getFullData(it., lang);
					DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
					if(it.birthDate != null){
						msgBox ( DOB.format(it.birthDate.getTime()),"birthDate"+i);
					}else{
						msgBox ("","birthDate"+i);
					}
					msgBox ( it.lastName + " " + it.firstName + " " + it.middleName   ,"fio"+i);
					msgBox (it.gender.toString() ,"gender"+i);
					msgBox (it.idDocument[0].id.toString() ,"numberid"+i);
					msgBox (it.nationality.maleName ,"nationality"+i);
					msgBox (it.iin ,"iin"+i);
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
