/**
 * BTIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.bti;

import kz.lof.webservices.store.bti.RealtyShortData;

public interface BTIService extends java.rmi.Remote {
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.PersonSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.PersonSearchResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.Street[] getStreets(java.lang.String name, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.RealtySearchResult getDataByDoc(int docKind, int docType, java.lang.String docNumber, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.DocKind[] getDocKinds(java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.DocType[] getDocTypes(java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.PersonSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public RealtyShortData[] getDataByOwnerId(long ownerId, short ownerStatus, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.Street[] getAllStreets(java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.RealtySearchResult getDataByAddress(int buildingKind, kz.lof.webservices.store.bti.Street street, java.lang.String house, java.lang.String flat, java.lang.String extras, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.BuildingFullData getFullDataByDoc(long ownerId, short ownerStatus, int docId, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.BuildingFullData getDataByBuildingId(long buildingId, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.bti.BuildingKind[] getBuildingKinds(java.lang.String lang) throws java.rmi.RemoteException;
}
