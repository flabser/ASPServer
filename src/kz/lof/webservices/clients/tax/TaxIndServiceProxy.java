package kz.lof.webservices.clients.tax;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class TaxIndServiceProxy implements kz.lof.webservices.clients.tax.TaxIndService {
	private String _endpoint = null;
	private kz.lof.webservices.clients.tax.TaxIndService taxIndService = null;
	private User user = null;

	public TaxIndServiceProxy(User user) {
		this.user  = user;
		_initTaxIndServiceProxy();
	}

	public TaxIndServiceProxy(String endpoint) {
		_endpoint = endpoint;
		_initTaxIndServiceProxy();
	}

	private void _initTaxIndServiceProxy() {
		try {
			taxIndService = (new kz.lof.webservices.clients.tax.TaxIndServiceServiceLocator()).getTaxIndService();
			if (taxIndService != null) {
				((Stub)taxIndService)._setProperty("kz.lof.webservices.current_user", user);
				if (_endpoint != null)
					((javax.xml.rpc.Stub)taxIndService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)taxIndService)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (taxIndService != null)
			((javax.xml.rpc.Stub)taxIndService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public kz.lof.webservices.clients.tax.TaxIndService getTaxIndService() {
		if (taxIndService == null)
			_initTaxIndServiceProxy();
		return taxIndService;
	}

	public kz.lof.webservices.store.tax.TaxIndFullData getFullData(long indID, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxIndService == null)
			_initTaxIndServiceProxy();
		return taxIndService.getFullData(indID, lang);
	}

	public kz.lof.webservices.store.tax.TaxIndSearchResult getDataByRNN(java.lang.String rnn, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxIndService == null)
			_initTaxIndServiceProxy();
		return taxIndService.getDataByRNN(rnn, lang);
	}

	public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
		if (taxIndService == null)
			_initTaxIndServiceProxy();
		return taxIndService.testService();
	}

	public kz.lof.webservices.store.tax.TaxIndSearchResult getDataByFIO(java.lang.String lastName, java.lang.String firstName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxIndService == null)
			_initTaxIndServiceProxy();
		return taxIndService.getDataByFIO(lastName, firstName, middleName, pageNum, resultsOnPage, lang);
	}


}