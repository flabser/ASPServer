/**
 * QuestServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.ump;

import org.apache.axis.MessageContext;

import kz.lof.webservices.clients.ump.QuestService;
import kz.lof.webservices.clients.ump.QuestServiceProxy;
import kz.flabs.users.User;

public class QuestServiceSoapBindingImpl implements kz.lof.webservices.frontface.ump.QuestService{
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	QuestService svc = new QuestServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

    public kz.lof.webservices.store.ump.WantedResult searchPeople(kz.lof.webservices.store.ump.WantedData[] peopleList, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	QuestService svc = new QuestServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
    	return svc.searchPeople(peopleList, pageNum, resultsOnPage, lang);
    }

}
