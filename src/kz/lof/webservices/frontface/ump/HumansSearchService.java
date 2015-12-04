//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.lof.webservices.frontface.ump;

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

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

public interface HumansSearchService extends Remote {
    String[] getLog(Date var1) throws RemoteException;

    Country[] getCountry(String var1, String var2) throws RemoteException;

    MigrationNatData[] getInfoMigrationNationByCodeRegion(Region[] var1, Calendar var2, Calendar var3, int var4, int var5, String var6) throws RemoteException;

    MigrationReasonData[] getInfoMigrationReasonByCodeRegion(Region[] var1, Calendar var2, Calendar var3, int var4, int var5, String var6) throws RemoteException;

    NatEducData[] getMigrationNatSpecByCodeRegion(Region[] var1, int var2, int var3, int var4, String var5) throws RemoteException;

    NatEducData[] getMigrationNatEducByCodeRegion(Region[] var1, int var2, int var3, int var4, String var5) throws RemoteException;

    CriminalsData[] getCountCriminalsByCodeRegion(Region[] var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8) throws RemoteException;

    MigrationLiveData[] getInfoMigrationLiveByCodeRegion(Region[] var1, int var2, int var3, String var4) throws RemoteException;

    ServiceInfo testService() throws RemoteException;

    HumanFullData getFullData(long var1, String var3) throws RemoteException;

    District[] getDistricts(String var1, String var2) throws RemoteException;

    Street[] getStreets(String var1, String var2) throws RemoteException;

    HumansSearchResult getHumanByFIO(String var1, String var2, String var3, int var4, int var5, String var6) throws RemoteException;

    HumansSearchResult getHumanByAddr(Street var1, String var2, String var3, int var4, int var5, String var6) throws RemoteException;

    HumansSearchResult getHumanByDoc(String var1, int var2, int var3, String var4) throws RemoteException;

    HumansSearchResult getCitizenByIIN(String var1, String var2) throws RemoteException;

    Country[] getAllCountries(String var1) throws RemoteException;

    District[] getAllDistricts(String var1) throws RemoteException;

    Street[] getAllStreets(String var1) throws RemoteException;

    NatCount[] getNationalityByAddr(Address[] var1, int var2, int var3, String var4) throws RemoteException;

    CountByAddr[] getProzhivByCodeRegion(Region[] var1, int var2, int var3, String var4) throws RemoteException;

    CountByAddr[] getProzhivByAddr(Address[] var1, int var2, int var3, String var4) throws RemoteException;

    CountByAddr[] getCntAdamByAge(Address[] var1, int var2, int var3, int var4, int var5, int var6, String var7) throws RemoteException;

    MigrationData[] getInfoMigrationByAdr(Address[] var1, Calendar var2, Calendar var3, int var4, int var5, String var6) throws RemoteException;

    MigrationData[] getInfoMigrationByCodeRegion(Region[] var1, Calendar var2, Calendar var3, int var4, int var5, String var6) throws RemoteException;

    MigrationNatData[] getInfoMigrationNationByAdr(Address[] var1, Calendar var2, Calendar var3, int var4, int var5, String var6) throws RemoteException;

    MigrationReasonData[] getInfoMigrationReasonByAdr(Address[] var1, Calendar var2, Calendar var3, int var4, int var5, String var6) throws RemoteException;

    SpecCount[] getMigrationSpecByAdr(Address[] var1, int var2, int var3, String var4) throws RemoteException;

    SpecCount[] getMigrationSpecByCodeRegion(Region[] var1, int var2, int var3, String var4) throws RemoteException;

    NatEducData[] getMigrationNatSpecByAdr(Address[] var1, int var2, int var3, int var4, String var5) throws RemoteException;

    NatEducData[] getMigrationNatEducByAdr(Address[] var1, int var2, int var3, int var4, String var5) throws RemoteException;

    TypeRegData[] getCountTypeRegByAdr(Address[] var1, int var2, int var3, String var4) throws RemoteException;

    CriminalsData[] getCountCriminalsByAdr(Address[] var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8) throws RemoteException;

    TypeRegData[] getCountTypeRegByCodeRegion(Region[] var1, int var2, int var3, String var4) throws RemoteException;
}
