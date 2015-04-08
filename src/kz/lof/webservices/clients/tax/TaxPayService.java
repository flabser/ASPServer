/**
 * TaxPayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.tax;

public interface TaxPayService extends java.rmi.Remote {
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxPayerFullData[] getOrgsByAddresses(kz.lof.webservices.store.tax.Address[] addresses, java.util.Date fromDate, java.util.Date toDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxPayerFullData[] getDataByOrgNameGis(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByFIO(java.lang.String lastName, java.lang.String firstName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByRNN(java.lang.String rnn, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxPayerFullData getFullData(long payerId, short payerStatus, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.tax.TaxPayersSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException;
}
