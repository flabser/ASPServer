/**
 * HumansSearchService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.ump;

public interface HumansSearchService extends java.rmi.Remote {
    public String[] getLog(java.util.Date date) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.Country[] getCountry(String name, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.MigrationNatData[] getInfoMigrationNationByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.MigrationReasonData[] getInfoMigrationReasonByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatSpecByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatEducByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.CriminalsData[] getCountCriminalsByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.MigrationLiveData[] getInfoMigrationLiveByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public String[] getFlats(int idStreet, String house, String flatNumber) throws java.rmi.RemoteException;
    public String[] getFlatParts(int idStreet, String house, String flatNumber) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.HumanFullData getFullData(long id, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.District[] getDistricts(String name, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.Street[] getStreets(String name, String lang) throws java.rmi.RemoteException;
    public String[] getHouses(int idStreet, String house) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.HumansSearchResult getHumanByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.HumansSearchResult getHumanByAddr(kz.lof.webservices.store.ump.Street street, String house, String flat, String flatPart, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.HumansSearchResult getHumanByDoc(String docNumber, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.HumansSearchResult getCitizenByIIN(String iin, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.Country[] getAllCountries(String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.District[] getAllDistricts(String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.Street[] getAllStreets(String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.NationalityByAddr[] getNationalityByAddr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.CountByAddr[] getProzhivByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.CountByAddr[] getProzhivByAddr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.CountByAddr[] getCntAdamByAge(kz.lof.webservices.store.ump.Address[] address, int startAge, int endAge, int sex, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.MigrationData[] getInfoMigrationByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.MigrationData[] getInfoMigrationByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.MigrationNatData[] getInfoMigrationNationByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.MigrationReasonData[] getInfoMigrationReasonByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.SpecCount[] getMigrationSpecByAdr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.SpecCount[] getMigrationSpecByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatSpecByAdr(kz.lof.webservices.store.ump.Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatEducByAdr(kz.lof.webservices.store.ump.Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.TypeRegData[] getCountTypeRegByAdr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.CriminalsData[] getCountCriminalsByAdr(kz.lof.webservices.store.ump.Address[] address, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.ump.TypeRegData[] getCountTypeRegByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
}
