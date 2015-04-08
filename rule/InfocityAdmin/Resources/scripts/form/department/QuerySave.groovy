package form.department

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

		println(webFormData)
		
		boolean v = validate(webFormData)
		if(v == false){
			stopSave()
			return;
		}

		def dep  = (_Department)doc;
		dep.setParent(webFormData.getListOfValues("parentsubkey"), webFormData.getValue("parentdocid"), webFormData.getValue("parentdoctype"))
		dep.setFullName(webFormData.getValueSilently("fullname"));
		dep.setShortName(webFormData.getValueSilently("shortname"));
		dep.setComment(webFormData.getValueSilently("comment"));
		dep.setRank(webFormData.getNumberValueSilently("rank",999));
		dep.setIndex(webFormData.getValueSilently("index"));
			
		dep.setViewText(dep.getFullName());

	}

	def validate(_WebFormData formData){

		if (formData.getValueSilently("fullname") == ""){
			localizedMsgBox("���� \"��������\" �� ���������");
			return false;
		}else if (formData.getValueSilently("shortname") == ""){
			localizedMsgBox("���� \"����������� ��������\" �� ���������");
			return false;
		}		
		return true;
		
	}
}
