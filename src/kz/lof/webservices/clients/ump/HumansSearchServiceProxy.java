package kz.lof.webservices.clients.ump;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class HumansSearchServiceProxy implements kz.lof.webservices.clients.ump.HumansSearchService {
  private String _endpoint = null;
  private kz.lof.webservices.clients.ump.HumansSearchService humansSearchService = null;
  private User user = null;

  public HumansSearchServiceProxy(User user) {
      this.user = user;
    _initHumansSearchServiceProxy();
  }

  public HumansSearchServiceProxy() {
    _initHumansSearchServiceProxy();
  }

  public HumansSearchServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHumansSearchServiceProxy();
  }

  private void _initHumansSearchServiceProxy() {
    try {
      humansSearchService = (new kz.lof.webservices.clients.ump.HumansSearchServiceServiceLocator()).getHumansSearchService();
      if (humansSearchService != null) {
    	((Stub)humansSearchService)._setProperty("kz.lof.webservices.current_user", user);
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)humansSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)humansSearchService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }

    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }

  public String getEndpoint() {
    return _endpoint;
  }

  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (humansSearchService != null)
      ((javax.xml.rpc.Stub)humansSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

  }

  public kz.lof.webservices.clients.ump.HumansSearchService getHumansSearchService() {
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService;
  }

  public String[] getLog(java.util.Date date) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getLog(date);
  }

  public kz.lof.webservices.store.ump.Country[] getCountry(String name, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getCountry(name, lang);
  }

  public kz.lof.webservices.store.ump.MigrationNatData[] getInfoMigrationNationByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getInfoMigrationNationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.MigrationReasonData[] getInfoMigrationReasonByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getInfoMigrationReasonByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatSpecByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getMigrationNatSpecByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatEducByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getMigrationNatEducByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.CriminalsData[] getCountCriminalsByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getCountCriminalsByCodeRegion(region, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.MigrationLiveData[] getInfoMigrationLiveByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getInfoMigrationLiveByCodeRegion(region, pageNum, resultsOnPage, lang);
  }

    public String[] getFlatParts(int idStreet, String house,String flatNumber) throws java.rmi.RemoteException{
        if (humansSearchService == null)
            _initHumansSearchServiceProxy();
        return humansSearchService.getFlatParts(idStreet, house, flatNumber);
    }

  public String[] getFlats(int idStreet, String house, String flatNumber) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getFlats(idStreet, house, flatNumber);
  }

  public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.testService();
  }

  public kz.lof.webservices.store.ump.HumanFullData getFullData(long id, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getFullData(id, lang);
  }

  public kz.lof.webservices.store.ump.District[] getDistricts(String name, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getDistricts(name, lang);
  }

  public kz.lof.webservices.store.ump.Street[] getStreets(String name, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getStreets(name, lang);
  }

  public String[] getHouses(int idStreet, String house) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getHouses(idStreet, house);
  }

  public kz.lof.webservices.store.ump.HumansSearchResult getHumanByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getHumanByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.HumansSearchResult getHumanByAddr(kz.lof.webservices.store.ump.Street street, String house, String flat, String flatPart, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getHumanByAddr(street, house, flat, flatPart, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.HumansSearchResult getHumanByDoc(String docNumber, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getHumanByDoc(docNumber, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.HumansSearchResult getCitizenByIIN(String iin, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getCitizenByIIN(iin, lang);
  }

  public kz.lof.webservices.store.ump.Country[] getAllCountries(String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getAllCountries(lang);
  }

  public kz.lof.webservices.store.ump.District[] getAllDistricts(String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getAllDistricts(lang);
  }

  public kz.lof.webservices.store.ump.Street[] getAllStreets(String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getAllStreets(lang);
  }

  public kz.lof.webservices.store.ump.NationalityByAddr[] getNationalityByAddr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getNationalityByAddr(address, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.CountByAddr[] getProzhivByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getProzhivByCodeRegion(region, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.CountByAddr[] getProzhivByAddr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getProzhivByAddr(address, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.CountByAddr[] getCntAdamByAge(kz.lof.webservices.store.ump.Address[] address, int startAge, int endAge, int sex, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getCntAdamByAge(address, startAge, endAge, sex, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.MigrationData[] getInfoMigrationByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getInfoMigrationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.MigrationData[] getInfoMigrationByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getInfoMigrationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.MigrationNatData[] getInfoMigrationNationByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getInfoMigrationNationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.MigrationReasonData[] getInfoMigrationReasonByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getInfoMigrationReasonByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.SpecCount[] getMigrationSpecByAdr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getMigrationSpecByAdr(address, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.SpecCount[] getMigrationSpecByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getMigrationSpecByCodeRegion(region, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatSpecByAdr(kz.lof.webservices.store.ump.Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getMigrationNatSpecByAdr(address, nacId, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatEducByAdr(kz.lof.webservices.store.ump.Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getMigrationNatEducByAdr(address, nacId, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.TypeRegData[] getCountTypeRegByAdr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getCountTypeRegByAdr(address, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.CriminalsData[] getCountCriminalsByAdr(kz.lof.webservices.store.ump.Address[] address, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getCountCriminalsByAdr(address, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
  }

  public kz.lof.webservices.store.ump.TypeRegData[] getCountTypeRegByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException{
    if (humansSearchService == null)
      _initHumansSearchServiceProxy();
    return humansSearchService.getCountTypeRegByCodeRegion(region, pageNum, resultsOnPage, lang);
  }
  
  
}