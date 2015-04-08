package form.reportstatistics

import java.rmi.RemoteException;
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import kz.lof.webservices.tax.*
import kz.lof.webservices.tax.store.*
import kz.nextbase.script._Document;
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler
import kz.nextbase.script.events._FormQueryOpen;
import kz.nextbase.script._UserActivity;


class QueryOpen extends  _FormQueryOpen { 
	/*@Override
	public void doQueryOpen(_Session session, Map<String, String[]> formData,	String lang) {
		def user = formData.get("userid")[0]
		int[] types = [1012, 1007, 1008];
		def act = session.getUserActivity();
		def activityarray  = act.getActivity (user, 0, 50,  types);
		try {
			activityarray.each {
				publishValue("activity", it.toXML());
			}
		
		} catch (Exception re) {
			println("Сервис недоступен");
		}
	}
	*/

	@Override
	public void doQueryOpen(_Session ses, _WebFormData webFormData, String lang) {
		def user = formData.getValue("userid"); 
		int[] types = [1012, 1007, 1008];
		def act = session.getUserActivity();
		def activityarray  = act.getActivity (user, 0, 50,  types);
		try {
			activityarray.each {
				publishValue("activity", it.toXML());
			}
		
		} catch (Exception re) {
			println("Сервис недоступен");
		}
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc,
			_WebFormData webFormData, String lang) {
		// TODO Auto-generated method stub
		
	}

}
