package kz.lof.webservices.clients.ump;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class ForeignersSearchServiceProxy implements kz.lof.webservices.clients.ump.ForeignersSearchService {
	private String _endpoint = null;
	private kz.lof.webservices.clients.ump.ForeignersSearchService foreignersSearchService = null;
	private User user = null;

	public ForeignersSearchServiceProxy(User user) {
		this.user  = user;
		_initForeignersSearchServiceProxy();
	}

	public ForeignersSearchServiceProxy(String endpoint) {
		_endpoint = endpoint;
		_initForeignersSearchServiceProxy();
	}

	private void _initForeignersSearchServiceProxy() {
		try {
			foreignersSearchService = (new kz.lof.webservices.clients.ump.ForeignersSearchServiceServiceLocator()).getForeignersSearchService();
			if (foreignersSearchService != null) {
				((Stub)foreignersSearchService)._setProperty("kz.lof.webservices.current_user", user);
				if (_endpoint != null)
					((javax.xml.rpc.Stub)foreignersSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)foreignersSearchService)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (foreignersSearchService != null)
			((javax.xml.rpc.Stub)foreignersSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public kz.lof.webservices.clients.ump.ForeignersSearchService getForeignersSearchService() {
		if (foreignersSearchService == null)
			_initForeignersSearchServiceProxy();
		return foreignersSearchService;
	}

	public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException{
		if (foreignersSearchService == null)
			_initForeignersSearchServiceProxy();
		return foreignersSearchService.getLog(date);
	}

	public kz.lof.webservices.store.ump.PersonSearchResult getPersonByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
		if (foreignersSearchService == null)
			_initForeignersSearchServiceProxy();
		return foreignersSearchService.getPersonByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
	}

	public kz.lof.webservices.store.ump.PersonSearchResult getPersonByDoc(java.lang.String serial, java.lang.String number, java.lang.String lang) throws java.rmi.RemoteException{
		if (foreignersSearchService == null)
			_initForeignersSearchServiceProxy();
		return foreignersSearchService.getPersonByDoc(serial, number, lang);
	}

	public kz.lof.webservices.store.ump.PersonFullData getFullData(long id, java.lang.String lang) throws java.rmi.RemoteException{
		if (foreignersSearchService == null)
			_initForeignersSearchServiceProxy();
		return foreignersSearchService.getFullData(id, lang);
	}

	public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
		if (foreignersSearchService == null)
			_initForeignersSearchServiceProxy();
		return foreignersSearchService.testService();
	}


}