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
import org.apache.axis.client.Stub;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

public class HumansSearchServiceProxy implements HumansSearchService {
    private String _endpoint = null;
    private HumansSearchService humansSearchService = null;
    private User user = null;

    public HumansSearchServiceProxy(User user) {
        this.user = user;
        this._initHumansSearchServiceProxy();
    }

    public HumansSearchServiceProxy() {
        this._initHumansSearchServiceProxy();
    }

    public HumansSearchServiceProxy(String endpoint) {
        this._endpoint = endpoint;
        this._initHumansSearchServiceProxy();
    }

    private void _initHumansSearchServiceProxy() {
        try {
            this.humansSearchService = (new HumansSearchServiceServiceLocator()).getHumansSearchService();
            if(this.humansSearchService != null) {
                ((Stub)this.humansSearchService)._setProperty("kz.lof.webservices.current_user", this.user);
                if(this._endpoint != null) {
                    ((javax.xml.rpc.Stub)this.humansSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", this._endpoint);
                } else {
                    this._endpoint = (String)((javax.xml.rpc.Stub)this.humansSearchService)._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }
        } catch (ServiceException var2) {
            ;
        }

    }

    public String getEndpoint() {
        return this._endpoint;
    }

    public void setEndpoint(String endpoint) {
        this._endpoint = endpoint;
        if(this.humansSearchService != null) {
            ((javax.xml.rpc.Stub)this.humansSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", this._endpoint);
        }

    }

    public HumansSearchService getHumansSearchService() {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService;
    }

    public String[] getLog(Date date) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getLog(date);
    }

    public Country[] getCountry(String name, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getCountry(name, lang);
    }

    public MigrationNatData[] getInfoMigrationNationByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getInfoMigrationNationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationReasonData[] getInfoMigrationReasonByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getInfoMigrationReasonByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatSpecByCodeRegion(Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getMigrationNatSpecByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatEducByCodeRegion(Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getMigrationNatEducByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
    }

    public CriminalsData[] getCountCriminalsByCodeRegion(Region[] region, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getCountCriminalsByCodeRegion(region, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
    }

    public MigrationLiveData[] getInfoMigrationLiveByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getInfoMigrationLiveByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public ServiceInfo testService() throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.testService();
    }

    public HumanFullData getFullData(long id, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getFullData(id, lang);
    }

    public District[] getDistricts(String name, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getDistricts(name, lang);
    }

    public Street[] getStreets(String name, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getStreets(name, lang);
    }

    public HumansSearchResult getHumanByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getHumanByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
    }

    public HumansSearchResult getHumanByAddr(Street street, String house, String flat, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getHumanByAddr(street, house, flat, pageNum, resultsOnPage, lang);
    }

    public HumansSearchResult getHumanByDoc(String docNumber, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getHumanByDoc(docNumber, pageNum, resultsOnPage, lang);
    }

    public HumansSearchResult getCitizenByIIN(String iin, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getCitizenByIIN(iin, lang);
    }

    public Country[] getAllCountries(String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getAllCountries(lang);
    }

    public District[] getAllDistricts(String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getAllDistricts(lang);
    }

    public Street[] getAllStreets(String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getAllStreets(lang);
    }

    public NatCount[] getNationalityByAddr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getNationalityByAddr(address, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getProzhivByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getProzhivByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getProzhivByAddr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getProzhivByAddr(address, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getCntAdamByAge(Address[] address, int startAge, int endAge, int sex, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getCntAdamByAge(address, startAge, endAge, sex, pageNum, resultsOnPage, lang);
    }

    public MigrationData[] getInfoMigrationByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getInfoMigrationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationData[] getInfoMigrationByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getInfoMigrationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationNatData[] getInfoMigrationNationByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getInfoMigrationNationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationReasonData[] getInfoMigrationReasonByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getInfoMigrationReasonByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public SpecCount[] getMigrationSpecByAdr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getMigrationSpecByAdr(address, pageNum, resultsOnPage, lang);
    }

    public SpecCount[] getMigrationSpecByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getMigrationSpecByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatSpecByAdr(Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getMigrationNatSpecByAdr(address, nacId, pageNum, resultsOnPage, lang);
    }

    public NatEducData[] getMigrationNatEducByAdr(Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getMigrationNatEducByAdr(address, nacId, pageNum, resultsOnPage, lang);
    }

    public TypeRegData[] getCountTypeRegByAdr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getCountTypeRegByAdr(address, pageNum, resultsOnPage, lang);
    }

    public CriminalsData[] getCountCriminalsByAdr(Address[] address, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getCountCriminalsByAdr(address, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
    }

    public TypeRegData[] getCountTypeRegByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(this.humansSearchService == null) {
            this._initHumansSearchServiceProxy();
        }

        return this.humansSearchService.getCountTypeRegByCodeRegion(region, pageNum, resultsOnPage, lang);
    }
}
