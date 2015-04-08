package page.bti.form

import java.text.DateFormat
import java.text.SimpleDateFormat
import kz.lof.webservices.clients.bti.BTIServiceProxy
import kz.lof.webservices.store.bti.BuildingFullData;
import kz.lof.webservices.store.bti.RealtySearchResult;
import kz.lof.webservices.store.bti.RealtyShortData;
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;
import kz.flabs.dataengine.ActivityStatusType

class GetDataByOwnerId extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		BTIServiceProxy proxy = new BTIServiceProxy(session.user);
		def ownerID = formData.getValue("ownerid");
		def ownerStatus = formData.getValue("ownerstatus")[0];
		try {
			RealtyShortData[] result = proxy.getDataByOwnerId(ownerID.toLong(), ownerStatus.toShort(), lang)
			def tag = new _Tag("root","")
			def buildings =  new _Tag("buildings","");
			def user = ses.getCurrentAppUser()
			if(user.hasRole("print")){
				def hasprint =  new _Tag("hasprint","true");
				tag.addTag(hasprint);
			}
			result.each{
				DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
				def entry = new _Tag("entry","");
				def dkind = new _Tag("dkind",it.DKind.name);
				entry.addTag(dkind);
				def dtype = new _Tag("dtype",it.DType.name);
				entry.addTag(dtype);
				def dnumber = new _Tag("dnumber",it.DNumber);
				entry.addTag(dnumber);
				def ownerid = new _Tag("ownerid",it.ownerId);
				entry.addTag(ownerid);
				def ownerstatus= new _Tag("ownerstatus",it.ownerStatus);
				entry.addTag(ownerstatus);
				def docid = new _Tag("docid",it.docId);
				entry.addTag(docid);
				if(it.DRegDate != null){
					def dregdate = new _Tag("dregdate", DOB.format(it.DRegDate.getTime()))
					entry.addTag(dregdate);
				}else{
					def dregdate = new _Tag("dregdate", "")
					entry.addTag(dregdate);
				}
				def bkind = new _Tag("bkind",it.buildingKind.name);
				entry.addTag(bkind);
				def bstreet = new _Tag("bstreet",it.address.street.name);
				entry.addTag(bstreet);
				def bhouse = new _Tag("bhouse",it.address.house);
				entry.addTag(bhouse);
				def bflat = new _Tag("bflat",it.address.flat);
				entry.addTag(bflat);
				buildings.addTag(entry);
				
			}
			tag.addTag(buildings);

            if(result.length > 0){

                def ownerFirstName = new _Tag("firstname",result[0].OFirstName);
                tag.addTag(ownerFirstName);
                def ownerLastName = new _Tag("lastname",result[0].OLastName);
                tag.addTag(ownerLastName);
                def ownerMiddleName = new _Tag("middlename",result[0].OMiddleName);
                tag.addTag(ownerMiddleName);
                def owner = new _Tag("owner",result[0].OLastName + " " + result[0].OFirstName + " " + result[0].OMiddleName );
                tag.addTag(owner);
            }
			def xml = new _XMLDocument(tag)
			setContent(xml);
			//act.postActivity("service_getDataByOwnerId_BTI","id=" + ownerID)
		}catch (Exception re) {
			println(re);
		}
		
	}
}