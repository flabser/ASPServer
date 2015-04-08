package form.employer
import kz.nextbase.script._Document
import kz.nextbase.script._Session
import kz.nextbase.script._Validator
import kz.nextbase.script._WebFormData
import kz.nextbase.script.events._FormQuerySave
import kz.nextbase.script.struct._Employer
import kz.nextbase.script.struct._UserApplicationProfile

class QuerySave extends _FormQuerySave {

	@Override
	public void doQuerySave(_Session ses, _Document doc, _WebFormData webFormData, String lang) {

		println(webFormData)
		
		boolean v = validate(webFormData)
		if(v == false){
			stopSave()
			return;
		}

		def emp  = (_Employer)doc;
		emp.setUserID(webFormData.getValueSilently("userid"));
		emp.setFullName(webFormData.getValueSilently("fullname"));
		emp.setShortName(webFormData.getValueSilently("shortname"));
		emp.setComment(webFormData.getValueSilently("comment"));
		emp.setIndex(webFormData.getValueSilently("index"));
		emp.setRank(webFormData.getValueSilently("rank"));
		emp.setPhone(webFormData.getValueSilently("phone"));
		emp.setPostID(webFormData.getValueSilently("post"));
		emp.setSendTo(webFormData.getValueSilently("sendto"));
		emp.setObl(webFormData.getValueSilently("obl"));
		emp.setRegion(webFormData.getValueSilently("region"));
		emp.setVillage(webFormData.getValueSilently("village"));
		emp.setListOfRoles(webFormData.getListOfValuesSilently("role"));
        emp.setPasswordHash(webFormData.getValueSilently("password"));
		emp.setEmail(webFormData.getValueSilently("email"));
		emp.setMessenger(webFormData.getValueSilently("instmsgaddress"));		
		emp.setDepID(webFormData.getValueSilently("depid"));
		
		def apps = webFormData.getListOfValuesSilently("enabledapps");
		def lm = webFormData.getListOfValuesSilently("loginmode");
		//String[] apps = ["Workflow","Support2"]
		//String[] lm = ["0","0"]
		if (apps.length > 0){
			emp.clearEnabledAppsList();
			for(int i = 0; i < apps.length; i++){
				if (!apps[i].equals("")){
					def profile = new _UserApplicationProfile(apps[i],lm[i]);
					if(profile.needQuestAnsw()){
						profile.addQuestionAnswer((String[])webFormData.getListOfValuesSilently("question_" + profile.getAppName()), (String[])webFormData.getListOfValuesSilently("answer_" + profile.getAppName()));
					}
					emp.addEnabledApp(profile);
				}
			}
		}

		emp.setViewText(emp.getFullName());

	}

	def validate(_WebFormData formData){
		def valemail = _Validator.checkEmail(formData.getValueSilently("email"));
		def valphone = _Validator.checkPhoneNumber_kz(formData.getValueSilently("phone"));
		
		if (formData.getValueSilently("userid") == ""){
			localizedMsgBox("Поле \"UserID\" не заполнено.");
			return false;
		}
		if (formData.getValueSilently("post") == ""){
			localizedMsgBox("Поле \"Должность\" не заполнено.");
			return false;
		}
		if (formData.getValueSilently("shortname") == ""){
			localizedMsgBox("Поле \"Сокращенное имя\" не заполнено.");
			return false;
		}
		if (formData.getValueSilently("fullname") == ""){
			localizedMsgBox("Поле \"Полное имя\" не заполнено.");
			return false;
		}
		if  (formData.getValueSilently("email") != "" && !valemail){
			localizedMsgBox("Поле \"Email\" заполнено неверно .");
			return false;
		}
		if  (formData.getValueSilently("phone") != "" && !valphone){
			localizedMsgBox("Поле \"Телефон\" заполнено неверно .");
			return false;
		}
		return true;
		
	}
}
