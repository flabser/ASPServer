package form.regdataorg

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import kz.lof.webservices.clients.tax.*
import kz.lof.webservices.store.tax.*
import kz.nextbase.script._Document;
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler
import kz.nextbase.script.events._FormQueryOpen;
import kz.flabs.dataengine.ActivityStatusType;
import kz.nextbase.script.actions.*
import kz.nextbase.script.events.*;
import kz.nextbase.script.constants.*


class QueryOpen extends  _FormQueryOpen {

	@Override
	public void doQueryOpen(_Session ses, _WebFormData webFormData, String lang) {
			TaxPayServiceProxy proxy = new TaxPayServiceProxy(ses.user); 
		def fid = webFormData.getValue("fid")
		def fst = webFormData.getValue("fstatus")
		println("Start");
		try {
			
			TaxPayerFullData fullData = proxy.getFullData(fid.toLong(),fst.toShort(), lang);
			def user = ses.getCurrentAppUser()
			def actionBar = new _ActionBar(ses)
			if(user.hasRole("print")){
				actionBar.addAction(new _Action(getLocalizedWord("Распечатать",lang),getLocalizedWord("Распечатать",lang),"print"))
			}
			publishElement(actionBar)
			publishValue("firstName", fullData.firstName);
			publishValue("middleName", fullData.middleName);
			publishValue("lastName", fullData.lastName);
			publishValue("rnn", fullData.rnn);
			publishValue("docSerial", fullData.docSerial);
			publishValue("docNumber", fullData.docNumber);
			publishValue ("realAddress",fullData.realAddress.street.name + ", "+ fullData.realAddress.house.toString() +" кв. " + fullData.realAddress.flat.toString());
			publishValue ("regAddress",fullData.regAddress.street.name + ", "+ fullData.regAddress.house.toString() +" кв. " + fullData.regAddress.flat.toString());
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			if(fullData.docReleaseDate != null){
				publishValue ("docReleaseDate", DOB.format(fullData.docReleaseDate.getTime()));
			}
			if(fullData.birthDate != null){
				publishValue ("birthDate",DOB.format(fullData.birthDate.getTime()));
			}
			if(fullData.regDate != null){
				publishValue ("regDate", DOB.format(fullData.regDate.getTime()));
			}
			publishValue("docAuthority", fullData.docAuthority);
			publishValue("activityType", fullData.activityType.name);
			publishValue("orgForm", fullData.orgForm.name);
			publishValue("propForm", fullData.propForm.name);
			publishValue("personType", fullData.personType.name);
			publishValue("okpo", fullData.okpo);
			publishValue("registryNumber", fullData.registryNumber);
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc,_WebFormData webFormData, String lang) {

		
	}

}
