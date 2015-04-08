package form.citizen

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.lof.webservices.store.ump.HumanFullData
import kz.nextbase.script._Document;
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler
import kz.nextbase.script.events._FormQueryOpen;
import kz.nextbase.script.actions.*
import kz.nextbase.script.events.*;
import kz.nextbase.script.constants.*
import kz.flabs.dataengine.ActivityStatusType


class QueryOpen extends  _FormQueryOpen {

	
	@Override
	public void doQueryOpen(_Session ses, _WebFormData webFormData, String lang) {
			HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(ses.user); 
		def fid = webFormData.getValue("fid")
		println("Start");
		try {
			HumanFullData fullData = proxy.getFullData(fid.toLong(), lang);
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			if(fullData.regStartDate != null){
				publishValue("regstartdate", DOB.format(fullData.regStartDate.getTime()));
			}
			if(fullData.regEndDate != null){
				publishValue("regenddate", DOB.format(fullData.regEndDate.getTime()));
			}
			def user = ses.getCurrentAppUser()
			def actionBar = new _ActionBar(ses)
			if(user.hasRole("print")){
				actionBar.addAction(new _Action(getLocalizedWord("Распечатать",lang),getLocalizedWord("Распечатать",lang),"print"))
			}
			publishElement(actionBar)
			publishValue("firstname", fullData.firstName);
			publishValue("middlename", fullData.middleName);
			publishValue("relationship", fullData.relationship.name);
			publishValue("regtype", fullData.regType.name);
			publishValue("lastname", fullData.lastName);
			publishValue("id", fullData.id.toString());
			publishValue("address", fullData.address.street.name +" "+ fullData.address.house + " ��." + fullData.address.flat);
			publishValue("city", fullData.address.city.name);
			publishValue("district", fullData.address.district.name);
			publishValue("street", fullData.address.street.name);
			publishValue("house", fullData.address.house);
			publishValue("flat", fullData.address.flat);
			publishValue("camefromregion", fullData.cameFrom.region.name);
			publishValue("camefromcity", fullData.cameFrom.city.name);
			publishValue("camefromdistrict", fullData.cameFrom.district.name);
			publishValue("camefromstreet", fullData.cameFrom.street.name);
			publishValue("camefromhouse", fullData.cameFrom.house);
			publishValue("camefromflat", fullData.cameFrom.flat);
			publishValue("gonetoregion", fullData.goneTo.region.name);
			publishValue("gonetocity", fullData.goneTo.city.name);
			publishValue("gonetodistrict", fullData.goneTo.district.name);
			publishValue("gonetostreet", fullData.goneTo.street.name);
			publishValue("gonetohouse", fullData.goneTo.house);
			publishValue("gonetoflat", fullData.goneTo.flat);
			publishValue("regoffice", fullData.regOffice);
			
			publishValue("rnn", fullData.rnn);
			publishValue("iin", fullData.iin);
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc, _WebFormData webFormData, String lang) {

		
	}

	

}
