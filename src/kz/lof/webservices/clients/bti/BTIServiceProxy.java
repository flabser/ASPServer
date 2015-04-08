package kz.lof.webservices.clients.bti;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class BTIServiceProxy implements BTIService {
  private String _endpoint = null;
  private BTIService bTIService = null;
  private User user = null;
  
  public BTIServiceProxy(User user) {
      this.user  = user;
    _initBTIServiceProxy();
  }
  
  public BTIServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBTIServiceProxy();
  }
  
  private void _initBTIServiceProxy() {
    try {
      bTIService = (new BTIServiceServiceLocator()).getBTIService();
      if (bTIService != null) {
          ((Stub)bTIService)._setProperty("kz.lof.webservices.current_user", user);
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bTIService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bTIService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bTIService != null)
      ((javax.xml.rpc.Stub)bTIService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public BTIService getBTIService() {
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService;
  }
  
  public String[] getLog(java.util.Date date) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getLog(date);
  }
  
  public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.testService();
  }
  
  public kz.lof.webservices.store.bti.RealtySearchResult getDataByDoc(int docKind, int docType, String docNumber, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDataByDoc(docKind, docType, docNumber, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.bti.DocKind[] getDocKinds(String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDocKinds(lang);
  }
  
  public kz.lof.webservices.store.bti.DocType[] getDocTypes(String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDocTypes(lang);
  }
  
  public kz.lof.webservices.store.bti.Street[] getStreets(String name, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getStreets(name, lang);
  }
  
  public kz.lof.webservices.store.bti.PersonSearchResult getDataByIIN(String iin, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDataByIIN(iin, lang);
  }
  
  public kz.lof.webservices.store.bti.PersonSearchResult getDataByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.bti.Street[] getAllStreets(String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getAllStreets(lang);
  }
  
  public kz.lof.webservices.store.bti.PersonSearchResult getDataByOrgName(String orgName, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.bti.RealtySearchResult getDataByAddress(int buildingKind, kz.lof.webservices.store.bti.Street street, String house, String flat, String extras, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDataByAddress(buildingKind, street, house, flat, extras, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.bti.RealtyShortData[] getDataByOwnerId(long ownerId, short ownerStatus, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDataByOwnerId(ownerId, ownerStatus, lang);
  }
  
  public kz.lof.webservices.store.bti.BuildingFullData getFullDataByDoc(long ownerId, short ownerStatus, int docId, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getFullDataByDoc(ownerId, ownerStatus, docId, lang);
  }
  
  public kz.lof.webservices.store.bti.BuildingKind[] getBuildingKinds(String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getBuildingKinds(lang);
  }
  
  public kz.lof.webservices.store.bti.BuildingFullData getDataByBuildingId(long buildingId, String lang) throws java.rmi.RemoteException{
    if (bTIService == null)
      _initBTIServiceProxy();
    return bTIService.getDataByBuildingId(buildingId, lang);
  }
  
  
}