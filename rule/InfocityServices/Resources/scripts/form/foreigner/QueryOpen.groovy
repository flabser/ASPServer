package form.foreigner

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import kz.lof.webservices.clients.ump.ForeignersSearchServiceProxy
import kz.lof.webservices.store.ump.HumanFullData
import kz.lof.webservices.store.ump.Nationality;
import kz.lof.webservices.store.ump.PersonFullData;
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
		ForeignersSearchServiceProxy proxy = new ForeignersSearchServiceProxy(ses.user);
		def fid = webFormData.getValue("fid")
		println("Start");
		try {
			PersonFullData fullData = proxy.getFullData(fid.toLong(), lang);
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			def user = ses.getCurrentAppUser()
			def actionBar = new _ActionBar(ses)
			if(user.hasRole("print")){
				actionBar.addAction(new _Action(getLocalizedWord("Распечатать",lang),getLocalizedWord("Распечатать",lang),"print"))
			}
			publishElement(actionBar)
			publishValue("firstname", fullData.basicData.firstName);
			publishValue("middlename", fullData.basicData.middleName);
			publishValue("lastname", fullData.basicData.lastName);
			publishValue("birthdate", DOB.format(fullData.basicData.birthDate.getTime()));
			publishValue("docnumber", fullData.basicData.getIdDocument().getNumber());
			publishValue("docserial", fullData.basicData.getIdDocument().getSerial());
			publishValue("gender", fullData.basicData.gender.value.toString());
			if (fullData.basicData.gender.value.toString() == '1'){
				publishValue("nationality", fullData.basicData.nationality.maleName);
			}else{
				publishValue("nationality", fullData.basicData.nationality.femaleName);
			}
			publishValue("origin", fullData.basicData.origin.name);
			publishValue("citizenship", fullData.basicData.citizenship.name);
			
			publishValue("tmpregnumber", fullData.visitData[0].regLicenseNumber);
			if(fullData.visitData[0].regStartDate != null){
				publishValue("regstartdate", DOB.format(fullData.visitData[0].regStartDate.getTime()));
			}
			if(fullData.visitData[0].regEndDate != null){
				publishValue("regenddate", DOB.format(fullData.visitData[0].regEndDate.getTime()));
			}
			publishValue("visitpurpose", fullData.visitData[0].purpose.name);
			publishValue("numofchildren", fullData.visitData[0].childCount.toString());
			publishValue("visaserial", fullData.visitData[0].visaSerial);
			publishValue("visanumber", fullData.visitData[0].visaNumber);
			publishValue("visarecurrence", fullData.visitData[0].visaRatio);
			if(fullData.visitData[0].regStartDate != null){
				publishValue("visadate", DOB.format(fullData.visitData[0].regStartDate.getTime()));
			}
			if(fullData.visitData[0].regStartDate != null){
				publishValue("visastartdate", DOB.format(fullData.visitData[0].regStartDate.getTime()));
			}
			if(fullData.visitData[0].regEndDate != null){
				publishValue("visaendadate", DOB.format(fullData.visitData[0].regEndDate.getTime()));
			}
			publishValue("city", fullData.visitData[0].address.city.name);
			publishValue("district", fullData.visitData[0].address.district.name);
			publishValue("street", fullData.visitData[0].address.street.name);
			publishValue("house", fullData.visitData[0].address.house);
			publishValue("flat", fullData.visitData[0].address.flat);
			publishValue("id", fullData.basicData.id.toString());
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc,_WebFormData webFormData, String lang) {

		
	}

}
