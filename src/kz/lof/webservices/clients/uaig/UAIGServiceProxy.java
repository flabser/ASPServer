package kz.lof.webservices.clients.uaig;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class UAIGServiceProxy implements kz.lof.webservices.clients.uaig.UAIGService {
  private String _endpoint = null;
  private kz.lof.webservices.clients.uaig.UAIGService uAIGService = null;
  private User user = null;
  
  public UAIGServiceProxy(User user) {
      this.user  = user;
    _initUAIGServiceProxy();
  }
  
  public UAIGServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUAIGServiceProxy();
  }
  
  private void _initUAIGServiceProxy() {
    try {
      uAIGService = (new kz.lof.webservices.clients.uaig.UAIGServiceServiceLocator()).getUAIGService();
      if (uAIGService != null) {
          ((Stub)uAIGService)._setProperty("kz.lof.webservices.current_user", user);
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uAIGService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uAIGService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uAIGService != null)
      ((javax.xml.rpc.Stub)uAIGService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kz.lof.webservices.clients.uaig.UAIGService getUAIGService() {
    if (uAIGService == null)
      _initUAIGServiceProxy();
    return uAIGService;
  }
  
  public kz.lof.webservices.store.uaig.ShortData[] getDataByRNNCustomer(java.lang.String rnn) throws java.rmi.RemoteException{
    if (uAIGService == null)
      _initUAIGServiceProxy();
    return uAIGService.getDataByRNNCustomer(rnn);
  }
  
  public kz.lof.webservices.store.uaig.ShortData[] getDataByNumberDeclaration(java.lang.String numberDeclaration) throws java.rmi.RemoteException{
    if (uAIGService == null)
      _initUAIGServiceProxy();
    return uAIGService.getDataByNumberDeclaration(numberDeclaration);
  }
  
  public kz.lof.webservices.store.uaig.ShortData[] getDataByPeriod(java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (uAIGService == null)
      _initUAIGServiceProxy();
    return uAIGService.getDataByPeriod(startDate, endDate);
  }
  
  public kz.lof.webservices.store.uaig.FullData getDataById(int id) throws java.rmi.RemoteException{
    if (uAIGService == null)
      _initUAIGServiceProxy();
    return uAIGService.getDataById(id);
  }
  
  
}