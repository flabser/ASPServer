package kz.lof.webservices.clients.udp;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class UDPServiceProxy implements kz.lof.webservices.clients.udp.UDPService {
	private String _endpoint = null;
	private kz.lof.webservices.clients.udp.UDPService uDPService = null;
	private User user = null;

	public UDPServiceProxy(User user) {
		this.user  = user;
		_initUDPServiceProxy();
	}
  
  public UDPServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUDPServiceProxy();
  }
  
  private void _initUDPServiceProxy() {
    try {
      uDPService = (new kz.lof.webservices.clients.udp.UDPServiceServiceLocator()).getUDPService();
      if (uDPService != null) {
    	  ((Stub)uDPService)._setProperty("kz.lof.webservices.current_user", user);
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uDPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uDPService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uDPService != null)
      ((javax.xml.rpc.Stub)uDPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kz.lof.webservices.clients.udp.UDPService getUDPService() {
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService;
  }
  
  public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getLog(date);
  }
  
  public kz.lof.webservices.store.udp.HumanSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleSearchResult getDataBySRTS(java.lang.String srtsSerial, java.lang.String srtsNumber, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getDataBySRTS(srtsSerial, srtsNumber, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleSearchResult getDataByGRNZ(java.lang.String grnz, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getDataByGRNZ(grnz, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleSearchResult getDataByOwnerId(long ownerId, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getDataByOwnerId(ownerId, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleFullData getDataByRegId(long srtsId, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getDataByRegId(srtsId, lang);
  }
  
  public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getCountAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getCountAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getMarkAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getMarkAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoYearAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoYearAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByCodeRegion(kz.lof.webservices.store.udp.District[] distrcit, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoDrivLicByCodeRegion(distrcit, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoDrivLicByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoOwnerTSByCodeRegion(district, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.TSCountByOwnType[] getCountOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getCountOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.TSCountByOwnType[] getCountOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getCountOwnerTSByCodeRegion(district, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoTypeAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getInfoTypeAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.testService();
  }
  
  public kz.lof.webservices.store.udp.HumanSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getDataByIIN(iin, lang);
  }
  
  public kz.lof.webservices.store.udp.HumanSearchResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.udp.TheftSearchResult getTheftData(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException{
    if (uDPService == null)
      _initUDPServiceProxy();
    return uDPService.getTheftData(grnz, lang);
  }
  
  
}