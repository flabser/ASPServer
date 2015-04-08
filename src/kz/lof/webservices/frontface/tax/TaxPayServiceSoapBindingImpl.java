/**
 * TaxPayServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.tax;

import java.rmi.RemoteException;

import org.apache.axis.MessageContext;
import kz.lof.webservices.clients.tax.TaxPayService;
import kz.lof.webservices.clients.tax.TaxPayServiceProxy;
import kz.lof.webservices.store.tax.TaxPayerFullData;
import kz.flabs.users.User;

public class TaxPayServiceSoapBindingImpl implements kz.lof.webservices.frontface.tax.TaxPayService{
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException {
        TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getLog(date);
    }

    public kz.lof.webservices.store.tax.TaxPayerFullData[] getOrgsByAddresses(kz.lof.webservices.store.tax.Address[] addresses, java.util.Date fromDate, java.util.Date toDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getOrgsByAddresses(addresses, fromDate, toDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.tax.TaxPayerFullData getFullData(long payerId, short payerStatus, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getFullData(payerId, payerStatus, lang);
    }

    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByIIN(iin, lang);
    }

    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByRNN(java.lang.String rnn, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByRNN(rnn, lang);
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByFIO(java.lang.String lastName, java.lang.String firstName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByFIO(lastName, firstName, middleName, pageNum, resultsOnPage, lang);
    } 

	public TaxPayerFullData[] getDataByOrgNameGis(String orgName, int pageNum,
			int resultsOnPage, String lang) throws RemoteException {
		TaxPayService svc = new TaxPayServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByOrgNameGis(orgName, pageNum, resultsOnPage, lang);
	}

}
