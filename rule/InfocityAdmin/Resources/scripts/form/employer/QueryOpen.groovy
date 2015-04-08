package form.employer

import java.util.Map
import kz.nextbase.script.*
import kz.nextbase.script.events.*;
import kz.nextbase.script.struct.*

class QueryOpen extends _FormQueryOpen {


	@Override
	public void doQueryOpen(_Session ses, _WebFormData webFormData, String lang) {
		publishValue("organization", "avant")	
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc, _WebFormData webFormData, String lang) {
		def emp  = (_Employer)doc;
		publishValue("title",getLocalizedWord("Сотрудник", lang) + " " + emp.getFullName())
		publishValue("fullname", emp.getFullName())
		publishValue("shortname", emp.getShortName())
		publishValue("userid", emp.getUserID())
		publishValue("email", emp.getEmail())
		publishValue("instmsgaddress", emp.getInstMessengerAddr())
		def org = emp.getOrganization();
		publishValue("organization", org.getShortName())
		def dep = emp.getMainDepartment();
		publishValue("depid", dep.getShortName())
		publishValue("role", emp.getListOfRoles())
		publishValue("rank", emp.getRank())
		publishValue("phone", emp.getPhone())
		publishValue("sendto", emp.getSendto())
		publishValue("comment", emp.getComment())
		publishValue("group", emp.getListOfGroups())
		publishValue("replacer", emp.getFullName())
		publishValue("index", emp.getFullName())
		publishValue("apps", emp.getEnabledApps())
		publishValue("post", emp.getPostID(), emp.getPost())  
		
	}

	
	
}