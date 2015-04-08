package page.bti

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.bti.BTIServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByIIN extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		BTIServiceProxy proxy = new BTIServiceProxy(session.user); 
		try {
			String iin = formData.get("iin")[0];
			def result = proxy.getDataByIIN(iin, lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("BTIService -> getDataByOwnerId").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					if(it.birthDate != null){
						def birthdate = new _Tag("birthdate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
						tag.addTag(birthdate)
					}else{
						def birthdate = new _Tag("birthdate"+i,"")
						tag.addTag(birthdate)
					}
					def rnn = new _Tag("rnn"+i,it.rnn)
					tag.addTag(rnn)
					def doctype = new _Tag("doctype"+i,it.idDocument.type.name)
					tag.addTag(doctype)
					def docnumber = new _Tag("docnumber"+i,it.idDocument.number)
					tag.addTag(docnumber)
					def regAddress = new _Tag("address"+i,it.address)
					tag.addTag(regAddress)
					def resultiin = new _Tag("iin"+i,it.iin)
					tag.addTag(resultiin)
					def status = new _Tag("status"+i,it.status.toString())
					tag.addTag(status)
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(id)
					i++;
					
				}
			}else{
			}
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}

	

}
