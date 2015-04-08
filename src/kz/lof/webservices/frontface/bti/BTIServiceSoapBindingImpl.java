/**
 * BTIServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.bti;

import kz.lof.webservices.store.bti.RealtyShortData;
import org.apache.axis.MessageContext;
import kz.lof.webservices.clients.bti.BTIService;
import kz.lof.webservices.clients.bti.BTIServiceProxy;
import kz.flabs.users.User;

public class BTIServiceSoapBindingImpl implements kz.lof.webservices.frontface.bti.BTIService{
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException {
        BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getLog(date);
    }

    public kz.lof.webservices.store.bti.PersonSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
    }

    public RealtyShortData[] getDataByOwnerId(long ownerId, short ownerStatus, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByOwnerId(ownerId, ownerStatus, lang);
    }

    public kz.lof.webservices.store.bti.Street[] getAllStreets(java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAllStreets(lang);
    }

    public kz.lof.webservices.store.bti.RealtySearchResult getDataByAddress(int buildingKind, kz.lof.webservices.store.bti.Street street, java.lang.String house, java.lang.String flat, java.lang.String extras, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByAddress(buildingKind, street, house, flat, extras, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.bti.BuildingFullData getFullDataByDoc(long ownerId, short ownerStatus, int docId, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getFullDataByDoc(ownerId, ownerStatus, docId, lang);
    }

    public kz.lof.webservices.store.bti.BuildingFullData getDataByBuildingId(long buildingId, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByBuildingId(buildingId, lang);
    }

    public kz.lof.webservices.store.bti.BuildingKind[] getBuildingKinds(java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getBuildingKinds(lang);
    }

    public kz.lof.webservices.store.bti.PersonSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByIIN(iin, lang);
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

    public kz.lof.webservices.store.bti.PersonSearchResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.bti.Street[] getStreets(java.lang.String name, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getStreets(name, lang);
    }

    public kz.lof.webservices.store.bti.RealtySearchResult getDataByDoc(int docKind, int docType, java.lang.String docNumber, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByDoc(docKind, docType, docNumber, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.bti.DocKind[] getDocKinds(java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDocKinds(lang);
    }

    public kz.lof.webservices.store.bti.DocType[] getDocTypes(java.lang.String lang) throws java.rmi.RemoteException {
    	BTIService svc = new BTIServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDocTypes(lang);
    }

}
