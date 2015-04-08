package page.ump.form

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.ump.ForeignersSearchServiceProxy;
import kz.lof.webservices.store.ump.Nationality;
import kz.lof.webservices.store.ump.PersonFullData;
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetForeignerByID extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		ForeignersSearchServiceProxy proxy = new ForeignersSearchServiceProxy(session.user);
		def fid = formData.get("fid")[0]
		try {
			PersonFullData fullData = proxy.getFullData(fid.toLong(), lang);
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			def tag = new _Tag("root","")
			
			def firstname = new _Tag("firstname",fullData.basicData.firstName);
			tag.addTag(firstname);
			def middleName = new _Tag("middlename",fullData.basicData.middleName);
			tag.addTag(middleName);
			def lastName = new _Tag("lastname",fullData.basicData.lastName);
			tag.addTag(lastName);
			def docnumber = new _Tag("docnumber",fullData.basicData.idDocument.number);
			tag.addTag(docnumber);
			def docserial = new _Tag("docserial",fullData.basicData.idDocument.serial);
			tag.addTag(docserial);
			if (fullData.basicData.gender.value.toString() == '1'){
				def gender = new _Tag("gender","Мужской");
				tag.addTag(gender);
			}else{
				def gender = new _Tag("gender","Женский");
				tag.addTag(gender);
			}
			if(fullData.basicData.birthDate != null){
				def birthdate = new _Tag("birthdate",DOB.format(fullData.basicData.birthDate.getTime()));
				tag.addTag(birthdate);
			}
			if (fullData.basicData.gender.value.toString() == '1'){
				def nationality = new _Tag("nationality",fullData.basicData.nationality.maleName);
				tag.addTag(nationality);
			}else{
				def nationality = new _Tag("nationality",fullData.basicData.nationality.femaleName);
				tag.addTag(nationality);
			}
			def origin = new _Tag("origin",fullData.basicData.origin.name);
			tag.addTag(origin);
			def citizenship = new _Tag("citizenship",fullData.basicData.citizenship.name);
			tag.addTag(citizenship);
			def visit =  new _Tag("visit","");
			fullData.visitData.each{
				def entry = new _Tag("entry","");
				def tmpregnumber = new _Tag("tmpregnumber",it.regLicenseNumber);
				entry.addTag(tmpregnumber);
				if(it.regStartDate != null){
					def regstartdate = new _Tag("regstartdate",DOB.format(it.regStartDate.getTime()));
					entry.addTag(regstartdate);
				}
				if(it.regEndDate != null){
					def regenddate = new _Tag("regenddate",DOB.format(it.regEndDate.getTime()));
					entry.addTag(regenddate);
				}
				def numofchildren = new _Tag("numofchildren",it.childCount.toString());
				entry.addTag(numofchildren);
				def visaserial = new _Tag("visaserial",it.visaSerial);
				entry.addTag(visaserial);
				def visitpurpose = new _Tag("visitpurpose",it.purpose.name);
				entry.addTag(visitpurpose);
				def visaissuer = new _Tag("visaissuer",it.visaAuthority);
				entry.addTag(visaissuer);
				def visanumber = new _Tag("visanumber",it.visaNumber);
				entry.addTag(visanumber);
				def visarecurrence = new _Tag("visarecurrence",it.visaRatio);
				entry.addTag(visarecurrence);
				if(it.regStartDate != null){
					def visadate = new _Tag("visadate",DOB.format(it.regStartDate.getTime()));
					entry.addTag(visadate);
				}
				if(it.visaStartDate != null){
					def visastartdate = new _Tag("visastartdate",DOB.format(it.visaStartDate.getTime()));
					entry.addTag(visastartdate);
				}
				if(it.visaGetDate != null){
					def visagetday = new _Tag("visagetday",DOB.format(it.visaGetDate.getTime()));
					entry.addTag(visagetday);
				}
				if(it.visaEndDate != null){
					def visaenddate = new _Tag("visaenddate",DOB.format(it.visaEndDate.getTime()));
					entry.addTag(visaenddate);
				}
				def city = new _Tag("city",it.address.city.name);
				entry.addTag(city);
				def district = new _Tag("district",it.address.district.name);
				entry.addTag(district);
				def street = new _Tag("street",it.address.street.name);
				entry.addTag(street);
				def house = new _Tag("house",it.address.house);
				entry.addTag(house);
				def flat = new _Tag("flat",it.address.flat);
				entry.addTag(flat);
				def livingplace = new _Tag("livingplace",it.livingPlace);
				entry.addTag(livingplace);
				visit.addTag(entry)
			}
			tag.addTag(visit)
			def user = ses.getCurrentAppUser()
			if(user.hasRole("print")){
				def hasprint =  new _Tag("hasprint","true");
				tag.addTag(hasprint);
			}
			def id=new _Tag("id", fullData.basicData.id.toString());
			tag.addTag(id)
			def xml = new _XMLDocument(tag)
			setContent(xml);
		}catch (Exception re) {
			println(re);
		}
		
	}
}