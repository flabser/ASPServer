package page.udp

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByRegID extends _DoScript {
	
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
			
			def result = proxy.getHumanByFIO(firstname, lastname, middlename, isCitizen.toShort(), page.toInteger(), pagesize.toInteger(), lang)
			tag.setAttr("count",result.getTotalFound());
			def countelements;
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {					
					//msgBox ( DOB.format(it.birthDate.getTime()),"birthDate"+i);
					if(it.birthDate != null){
						def birthdate = new _Tag("birthDate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
						tag.addTag(birthdate)
					}else{
						def birthdate = new _Tag("birthDate"+i,"")
						tag.addTag(birthdate)
					}
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					//msgBox ( it.lastName + " " + it.firstName + " " + it.middleName   ,"fio"+i);
					def gender = new _Tag("gender"+i,it.gender.toString())
					tag.addTag(gender)
					//msgBox (it.gender.toString() ,"gender"+i);
					def numberid = new _Tag("numberid"+i,it.idDocument[0].number)
					tag.addTag(numberid)
					//msgBox (it.idDocument.number ,"numberid"+i);
					def nationality = new _Tag("nationality"+i,it.nationality.maleName)
					tag.addTag(nationality)
					//msgBox (it.nationality.maleName ,"nationality"+i);
					def iin = new _Tag("iin"+i,it.iin)
					tag.addTag(iin)
					//msgBox (it.iin ,"iin"+i);
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(iin)
					//msgBox ( it.id.toString()  ,"id"+i);
					countelements = i;
					i++;
				}
				tag.setAttr("countelements",countelements);
				//msgBox (result.getTotalFound().toString(),"count");
			}else{
				//msgBox ("0","count");
			}
			def xml = new _XMLDocument(tag)
			setContent(xml);
		} catch (Exception re) {
			//*********************Здесь println который принимает экземпляр Exception и который помимо печати в консоль добавляет XML контент с тектсом ошибки и стеком ошибки
			println(re);
			//*********************Здесь postActivity который принимает объект Exception
		}
		
	}

	

}
