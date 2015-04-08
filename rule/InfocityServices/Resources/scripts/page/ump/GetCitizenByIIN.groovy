package page.ump

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetCitizenByIIN extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		HumansSearchServiceProxy proxy = new HumansSearchServiceProxy(session.user); 
		try {
			String iin = formData.get("iin")[0];
			def result = proxy.getCitizenByIIN(iin, lang)
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("HumansSearchService -> getFullData").toString());
			tag.addTag(getfulldataccess);
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
//					def serialid = new _Tag("serialid"+i,it.idDocument[0].serial)
//					tag.addTag(serialid)
					if (it.gender.toString() == '1'){
						def nationality = new _Tag("nationality"+i,it.nationality.maleName);
						tag.addTag(nationality)
					}else{
						def nationality = new _Tag("nationality"+i,it.nationality.femaleName);
						tag.addTag(nationality)
					}
					def rezultiin = new _Tag("iin"+i,it.iin)
					tag.addTag(rezultiin)
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
