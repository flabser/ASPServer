package page.udp.form

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.udp.UDPServiceProxy
import kz.lof.webservices.store.udp.VehicleFullData;
import kz.lof.webservices.store.udp.VehicleSearchResult
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType;

class GetDataByRegID extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		UDPServiceProxy proxy = new UDPServiceProxy(session.user);
        boolean isTaxDepUser = session.currentAppUser.listOfGroups.contains("[NKGroup]");
        def srts = formData.get("srts")[0]
		try {
			VehicleFullData fulldata = proxy.getDataByRegId(srts.toLong(), lang);
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			def tag = new _Tag("root","");
			def grnz = new _Tag("grnz",fulldata.grnz);
			tag.addTag(grnz);
			def resultsrts = new _Tag("srts",fulldata.srts);
			tag.addTag(resultsrts);
			def model = new _Tag("model",fulldata.model);
			tag.addTag(model);
			def color = new _Tag("color",fulldata.color.name);
			tag.addTag(color);
			def year = new _Tag("year",fulldata.year);
			tag.addTag(year);
			def status = new _Tag("status",fulldata.status.toString());
			tag.addTag(status);
			if (fulldata.regDate != null && isTaxDepUser){
				def regdate = new _Tag("regdate", DOB.format(fulldata.regDate.getTime()))
				tag.addTag(regdate)
			}
			if (fulldata.regEndDate != null && isTaxDepUser){
				def regenddate = new _Tag("regenddate", DOB.format(fulldata.regEndDate.getTime()))
				tag.addTag(regenddate)
			}
			def comments = new _Tag("comments", isTaxDepUser ? fulldata.comments : "")
			tag.addTag(comments)
			def prevgrnz = new _Tag("prevgrnz", fulldata.prevGrnz)
			tag.addTag(prevgrnz)
			def prevsrts = new _Tag("prevsrts", fulldata.prevSrts)
			tag.addTag(prevsrts)
			def bodyno = new _Tag("bodyno", fulldata.bodyNo)
			tag.addTag(bodyno)
			def chassisno = new _Tag("chassisno", fulldata.chassisNo)
			tag.addTag(chassisno)
			def engineno = new _Tag("engineno", fulldata.engineNo)
			tag.addTag(engineno)
			def volume = new _Tag("volume", isTaxDepUser ? fulldata.volume : "")
			tag.addTag(volume)
			def hp = new _Tag("hp", isTaxDepUser ? fulldata.hp : "")
			tag.addTag(hp)
			def load = new _Tag("load", isTaxDepUser ? fulldata.load : "")
			tag.addTag(load)
			def seats = new _Tag("seats", isTaxDepUser ? fulldata.seats : "")
			tag.addTag(seats);
			def ownertag =  new _Tag("owner","");
			def lastname = new _Tag("lastname", fulldata.owner.lastName)
			ownertag.addTag(lastname)
			def firstname = new _Tag("firstname", fulldata.owner.firstName)
			ownertag.addTag(firstname)
			def middlename = new _Tag("middlename", fulldata.owner.middleName)
			ownertag.addTag(middlename)
			if (fulldata.owner.birthDate != null){
				def birthdate = new _Tag("birthdate", DOB.format(fulldata.owner.birthDate.getTime()))
				ownertag.addTag(birthdate)
			}
			def rnn = new _Tag("rnn", fulldata.owner.rnn)
			ownertag.addTag(rnn)
			def iin = new _Tag("iin", fulldata.owner.iin)
			ownertag.addTag(iin)
			def region = new _Tag("region", fulldata.owner.address.region.name)
			ownertag.addTag(region)
			def district = new _Tag("district", fulldata.owner.address.district.name)
			ownertag.addTag(district)
			def city = new _Tag("city", fulldata.owner.address.city)
			ownertag.addTag(city)
			def street = new _Tag("street", fulldata.owner.address.street)
			ownertag.addTag(street)
			def house = new _Tag("house", fulldata.owner.address.house)
			ownertag.addTag(house)
			def flat = new _Tag("flat", fulldata.owner.address.flat)
			ownertag.addTag(flat)
			tag.addTag(ownertag)
			def checkupstag =  new _Tag("sheckups","");
			def checkups = fulldata.checkups
			checkups.each{
				def entry =  new _Tag("entry","");
				def type = new _Tag("type", it.type)
				entry.addTag(type)
				if (it.date != null){
					def date = new _Tag("date", DOB.format(it.date.getTime()))
					entry.addTag(date)
				}
				def place = new _Tag("place", it.place)
				entry.addTag(place)
				def checker = new _Tag("checker", it.checker)
				entry.addTag(checker)
				def certno = new _Tag("certno", it.certNo)
				entry.addTag(certno)
				def ticketno = new _Tag("ticketno", it.ticketNo)
				entry.addTag(ticketno)
				def edkno = new _Tag("edkno", it.edkNo)
				entry.addTag(edkno)
				checkupstag.addTag(entry)
			}
			tag.addTag(checkupstag)
			def taxtag =  new _Tag("tax","");
			def tax = fulldata.taxes
			tax.each{
				def entry =  new _Tag("entry","");
				def privtype = new _Tag("privtype", it.privType)
				entry.addTag(privtype)
				def docserial = new _Tag("docserial", it.docSerial)
				entry.addTag(docserial)
				def docnumber = new _Tag("docnumber", it.docNumber)
				entry.addTag(docnumber)
				if (it.startDate != null){
					def startdate = new _Tag("startdate", DOB.format(it.startDate.getTime()))
					entry.addTag(startdate)
				}
				if (it.endDate != null){
					def enddate = new _Tag("enddate", DOB.format(it.endDate.getTime()))
					entry.addTag(enddate)
				}
				taxtag.addTag(entry)
			}
			tag.addTag(taxtag)
			def trusttag =  new _Tag("trust","");
			def trust = fulldata.trusts
			trust.each{
				def entry =  new _Tag("entry","");
				def type = new _Tag("type", isTaxDepUser ? it.type.name : "")
				entry.addTag(type)
				def number = new _Tag("number", it.number)
				entry.addTag(number)
				if (it.startDate != null && isTaxDepUser){
					def startdate = new _Tag("startdate", DOB.format(it.startDate.getTime()))
					entry.addTag(startdate)
				}
				if (it.endDate != null && isTaxDepUser){
					def enddate = new _Tag("enddate", DOB.format(it.endDate.getTime()))
					entry.addTag(enddate)
				}
				if (it.birthDate != null && isTaxDepUser){
					def trustbirthdate = new _Tag("birthdate", DOB.format(it.birthDate.getTime()))
					entry.addTag(trustbirthdate)
				}
				def fio = new _Tag("fio", isTaxDepUser ? it.lastName + " " + it.firstName + " " + it.middleName : "")
				entry.addTag(fio)
				def address = new _Tag("address", isTaxDepUser ? it.address : "")
				entry.addTag(address)
				trusttag.addTag(entry)
			}
			tag.addTag(trusttag)
			def user = ses.getCurrentAppUser()
			if(user.hasRole("print")){
				def hasprint =  new _Tag("hasprint","true");
				tag.addTag(hasprint);
			}
			def xml = new _XMLDocument(tag)
			setContent(xml);
		}catch (Exception re) {
			println(re);
		}
		
	}
}