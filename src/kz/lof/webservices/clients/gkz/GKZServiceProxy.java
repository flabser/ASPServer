package kz.lof.webservices.clients.gkz;

import org.apache.axis.client.Stub;

import kz.flabs.users.User;

public class GKZServiceProxy implements kz.lof.webservices.clients.gkz.GKZService {
  private String _endpoint = null;
  private kz.lof.webservices.clients.gkz.GKZService gKZService = null;
  private User user = null;
  
  public GKZServiceProxy() {
    _initGKZServiceProxy();
  }
  
  public GKZServiceProxy(User user) {
      this.user  = user;
      _initGKZServiceProxy();
  }
  
  public GKZServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGKZServiceProxy();
  }
  
  private void _initGKZServiceProxy() {
    try {
      gKZService = (new kz.lof.webservices.clients.gkz.GKZServiceServiceLocator()).getGKZService();
      if (gKZService != null) {
          ((Stub)gKZService)._setProperty("kz.lof.webservices.current_user", user);
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gKZService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gKZService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gKZService != null)
      ((javax.xml.rpc.Stub)gKZService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kz.lof.webservices.clients.gkz.GKZService getGKZService() {
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService;
  }
  
  public kz.lof.webservices.store.gkz.StreetSearchResult getStreet(java.lang.String name, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getStreet(name, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.gkz.HumanShortDataResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.gkz.CompanyShortDataResult getDataByCompany(java.lang.String companyName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getDataByCompany(companyName, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.gkz.QuarterSearchResult getDataQuarter(kz.lof.webservices.store.gkz.District district, java.lang.String nameQuarter, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getDataQuarter(district, nameQuarter, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.gkz.LandShortDataResult getDataByDocument(int actType, java.lang.String series, java.lang.String number, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getDataByDocument(actType, series, number, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.gkz.LandShortDataResult getDataShort(int ownerId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getDataShort(ownerId, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.gkz.LandFullData getLandFullData(int idRight) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getLandFullData(idRight);
  }
  
  public kz.lof.webservices.store.gkz.LandShortDataResult getDataByCadastrNumber(java.lang.String cadastrNumber, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getDataByCadastrNumber(cadastrNumber, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.gkz.RegionSearchResult getRegion(int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException{
    if (gKZService == null)
      _initGKZServiceProxy();
    return gKZService.getRegion(pageNum, resultsOnPage, lang);
  }
  
  
}