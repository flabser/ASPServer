package form.personalbusinessmen

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
import kz.flabs.dataengine.ActivityStatusType
import kz.nextbase.script.actions.*
import kz.nextbase.script.events.*;
import kz.nextbase.script.constants.*


class QueryOpen extends  _FormQueryOpen {

	@Override
	public void doQueryOpen(_Session ses, _WebFormData webFormData, String lang) {
		TaxIndServiceProxy proxy = new TaxIndServiceProxy(ses.user); 
		def fid = webFormData.getValue("fid")
		try {
			TaxIndFullData fullData = proxy.getFullData(fid.toLong(), lang);
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			def user = ses.getCurrentAppUser()
			def actionBar = new _ActionBar(ses)
			if(user.hasRole("print")){
				actionBar.addAction(new _Action(getLocalizedWord("Распечатать",lang),getLocalizedWord("Распечатать",lang),"print"))
			}
			publishElement(actionBar)
			publishValue("businessName", fullData.businessName) ;
			publishValue("firstName", fullData.firstName);
			publishValue("middleName", fullData.middleName);
			publishValue("lastName", fullData.lastName);
			publishValue("id", fullData.id.toString());
			publishValue("payerId", fullData.payerId.toString());
			publishValue("address", fullData.address.street.name +" "+ fullData.address.house + "кв." + fullData.address.flat);
			publishValue("rnn", fullData.rnn);
			publishValue("declarationType", fullData.declarationType.toString());
			if(fullData.declarationSentDate != null){
				publishValue ("docReleaseDate", DOB.format(fullData.declarationSentDate.getTime()));
			}
			if(fullData.declarationReceivedDate != null){
				publishValue ("docReleaseDate", DOB.format(fullData.declarationReceivedDate.getTime()));
			}
			publishValue("docSerial", fullData.docSerial);
			publishValue("iin", fullData.iin);
			publishValue("docNumber", fullData.docNumber);
			publishValue("docReleaseDate", DOB.format(fullData.docReleaseDate.getTime()));
			publishValue("docAuthority", fullData.docAuthority);
			publishValue("businessType", fullData.businessType.toString());
			publishValue("cooperativeType", fullData.cooperativeType.toString());
			publishValue("cooperativeCount", fullData.cooperativeCount.toString());
			publishValue("activityType", fullData.activityType);
			publishValue("activityPlace", fullData.activityPlace);
			publishValue("taxingOfficeName", fullData.taxingOffice.name);
			publishValue("taxingOfficeID", fullData.taxingOffice.id.toString());
			if(fullData.licenseStartDate != null){
				publishValue("licenseStartDate", DOB.format(fullData.licenseStartDate.getTime()));
			}
			if(fullData.licenseEndDate != null){
				publishValue("licenseEndDate", DOB.format(fullData.licenseEndDate.getTime()));
			}
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc,_WebFormData webFormData, String lang) {

		
	}

}
