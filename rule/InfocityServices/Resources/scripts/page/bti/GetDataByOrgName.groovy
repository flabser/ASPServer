package page.bti

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.bti.BTIServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByOrgName extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		BTIServiceProxy proxy = new BTIServiceProxy(session.user); 
		try {
			String orgname = formData.get("orgname")[0];
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]
			
			def result = proxy.getDataByOrgName(orgname, page.toInteger(), pagesize.toInteger(), lang);
			def tag = new _Tag("root","");
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("BTIService -> getDataByOwnerId").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					def lastname = new _Tag("lastname"+i,it.lastName)
					tag.addTag(lastname)
					def rnn = new _Tag("rnn"+i,it.rnn)
					tag.addTag(rnn)
					def regAddress = new _Tag("address"+i,it.address)
					tag.addTag(regAddress)
					def phone = new _Tag("phone"+i,it.phone)
					tag.addTag(phone)
					def bank = new _Tag("bank"+i,it.bank)
					tag.addTag(bank)
					def account = new _Tag("account"+i,it.account)
					tag.addTag(account)
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
