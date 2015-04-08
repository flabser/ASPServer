/**
 * GKZService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.gkz;

public interface GKZService extends java.rmi.Remote {
    public kz.lof.webservices.store.gkz.StreetSearchResult getStreet(java.lang.String name, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.HumanShortDataResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.CompanyShortDataResult getDataByCompany(java.lang.String companyName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.QuarterSearchResult getDataQuarter(kz.lof.webservices.store.gkz.District district, java.lang.String nameQuarter, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.LandShortDataResult getDataByDocument(int actType, java.lang.String series, java.lang.String number, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.LandShortDataResult getDataShort(int ownerId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.LandFullData getLandFullData(int idRight) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.LandShortDataResult getDataByCadastrNumber(java.lang.String cadastrNumber, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.gkz.RegionSearchResult getRegion(int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
}