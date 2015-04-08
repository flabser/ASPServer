package page.ump

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.ump.ForeignersSearchServiceProxy
import kz.lof.webservices.store.ump.Street
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetForeignerByADDR extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		ForeignersSearchServiceProxy proxy = new ForeignersSearchServiceProxy(session.user);
		try {
			String street = formData.get("street")[0];
			String house = formData.get("house")[0];
			String flat = formData.get("flat")[0];
			Street streetid = new Street();
	//street.setId(1);
			streetid.setName(street)
			String isCitizen = formData.get("iscitizen")[0];
			def result = proxy.getPerso(streetid, house, flat, 1, 100, lang)
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("ForeignersSearchService -> getFullData").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {					
					def birthdate = new _Tag("birthdate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
					tag.addTag(birthdate)
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					def gendervalue = it.gender.toString();
					if (gendervalue == 1){
						gendervalue = "Мужской";
					}else{
						gendervalue = "Женский";
					}
					def gender = new _Tag("gender"+i,gendervalue)
					tag.addTag(gender)
					def numberid = new _Tag("numberid"+i,it.idDocument[0].number)
					tag.addTag(numberid)
					if (gendervalue == 1){
						def nationality = new _Tag("nationality"+i,it.nationality.maleName);
						tag.addTag(nationality)
					}else{
						def nationality = new _Tag("nationality"+i,it.nationality.femaleName);
						tag.addTag(nationality)
					}
					def citizenship  = new _Tag("citizenship"+i,it.citizenship.name)
					tag.addTag(citizenship)
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
