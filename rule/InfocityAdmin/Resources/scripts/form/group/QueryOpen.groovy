package form.group

import java.util.Map
import kz.nextbase.script.*
import kz.nextbase.script.events.*;
import kz.nextbase.script.struct.*

class QueryOpen extends _FormQueryOpen {


	@Override
	public void doQueryOpen(_Session ses, _WebFormData webFormData, String lang) {
		
	}

	@Override
	public void doQueryOpen(_Session ses, _Document doc, _WebFormData webFormData, String lang) {
		def group  = (_UserGroup)doc;
		publishValue("title",getLocalizedWord("Группа пользователей", lang) + " " + group.getName())
		publishValue("groupname", group.getName())
		publishValue("description", group.getDescription())
		publishEmployer("ownergroup", group.getOwner())
		publishEmployer("member", group.getListOfMembers())
		publishValue("role", group.getListOfRoles())
	}	
	
}