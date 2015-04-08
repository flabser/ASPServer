package page.ump

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetHumanByFIO extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user); 
		try {
			String firstname = formData.get("firstname")[0];
			String middlename = formData.get("middlename")[0];
			String lastname = formData.get("lastname")[0];
			String isCitizen = formData.get("iscitizen")[0];
			String page = formData.get("page")[0]
			String pagesize = formData.get("pagesize")[0]
			
			def tag = new _Tag("root","")
			def result = proxy.getHumanByFIO(firstname, lastname, middlename, page.toInteger(),  pagesize.toInteger(), lang)
			tag.setAttr("count",result.getTotalFound().toString());
			if(isCitizen == '1'){
				def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("HumansSearchService -> getFullData").toString());
				tag.addTag(getfulldataccess);
			}else{
				def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("ForeignersSearchService -> getFullData").toString());
				tag.addTag(getfulldataccess);
			}
			def countelements;
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {					
					def birthdate = new _Tag("birthdate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
					tag.addTag(birthdate)
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					def gendervalue = it.gender.toString();
					if (gendervalue == '1'){
						gendervalue = "Мужской";
					}else{
						gendervalue = "Женский";
					}
					def gender = new _Tag("gender"+i,gendervalue)
					tag.addTag(gender)
					def numberid = new _Tag("numberid"+i,it.idDocument[0].number)
					tag.addTag(numberid)
					if (it.gender.toString() == '1'){
						def nationality = new _Tag("nationality"+i,it.nationality.maleName);
						tag.addTag(nationality)
					}else{
						def nationality = new _Tag("nationality"+i,it.nationality.femaleName);
						tag.addTag(nationality)
					}
					def iin = new _Tag("iin"+i,it.iin)
					tag.addTag(iin)
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(id);
					countelements = i;
					i++;
				}
				tag.setAttr("countelements",countelements);
			}else{
			}
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			println(re);
		}
		
	}
}
