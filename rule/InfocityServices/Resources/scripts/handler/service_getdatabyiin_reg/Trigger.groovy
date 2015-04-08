package handler.service_getdatabyiin_reg

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
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
		TaxPayServiceProxy proxy = new TaxPayServiceProxy(session.user); 
		String iin = formData.get("iin")[0];
		def validator = _Validator.checkIIN_kz(iin)
		if (validator == true){
			def result = proxy.getDataByIIN(iin,lang);
			try {
				if (result.getTotalFound() != 0){
					def i = 1;
					result.getShortData().each {
						TaxPayerFullData fullData = proxy.getFullData(it.id, it.status, lang);
						msgBox ( it.realAddress.street.name + ", "+ it.realAddress.house.toString() +" пїЅпїЅ. " + it.realAddress.flat.toString() ,"realAddress"+i);
						msgBox ( it.regAddress.street.name + ", "+ it.regAddress.house.toString() +" пїЅпїЅ. " + it.regAddress.flat.toString(),"regAddress"+i);
						DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
						if(it.birthDate != null){
							msgBox ( DOB.format(it.birthDate.getTime()),"birthDate"+i);
						}else{
							msgBox ("","birthDate"+i);
						}
						msgBox ( it.rnn,"rnn"+i);
						msgBox ( it.iin,"iin"+i);
						msgBox ( it.lastName + " " + it.firstName + " " + it.middleName   ,"fio"+i);
						msgBox ( it.id.toString()  ,"id"+i);
						msgBox ( it.status.toString()  ,"status"+i);
						i++
					}
					msgBox (result.getTotalFound().toString(),"count");
				}else{
					msgBox ("0","count");
				}
			} catch (RemoteException re) {
				println("РЎРµСЂРІРёСЃ РЅРµРґРѕСЃС‚СѓРїРµРЅ");
			}
		}else{
			msgBox ("Р�Р�Рќ РЅРµ СЃРѕРѕС‚РІРµС‚СЃС‚РІСѓРµС‚ С„РѕСЂРјР°С‚Сѓ","validation");
		}
	}

	@Override
	public void doHandler(_Session session, _WebFormData formData) {
		// TODO Auto-generated method stub
		
	}

}
