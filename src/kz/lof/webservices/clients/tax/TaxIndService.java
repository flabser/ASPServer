/**
 * TaxIndService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.tax;

public interface TaxIndService extends java.rmi.Remote {
    public kz.lof.webservices.store.tax.TaxIndFullData getFullData(long indID, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxIndSearchResult getDataByFIO(java.lang.String lastName, java.lang.String firstName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxIndSearchResult getDataByRNN(java.lang.String rnn, java.lang.String lang) throws java.rmi.RemoteException;
}
