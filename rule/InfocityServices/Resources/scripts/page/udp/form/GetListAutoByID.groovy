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

class GetListAutoByID extends _DoScript {
	
	@Override
	public void doProcess(_Session session, _WebFormData formData,	String lang) {
		UDPServiceProxy proxy = new UDPServiceProxy(session.user);
		def fid = formData.get("fid")[0]
		try {
			VehicleSearchResult result = proxy.getDataByOwnerId(fid.toLong(), lang);
            boolean isTaxDepUser = session.currentAppUser.listOfGroups.contains("[NKGroup]");
            def tag = new _Tag("root","")
			def srtsid;
			tag.setAttr("count",result.getTotalFound());
			def getfulldataccess = new _Tag("getfulldataccess",session.currentAppUser.hasRole("UDPService -> getDataByRegId").toString());
			tag.addTag(getfulldataccess);
			if (result.getTotalFound() != 0){
				def i = 1;
				result.getShortData().each {
					DateFormat DOB = new SimpleDateFormat("dd.MM.yyyy");
					def entry = new _Tag("entry","");
					def grnz = new _Tag("grnz",it.grnz);
					entry.addTag(grnz);
					def model = new _Tag("model",it.model);
					entry.addTag(model);
					def color = new _Tag("color",it.color.name);
					entry.addTag(color);
					def year = new _Tag("year",it.year);
					entry.addTag(year);
					def srtstag = new _Tag("srts",it.srts);
					srtsid = it.id;
					entry.addTag(srtstag);
					def statustag = new _Tag("status",it.status);
					entry.addTag(statustag);
                    if(isTaxDepUser){
                    	def regdate = new _Tag("regdate", DOB.format(it.regDate.getTime()))
                    	entry.addTag(regdate)
						if(it.status == 1){
	                        def regenddate = new _Tag("uregdate", DOB.format(it.regEndDate.getTime()))
	                        entry.addTag(regenddate)
						}else{
	                        def regenddate = new _Tag("regenddate", DOB.format(it.regEndDate.getTime()))
	                        entry.addTag(regenddate)
	                       
						}
                    }

					def id = new _Tag("id",it.id.toString());
					entry.addTag(id);
					tag.addTag(entry);
					i++;
				}
				VehicleFullData fulldata = proxy.getDataByRegId(srtsid, lang);
				def owner =  new _Tag("owner",fulldata.owner.lastName + " " + fulldata.owner.firstName + " " + fulldata.owner.middleName);
				tag.addTag(owner);
			}else{
			}
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