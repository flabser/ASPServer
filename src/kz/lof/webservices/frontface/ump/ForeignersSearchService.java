/**
 * ForeignersSearchService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.ump;

public interface ForeignersSearchService extends java.rmi.Remote {
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.PersonFullData getFullData(long id, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.PersonSearchResult getPersonByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.PersonSearchResult getPersonByDoc(java.lang.String serial, java.lang.String number, java.lang.String lang) throws java.rmi.RemoteException;
}
