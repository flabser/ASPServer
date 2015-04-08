package kz.lof.webservices.clients.social;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class SocialServiceProxy implements SocialService {
  private User user;
  private String _endpoint = null;
  private SocialService socialService = null;
  
  public SocialServiceProxy() {
    _initSocialServiceProxy();
  }

  public SocialServiceProxy(User user) {
      this.user = user;
      _initSocialServiceProxy();
  }
  
  public SocialServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSocialServiceProxy();
  }
  
  private void _initSocialServiceProxy() {
    try {
      socialService = (new SocialServiceServiceLocator()).getSocialService();
      if (socialService != null) {
          ((Stub)socialService)._setProperty("kz.lof.webservices.current_user", user);
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)socialService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)socialService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (socialService != null)
      ((javax.xml.rpc.Stub)socialService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SocialService getSocialService() {
    if (socialService == null)
      _initSocialServiceProxy();
    return socialService;
  }
  
  public kz.lof.webservices.store.social.HumanFullData getHumanById(int idPerson, String lang) throws java.rmi.RemoteException{
    if (socialService == null)
      _initSocialServiceProxy();
    return socialService.getHumanById(idPerson, lang);
  }
  
  public kz.lof.webservices.store.social.Street[] getStreets(String name, String lang) throws java.rmi.RemoteException{
    if (socialService == null)
      _initSocialServiceProxy();
    return socialService.getStreets(name, lang);
  }
  
  public kz.lof.webservices.store.social.HumanSearchResult getHumanByAddress(kz.lof.webservices.store.social.Address[] addresses, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (socialService == null)
      _initSocialServiceProxy();
    return socialService.getHumanByAddress(addresses, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.social.HumanSearchResult getHumanByDistrict(kz.lof.webservices.store.social.District[] districts, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (socialService == null)
      _initSocialServiceProxy();
    return socialService.getHumanByDistrict(districts, pageNum, resultsOnPage, lang);
  }
  
  public kz.lof.webservices.store.social.District[] getDistricts(String name, String lang) throws java.rmi.RemoteException{
    if (socialService == null)
      _initSocialServiceProxy();
    return socialService.getDistricts(name, lang);
  }
  
  public kz.lof.webservices.store.social.HumanSearchResult getHumanByFullName(String firstname, String lastname, String middlename, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (socialService == null)
      _initSocialServiceProxy();
    return socialService.getHumanByFullName(firstname, lastname, middlename, pageNum, resultsOnPage, lang);
  }
  
  
}