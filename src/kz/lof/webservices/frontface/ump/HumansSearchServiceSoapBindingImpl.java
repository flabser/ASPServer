//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.lof.webservices.frontface.ump;

import kz.flabs.users.User;
import kz.lof.webservices.common.ServiceInfo;
import kz.lof.webservices.store.ump.Address;
import kz.lof.webservices.store.ump.CountByAddr;
import kz.lof.webservices.store.ump.Country;
import kz.lof.webservices.store.ump.CriminalsData;
import kz.lof.webservices.store.ump.District;
import kz.lof.webservices.store.ump.HumanFullData;
import kz.lof.webservices.store.ump.HumansSearchResult;
import kz.lof.webservices.store.ump.MigrationData;
import kz.lof.webservices.store.ump.MigrationLiveData;
import kz.lof.webservices.store.ump.MigrationNatData;
import kz.lof.webservices.store.ump.MigrationReasonData;
import kz.lof.webservices.store.ump.NatCount;
import kz.lof.webservices.store.ump.NatEducData;
import kz.lof.webservices.store.ump.Region;
import kz.lof.webservices.store.ump.SpecCount;
import kz.lof.webservices.store.ump.Street;
import kz.lof.webservices.store.ump.TypeRegData;
import org.apache.axis.MessageContext;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

public class HumansSearchServiceSoapBindingImpl implements HumansSearchService {
    public HumansSearchServiceSoapBindingImpl() {
    }

    public String[] getLog(Date date) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getLog(date);
    }

    public Country[] getCountry(String name, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountry(name, lang);
    }

    public MigrationNatData[] getInfoMigrationNationByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationNationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationReasonData[] getInfoMigrationReasonByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationReasonByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatSpecByCodeRegion(Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatSpecByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatEducByCodeRegion(Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatEducByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
    }

    public MigrationLiveData[] getInfoMigrationLiveByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationLiveByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public HumansSearchResult getHumanByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getHumanByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
    }

    public HumansSearchResult getHumanByAddr(Street street, String house, String flat, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getHumanByAddr(street, house, flat, pageNum, resultsOnPage, lang);
    }

    public HumansSearchResult getHumanByDoc(String docNumber, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getHumanByDoc(docNumber, pageNum, resultsOnPage, lang);
    }

    public HumansSearchResult getCitizenByIIN(String iin, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCitizenByIIN(iin, lang);
    }

    public Country[] getAllCountries(String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAllCountries(lang);
    }

    public District[] getAllDistricts(String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAllDistricts(lang);
    }

    public Street[] getAllStreets(String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAllStreets(lang);
    }

    public NatCount[] getNationalityByAddr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getNationalityByAddr(address, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getProzhivByAddr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getProzhivByAddr(address, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getCntAdamByAge(Address[] address, int startAge, int endAge, int sex, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCntAdamByAge(address, startAge, endAge, sex, pageNum, resultsOnPage, lang);
    }

    public MigrationData[] getInfoMigrationByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationData[] getInfoMigrationByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationNatData[] getInfoMigrationNationByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationNationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationReasonData[] getInfoMigrationReasonByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationReasonByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public SpecCount[] getMigrationSpecByAdr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationSpecByAdr(address, pageNum, resultsOnPage, lang);
    }

    public SpecCount[] getMigrationSpecByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationSpecByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatSpecByAdr(Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatSpecByAdr(address, nacId, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatEducByAdr(Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatEducByAdr(address, nacId, pageNum, resultsOnPage, lang);
    }

    public TypeRegData[] getCountTypeRegByAdr(Address[] address, int typeId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByAdr(address, pageNum, resultsOnPage, lang);
    }

    public TypeRegData[] getCountTypeRegByCodeRegion(Region[] region, int typeId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public HumanFullData getFullData(long id, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getFullData(id, lang);
    }

    public ServiceInfo testService() throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

    public District[] getDistricts(String name, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDistricts(name, lang);
    }

    public Street[] getStreets(String name, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getStreets(name, lang);
    }

    public MigrationLiveData[] getInfoMigrationLiveByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationLiveByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getProzhivByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getProzhivByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public TypeRegData[] getCountTypeRegByAdr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByAdr(address, pageNum, resultsOnPage, lang);
    }

    public CriminalsData[] getCountCriminalsByAdr(Address[] address, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountCriminalsByAdr(address, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
    }

    public TypeRegData[] getCountTypeRegByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public CriminalsData[] getCountCriminalsByCodeRegion(Region[] region, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        HumansSearchServiceProxy svc = new HumansSearchServiceProxy((User)MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountCriminalsByCodeRegion(region, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
    }
}
