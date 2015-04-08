package page.tax.reg

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.tax.TaxPayServiceProxy
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByIIN extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		TaxPayServiceProxy proxy = new TaxPayServiceProxy(session.user); 
		try {
			String iin = formData.get("iin")[0];
			def validator = _Validator.checkIIN_kz(iin)
			def result = proxy.getDataByIIN(iin,lang);
			def tag = new _Tag("root","")
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("TaxPayService -> getFullData").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {					
					def realAddress = new _Tag("realaddress"+i,it.realAddress.street.name + " "+ it.realAddress.house.toString() +" " + it.realAddress.flat.toString())
					tag.addTag(realAddress)
					def regAddress = new _Tag("regaddress"+i,it.regAddress.street.name + " "+ it.regAddress.house.toString() +" " + it.regAddress.flat.toString())
					tag.addTag(regAddress)
					if(it.birthDate != null){
						def birthdate = new _Tag("birthdate"+i,_Helper.getDateAsStringShort(it.birthDate.getTime()))
						tag.addTag(birthdate)
					}else{
						def birthdate = new _Tag("birthdate"+i,"")
						tag.addTag(birthdate)
					}
					def rnn = new _Tag("rnn"+i,it.rnn)
					tag.addTag(rnn)
					def resultiin = new _Tag("iin"+i,it.iin)
					tag.addTag(resultiin)
					def fio = new _Tag("fio"+i,it.lastName + " " + it.firstName + " " + it.middleName)
					tag.addTag(fio)
					def id = new _Tag("id"+i,it.id.toString())
					tag.addTag(id)
					def phone = new _Tag("phone"+i,it.phone)
					tag.addTag(phone)
					def status = new _Tag("status"+i,it.status)
					tag.addTag(status)
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
