/**
 * BTIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.bti;

public interface BTIService extends java.rmi.Remote {
    public String[] getLog(java.util.Date date) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.RealtySearchResult getDataByDoc(int docKind, int docType, String docNumber, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.DocKind[] getDocKinds(String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.DocType[] getDocTypes(String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.Street[] getStreets(String name, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.PersonSearchResult getDataByIIN(String iin, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.PersonSearchResult getDataByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.Street[] getAllStreets(String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.PersonSearchResult getDataByOrgName(String orgName, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.RealtySearchResult getDataByAddress(int buildingKind, kz.lof.webservices.store.bti.Street street, String house, String flat, String extras, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.RealtyShortData[] getDataByOwnerId(long ownerId, short ownerStatus, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.BuildingFullData getFullDataByDoc(long ownerId, short ownerStatus, int docId, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.BuildingKind[] getBuildingKinds(String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.BuildingFullData getDataByBuildingId(long buildingId, String lang) throws java.rmi.RemoteException;
}
