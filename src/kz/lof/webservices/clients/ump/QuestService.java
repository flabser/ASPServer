/**
 * QuestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.ump;

public interface QuestService extends java.rmi.Remote {
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.WantedResult searchPeople(kz.lof.webservices.store.ump.WantedData[] peopleList, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
}
