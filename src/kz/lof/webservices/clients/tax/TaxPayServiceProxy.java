package kz.lof.webservices.clients.tax;

import org.apache.axis.client.Stub;
import kz.flabs.users.User;

public class TaxPayServiceProxy implements kz.lof.webservices.clients.tax.TaxPayService {
	private String _endpoint = null;
	private kz.lof.webservices.clients.tax.TaxPayService taxPayService = null;
	private User user = null;

	public TaxPayServiceProxy(User user) {
		this.user  = user;
		_initTaxPayServiceProxy();
	}

	public TaxPayServiceProxy(String endpoint) {
		_endpoint = endpoint;
		_initTaxPayServiceProxy();
	}

	private void _initTaxPayServiceProxy() {
		try {
			taxPayService = (new kz.lof.webservices.clients.tax.TaxPayServiceServiceLocator()).getTaxPayService();
			if (taxPayService != null) {
				((Stub)taxPayService)._setProperty("kz.lof.webservices.current_user", user);
				if (_endpoint != null)
					((javax.xml.rpc.Stub)taxPayService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)taxPayService)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (taxPayService != null)
			((javax.xml.rpc.Stub)taxPayService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public kz.lof.webservices.clients.tax.TaxPayService getTaxPayService() {
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService;
	}

	public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getLog(date);
	}

	public kz.lof.webservices.store.tax.TaxPayerFullData[] getOrgsByAddresses(kz.lof.webservices.store.tax.Address[] addresses, java.util.Date fromDate, java.util.Date toDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getOrgsByAddresses(addresses, fromDate, toDate, pageNum, resultsOnPage, lang);
	}

	public kz.lof.webservices.store.tax.TaxPayerFullData[] getDataByOrgNameGis(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getDataByOrgNameGis(orgName, pageNum, resultsOnPage, lang);
	}

	public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
	}

	public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByFIO(java.lang.String lastName, java.lang.String firstName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getDataByFIO(lastName, firstName, middleName, pageNum, resultsOnPage, lang);
	}

	public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByRNN(java.lang.String rnn, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getDataByRNN(rnn, lang);
	}

	public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.testService();
	}

	public kz.lof.webservices.store.tax.TaxPayerFullData getFullData(long payerId, short payerStatus, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getFullData(payerId, payerStatus, lang);
	}

	public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException{
		if (taxPayService == null)
			_initTaxPayServiceProxy();
		return taxPayService.getDataByIIN(iin, lang);
	}


}