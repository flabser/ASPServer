/**
 * ForeignersSearchServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.ump;

import org.apache.axis.MessageContext;
import kz.lof.webservices.clients.ump.ForeignersSearchService;
import kz.lof.webservices.clients.ump.ForeignersSearchServiceProxy;
import kz.flabs.users.User;

public class ForeignersSearchServiceSoapBindingImpl implements kz.lof.webservices.frontface.ump.ForeignersSearchService{
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException {
        ForeignersSearchService svc = new ForeignersSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getLog(date);
    }

    public kz.lof.webservices.store.ump.PersonSearchResult getPersonByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	ForeignersSearchService svc = new ForeignersSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getPersonByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.PersonSearchResult getPersonByDoc(java.lang.String serial, java.lang.String number, java.lang.String lang) throws java.rmi.RemoteException {
    	ForeignersSearchService svc = new ForeignersSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getPersonByDoc(serial, number, lang);
    }

    public kz.lof.webservices.store.ump.PersonFullData getFullData(long id, java.lang.String lang) throws java.rmi.RemoteException {
    	ForeignersSearchService svc = new ForeignersSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getFullData(id, lang);
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	ForeignersSearchService svc = new ForeignersSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

}
