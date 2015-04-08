package form.social

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import kz.lof.webservices.clients.social.SocialServiceProxy
import kz.lof.webservices.store.social.HumanFullData
import kz.nextbase.script._Document;
import kz.nextbase.script._Session
import kz.nextbase.script._Tag
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
		SocialServiceProxy proxy = new SocialServiceProxy(ses.user); 
		def humanID = webFormData.getValue("humanid");
		println("Start");
		try {
			HumanFullData result = proxy.getHumanById(humanID.toInteger(), lang)
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			def user = ses.getCurrentAppUser()
			def actionBar = new _ActionBar(ses)
			if(user.hasRole("print")){
				actionBar.addAction(new _Action(getLocalizedWord("Распечатать",lang),getLocalizedWord("Распечатать",lang),"print"))
			}
			publishElement(actionBar)
			publishValue("fio",result.lastname + " " + result.firstname + " " + result.middlename);
			publishValue("familymembers",result.familyMembers.toString());
			publishValue("areareal",result.areaReal.toString());
			publishValue("areastandard",result.areaStandard.toString());
			publishValue("averageincome",result.averageIncome.toString());
			publishValue("tenpercent",result.tenPercent.toString());
			publishValue("invoiceamount",result.invoiceAmount.toString());
			publishValue("standardamount",result.standardAmount.toString());
			publishValue("allowanceamount",result.allowanceAmount.toString());
			publishValue("daterevalidation", DOB.format(result.dateRevalidation.getTime()));
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc, _WebFormData webFormData, String lang) {

		
	}

	

}
