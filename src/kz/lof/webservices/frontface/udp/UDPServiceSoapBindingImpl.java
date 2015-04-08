/**
 * UDPServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.udp;

import org.apache.axis.MessageContext;
import kz.lof.webservices.clients.udp.UDPService;
import kz.lof.webservices.clients.udp.UDPServiceProxy;
import kz.lof.webservices.store.udp.TSCountByOwnType;
import kz.flabs.users.User;

public class UDPServiceSoapBindingImpl implements kz.lof.webservices.frontface.udp.UDPService{
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException {
        UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getLog(date);
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleSearchResult getDataBySRTS(java.lang.String srtsSerial, java.lang.String srtsNumber, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataBySRTS(srtsSerial, srtsNumber, lang);
    }

    public kz.lof.webservices.store.udp.VehicleSearchResult getDataByGRNZ(java.lang.String grnz, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByGRNZ(grnz, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleSearchResult getDataByOwnerId(long ownerId, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByOwnerId(ownerId, lang);
    }

    public kz.lof.webservices.store.udp.VehicleFullData getDataByRegId(long srtsId, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByRegId(srtsId, lang);
    }

    public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMarkAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMarkAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoYearAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoYearAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByCodeRegion(kz.lof.webservices.store.udp.District[] distrcit, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoDrivLicByCodeRegion(distrcit, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoDrivLicByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoOwnerTSByCodeRegion(district, pageNum, resultsOnPage, lang);
    }

    public TSCountByOwnType[] getCountOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
    }

    public TSCountByOwnType[] getCountOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountOwnerTSByCodeRegion(district, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoTypeAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoTypeAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByIIN(iin, lang);
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.udp.TheftSearchResult getTheftData(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPService svc = new UDPServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getTheftData(grnz, lang);
    }

}
