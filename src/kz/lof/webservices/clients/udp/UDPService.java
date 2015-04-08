/**
 * UDPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.udp;

public interface UDPService extends java.rmi.Remote {
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.HumanSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleSearchResult getDataBySRTS(java.lang.String srtsSerial, java.lang.String srtsNumber, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleSearchResult getDataByGRNZ(java.lang.String grnz, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleSearchResult getDataByOwnerId(long ownerId, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleFullData getDataByRegId(long srtsId, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByCodeRegion(kz.lof.webservices.store.udp.District[] distrcit, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.TSCountByOwnType[] getCountOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.TSCountByOwnType[] getCountOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.HumanSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.HumanSearchResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.TheftSearchResult getTheftData(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException;
}
