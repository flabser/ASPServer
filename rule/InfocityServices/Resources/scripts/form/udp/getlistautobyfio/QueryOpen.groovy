package form.udp.getlistautobyfio

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import kz.lof.webservices.clients.udp.*;
import kz.lof.webservices.store.udp.*;
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
		UDPServiceProxy proxy = new UDPServiceProxy(ses.user);
        boolean isTaxDepUser = ses.currentAppUser.listOfGroups.contains("[NKGroup]");
        def fid = webFormData.getValue("fid")
		try {
			VehicleSearchResult result = proxy.getDataByOwnerId(fid.toLong(), lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def user = ses.getCurrentAppUser()
			def actionBar = new _ActionBar(ses)
			if(user.hasRole("print")){
				actionBar.addAction(new _Action(getLocalizedWord("Распечатать",lang),getLocalizedWord("Распечатать",lang),"print"))
			}
			publishElement(actionBar)
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
					def entry = new _Tag("entry","");
					def grnz = new _Tag("grnz",it.grnz);
					entry.addTag(grnz);
					def model = new _Tag("model",it.model);
					entry.addTag(model);
					def color = new _Tag("color",it.color.name);
					entry.addTag(color);
					def year = new _Tag("year",it.year);
					entry.addTag(year);
					def srts = new _Tag("srts",it.srts);
					entry.addTag(srts);
					if(it.regDate != null && isTaxDepUser){
						def regdate = new _Tag("regdate", DOB.format(it.regDate.getTime()));
						tag.addTag(regdate);
					}else{
						def regdate = new _Tag("regdate","");
						tag.addTag(regdate);
					}
					def id = new _Tag("id"+i,it.id.toString());
					entry.addTag(id);
					tag.addTag(entry);
					i++;
				}
			}else{
			}
		} catch (RemoteException re) {
			println("Сервис недоступен");
		}
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc,_WebFormData webFormData, String lang) {

		
	}

}
