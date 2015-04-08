package kz.lof.webservices.clients.ump;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class QuestServiceProxy implements kz.lof.webservices.clients.ump.QuestService {
	private String _endpoint = null;
	private kz.lof.webservices.clients.ump.QuestService questService = null;
	private User user = null;

	public QuestServiceProxy(User user) {
		this.user  = user;
		_initQuestServiceProxy();
	}

	public QuestServiceProxy(String endpoint) {
		_endpoint = endpoint;
		_initQuestServiceProxy();
	}

	private void _initQuestServiceProxy() {
		try {
			questService = (new kz.lof.webservices.clients.ump.QuestServiceServiceLocator()).getQuestService();
			if (questService != null) {
				((Stub)questService)._setProperty("kz.lof.webservices.current_user", user);
				if (_endpoint != null)
					((javax.xml.rpc.Stub)questService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)questService)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (questService != null)
			((javax.xml.rpc.Stub)questService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public kz.lof.webservices.clients.ump.QuestService getQuestService() {
		if (questService == null)
			_initQuestServiceProxy();
		return questService;
	}

	public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
		if (questService == null)
			_initQuestServiceProxy();
		return questService.testService();
	}

	public kz.lof.webservices.store.ump.WantedResult searchPeople(kz.lof.webservices.store.ump.WantedData[] peopleList, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
		if (questService == null)
			_initQuestServiceProxy();
		return questService.searchPeople(peopleList, pageNum, resultsOnPage, lang);
	}


}