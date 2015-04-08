package page.bti.form

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.bti.BTIServiceProxy
import kz.lof.webservices.store.bti.BuildingFullData
import kz.lof.webservices.store.bti.RealtySearchResult
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class BuildingData extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		BTIServiceProxy proxy = new BTIServiceProxy(session.user);
		def ownerid = formData.get("ownerid")[0];
		def ownerstatus = formData.get("ownerstatus")[0];
		def docid = formData.get("docid")[0];
		try {
			BuildingFullData result = proxy.getFullDataByDoc(ownerid.toLong(), ownerstatus.toShort(), docid.toInteger(), lang)
			DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
			def tag = new _Tag("root","")
			def user = ses.getCurrentAppUser()
			if(user.hasRole("print")){
				def hasprint =  new _Tag("hasprint","true");
				tag.addTag(hasprint);
			}
			
			def bkind = new _Tag("bkind",result.BKind.name);
			tag.addTag(bkind);
			def block = new _Tag("block",result.block);
			tag.addTag(block);
			def gkzblock = new _Tag("gkzblock",result.gkzBlock);
			tag.addTag(gkzblock);
			def cadnumber = new _Tag("cadnumber",result.cadNumber);
			tag.addTag(cadnumber);
			def landnumber = new _Tag("landnumber",result.landNumber);
			tag.addTag(landnumber);
			def byear = new _Tag("byear",result.BYear);
			tag.addTag(byear);
			def storeys = new _Tag("storeys",result.storeys);
			tag.addTag(storeys);
			def walls = new _Tag("walls",result.walls.name);
			tag.addTag(walls);
			def flats = new _Tag("flats",result.flats);
			tag.addTag(flats);
			def overallsquare = new _Tag("overallsquare",result.overallSquare);
			tag.addTag(overallsquare);
			def livingsquare = new _Tag("livengsquare",result.livingSquare);
			tag.addTag(livingsquare);

            if(result.apartments.length > 0){
                def apartments =  new _Tag("apartments","");
                def partKind = new _Tag("partkind",result.apartments[0].partKind.name);
                apartments.addTag(partKind);
                def partLetter = new _Tag("partletter",result.apartments[0].partLetter);
                apartments.addTag(partLetter);
                def partName = new _Tag("partname",result.apartments[0].partName.name);
                apartments.addTag(partName);
                def partWalls = new _Tag("partwalls",result.apartments[0].partWalls.name);
                apartments.addTag(partWalls);
                def partYear = new _Tag("partyear",result.apartments[0].partYear);
                apartments.addTag(partYear);
                def phone = new _Tag("phone",result.apartments[0].phone);
                apartments.addTag(phone);
                def PLiveSquare = new _Tag("plivesquare",result.apartments[0].PLiveSquare);
                apartments.addTag(PLiveSquare);
                def POverallSquare = new _Tag("poverallsquare",result.apartments[0].POverallSquare);
                apartments.addTag(POverallSquare);
                def premises = new _Tag("premises",result.apartments[0].premises.toString());
                apartments.addTag(premises);
                def rooms = new _Tag("rooms",result.apartments[0].rooms.toString());
                apartments.addTag(rooms);
                tag.addTag(apartments);
            }
			
			def document =  new _Tag("document","");
			def dockind = new _Tag("dockind",result.document.docKind.name);
			document.addTag(dockind);
			def doctype = new _Tag("doctype",result.document.docType.name);
			document.addTag(doctype);
			def docnumber = new _Tag("docnumber",result.document.docNumber);
			document.addTag(docnumber);
			if(result.document.docDate != null){
				def docdate = new _Tag("docdate", DOB.format(result.document.docDate.getTime()));
				document.addTag(docdate);
			}else{
				def docdate = new _Tag("docdate", "");
				document.addTag(docdate);
			}
			if(result.document.docRegDate != null){
				def docregdate = new _Tag("docregdate", DOB.format(result.document.docRegDate.getTime()));
				document.addTag(docregdate);
			}else{
				def docregdate = new _Tag("docregdate","");
				document.addTag(docregdate);
			}
			def propform = new _Tag("propform",result.document.propForm.name);
			document.addTag(propform);
			def propkind = new _Tag("propkind",result.document.propKind.name);
			document.addTag(propkind);
			def limitauthority = new _Tag("limitauthority",result.document.limitAuthority);
			document.addTag(limitauthority);
			def limitperson = new _Tag("limitperson",result.document.limitPerson);
			document.addTag(limitperson);
			def limitcondition = new _Tag("limitcondition",result.document.limitCondition);
			document.addTag(limitcondition);
			def purpose = new _Tag("purpose",result.document.purpose.name);
			document.addTag(purpose);
			tag.addTag(document);
			
			def owner =  new _Tag("owner","");
			def ownerlastname = new _Tag("lastname",result.document.owner.lastName);
			owner.addTag(ownerlastname);
			def ownerfirstname = new _Tag("firstname",result.document.owner.firstName);
			owner.addTag(ownerfirstname);
			def ownermiddlename = new _Tag("middlename",result.document.owner.middleName);
			owner.addTag(ownermiddlename);
			if(result.document.owner.birthDate != null){
				def ownerbirthdate = new _Tag("birthdate", DOB.format(result.document.owner.birthDate.getTime()));
				document.addTag(ownerbirthdate);
			}else{
				def ownerbirthdate = new _Tag("birthdate", "");
				document.addTag(ownerbirthdate);
			}
			def ownerrnn = new _Tag("rnn",result.document.owner.rnn);
			owner.addTag(ownerrnn);
			def owneriin = new _Tag("iin",result.document.owner.iin);
			owner.addTag(owneriin);
			def owneraddress = new _Tag("address",result.document.owner.address);
			owner.addTag(owneraddress);
			def ownercountry = new _Tag("country",result.document.owner.country.shortName);
			owner.addTag(ownercountry);
			def ownertypeid = new _Tag("typeid",result.document.owner.idDocument.type.name);
			owner.addTag(ownertypeid);
			def ownernumberid = new _Tag("numberid",result.document.owner.idDocument.number);
			owner.addTag(ownernumberid);
			def ownerauthorityid = new _Tag("authorityid",result.document.owner.idDocument.authority);
			owner.addTag(ownerauthorityid);
			def ownerphonenumber = new _Tag("phonenumber",result.document.owner.phone);
			owner.addTag(ownerphonenumber);
			tag.addTag(owner);

			def region = new _Tag("region", result.getAddress().getRegion().getName());
			tag.addTag(region);
			def city = new _Tag("city", result.getAddress().getCity().getName());
			tag.addTag(city);
			def street = new _Tag("street", result.getAddress().getStreet().getName());
			tag.addTag(street);
			def house = new _Tag("house", result.getAddress().getHouse());
			tag.addTag(house);
			
			
			
			def xml = new _XMLDocument(tag)
			setContent(xml);
		}catch (Exception re) {
			re.printStackTrace()
		}
		
	}
}