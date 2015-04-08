package page.reportstatisticservices

import java.util.Map;
import kz.nextbase.script.*;
import kz.nextbase.script.events._DoScript;
import kz.flabs.runtimeobj.*;

class DoScript extends _DoScript {
	
	@Override
	public void doProcess(_Session ses, Map<String, String[]> formData,	String lang) {
		
		def tag = new _Tag("root","")
		def user = formData.get("userid")[0]
		def page = formData.get("page")[0];
		//def offset = (page.toInteger() - 1) * 50
		//int[] types = [1012, 1007, 1008];
		//def act = ses.getUserActivity();
//		def activityarray  = act.getActivity (user, offset, 50,  types).getActivities();
		//def collection = act.getActivity (user, page.toInteger(), 50,  types);
		//def count = collection.getCount();
		//def currentpage = collection.getCurrentPage();
		//def maxpage = collection.getMaxPage();
		//def activityarray = collection.getEntries();
	//	def count = act.getActivity (user, offset, 50,  types).getCount();
	//	int currentpage = act.getActivity (user, offset, 50,  types).getActivities().getCurrentPage();
	//	def maxpage = act.getActivity (user, offset, 50,  types).getActivities().getMaxPage();
		//tag.setAttr("count",count);
		//tag.setAttr("currentpage",currentpage);
		//tag.setAttr("maxpage",maxpage);
		def userid = new _Tag("user",user)
		tag.addTag(userid)
		def xml = new _XMLDocument(tag)
		setContent(xml);
		try {
			
		} catch (Exception re) {
			println("Сервис недоступен");
		}
		
			//println(lang)
			
			
			
			
			
			
		
	}

    @Override
    void doProcess(_Session session, _WebFormData formData, String lang) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
