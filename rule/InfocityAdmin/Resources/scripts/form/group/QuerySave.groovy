package form.group

import java.util.ArrayList;
import java.text.SimpleDateFormat
import java.util.Map
import kz.nextbase.script.*
import kz.nextbase.script.events.*;
import kz.nextbase.script.struct.*
import kz.nextbase.script._Helper;

class QuerySave extends _FormQuerySave {

	@Override
	public void doQuerySave(_Session ses, _Document doc, _WebFormData webFormData, String lang) {

		//println(webFormData)
		
		boolean v = validate(webFormData)
		if(v == false){
			stopSave()
			return;
		}

		def group  = (_UserGroup)doc;
		group.setGroupName(webFormData.getValueSilently("groupname"));
		group.setDescription(webFormData.getValueSilently("description"));
		group.setOwner(webFormData.getValueSilently("ownergroup"));
		group.resetMembers();
		group.setListOfMembers(webFormData.getListOfValuesSilently("members"));
		group.setListOfRoles(webFormData.getListOfValuesSilently("role"));
		group.setViewText(group.getName());
		group.addViewText(group.getName());
		group.setViewDate(new Date());
	}

	def validate(_WebFormData formData){

		if (formData.getValueSilently("groupname") == ""){
			localizedMsgBox("Поле \"Название группы\" не заполнено.");
			return false;
		}		
		/*if (formData.getValueSilently("members") == ""){
			localizedMsgBox("Поле \"Участники группы\" не заполнено.");
			return false;
		}	*/	
		return true;
		
	}
}
