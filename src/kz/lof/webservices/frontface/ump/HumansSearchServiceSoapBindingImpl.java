/**
 * HumansSearchServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.ump;

import java.rmi.RemoteException;
import java.util.Calendar;

import kz.flabs.users.User;
import kz.lof.webservices.clients.ump.HumansSearchService;
import kz.lof.webservices.clients.ump.HumansSearchServiceProxy;
import kz.lof.webservices.store.ump.Address;
import kz.lof.webservices.store.ump.CountByAddr;
import kz.lof.webservices.store.ump.CriminalsData;
import kz.lof.webservices.store.ump.MigrationLiveData;
import kz.lof.webservices.store.ump.MigrationReasonData;
import kz.lof.webservices.store.ump.Region;
import kz.lof.webservices.store.ump.TypeRegData;

import org.apache.axis.MessageContext;

public class HumansSearchServiceSoapBindingImpl implements kz.lof.webservices.frontface.ump.HumansSearchService{
    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getLog(date);
    }

    public kz.lof.webservices.store.ump.Country[] getCountry(java.lang.String name, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountry(name, lang);
    }

    public kz.lof.webservices.store.ump.MigrationNatData[] getInfoMigrationNationByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationNationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationReasonData[] getInfoMigrationReasonByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationReasonByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatSpecByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int nacId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatSpecByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatEducByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int nacId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatEducByCodeRegion(region, nacId, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.MigrationLiveData[] getInfoMigrationLiveByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationLiveByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.HumansSearchResult getHumanByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getHumanByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.HumansSearchResult getHumanByAddr(kz.lof.webservices.store.ump.Street street, java.lang.String house, java.lang.String flat, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getHumanByAddr(street, house, flat, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.HumansSearchResult getHumanByDoc(java.lang.String docNumber, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getHumanByDoc(docNumber, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.HumansSearchResult getCitizenByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCitizenByIIN(iin, lang);
    }

    public kz.lof.webservices.store.ump.Country[] getAllCountries(java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAllCountries(lang);
    }

    public kz.lof.webservices.store.ump.District[] getAllDistricts(java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAllDistricts(lang);
    }

    public kz.lof.webservices.store.ump.Street[] getAllStreets(java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAllStreets(lang);
    }

    public kz.lof.webservices.store.ump.NatCount[] getNationalityByAddr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getNationalityByAddr(address, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getProzhivByAddr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getProzhivByAddr(address, pageNum, resultsOnPage, lang);
    }

    public CountByAddr[] getCntAdamByAge(kz.lof.webservices.store.ump.Address[] address, int startAge, int endAge, int sex, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCntAdamByAge(address, startAge, endAge, sex, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.MigrationData[] getInfoMigrationByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.MigrationData[] getInfoMigrationByCodeRegion(kz.lof.webservices.store.ump.Region[] region, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationByCodeRegion(region, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.MigrationNatData[] getInfoMigrationNationByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationNationByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public MigrationReasonData[] getInfoMigrationReasonByAdr(kz.lof.webservices.store.ump.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationReasonByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.SpecCount[] getMigrationSpecByAdr(kz.lof.webservices.store.ump.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationSpecByAdr(address, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.SpecCount[] getMigrationSpecByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationSpecByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatSpecByAdr(kz.lof.webservices.store.ump.Address[] address, int nacId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatSpecByAdr(address, nacId, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.NatEducData[] getMigrationNatEducByAdr(kz.lof.webservices.store.ump.Address[] address, int nacId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getMigrationNatEducByAdr(address, nacId, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.TypeRegData[] getCountTypeRegByAdr(kz.lof.webservices.store.ump.Address[] address, int typeId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByAdr(address, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.TypeRegData[] getCountTypeRegByCodeRegion(kz.lof.webservices.store.ump.Region[] region, int typeId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

    public kz.lof.webservices.store.ump.HumanFullData getFullData(long id, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getFullData(id, lang);
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

    public kz.lof.webservices.store.ump.District[] getDistricts(java.lang.String name, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getDistricts(name, lang);
    }

    public kz.lof.webservices.store.ump.Street[] getStreets(java.lang.String name, java.lang.String lang) throws java.rmi.RemoteException {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getStreets(name, lang);
    }

    
    public  MigrationLiveData[] getInfoMigrationLiveByCodeRegion(Region[] region,
            Calendar startDate, Calendar endDate, int pageNum,
            int resultsOnPage, String lang) throws RemoteException
    {
    	HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getInfoMigrationLiveByCodeRegion(region, pageNum, resultsOnPage, lang);
    }

	public CountByAddr[] getProzhivByCodeRegion(Region[] region, int pageNum,
			int resultsOnPage, String lang) throws RemoteException {
		HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getProzhivByCodeRegion(region, pageNum, resultsOnPage, lang);
	}

	public TypeRegData[] getCountTypeRegByAdr(Address[] address, int pageNum,
			int resultsOnPage, String lang) throws RemoteException {
		HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByAdr(address, pageNum, resultsOnPage, lang);
	}

	public CriminalsData[] getCountCriminalsByAdr(Address[] address, int idNac,
			int sex, int startAge, int endAge, int pageNum, int resultsOnPage,
			String lang) throws RemoteException {
		HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountCriminalsByAdr(address, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
	}

	public TypeRegData[] getCountTypeRegByCodeRegion(Region[] region,
			int pageNum, int resultsOnPage, String lang) throws RemoteException {
		HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountTypeRegByCodeRegion(region, pageNum, resultsOnPage, lang);
	}

	public CriminalsData[] getCountCriminalsByCodeRegion(Region[] region,
			int idNac, int sex, int startAge, int endAge, int pageNum,
			int resultsOnPage, String lang) throws RemoteException {
		HumansSearchService svc = new HumansSearchServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getCountCriminalsByCodeRegion(region, idNac, sex, startAge, endAge, pageNum, resultsOnPage, lang);
	}

}
