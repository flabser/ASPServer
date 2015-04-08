/**
 * TaxIndServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.tax;

import org.apache.axis.MessageContext;
import kz.lof.webservices.clients.tax.TaxIndService;
import kz.lof.webservices.clients.tax.TaxIndServiceProxy;
import kz.flabs.users.User;

public class TaxIndServiceSoapBindingImpl implements kz.lof.webservices.frontface.tax.TaxIndService{
    public kz.lof.webservices.store.tax.TaxIndFullData getFullData(long indID, java.lang.String lang) throws java.rmi.RemoteException {
        TaxIndService svc = new TaxIndServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getFullData(indID, lang);
    }

    public kz.lof.webservices.store.tax.TaxIndSearchResult getDataByRNN(java.lang.String rnn, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxIndService svc = new TaxIndServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByRNN(rnn, lang);
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	TaxIndService svc = new TaxIndServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

    public kz.lof.webservices.store.tax.TaxIndSearchResult getDataByFIO(java.lang.String lastName, java.lang.String firstName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	TaxIndService svc = new TaxIndServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByFIO(lastName, firstName, middleName, pageNum, resultsOnPage, lang);
    }

}
