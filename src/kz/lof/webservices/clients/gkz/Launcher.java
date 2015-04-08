package kz.lof.webservices.clients.gkz;

import java.io.*;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.rpc.Stub;

import kz.flabs.users.User;
import kz.lof.webservices.common.InfoEntry;
import kz.lof.webservices.common.ServiceInfo;
import kz.lof.webservices.store.gkz.*;
import kz.pchelka.env.Environment;

@SuppressWarnings("unused")
public class Launcher {

	private static GKZServiceProxy gKZProxy;
	
	
	public static void main(String[] args) {
		Environment.addExtHost("gkz", "127.0.0.1:15045", "GKZ");
		gKZProxy = new GKZServiceProxy(new User("temp_user"));
		String cadastrNumber = "20-312-015-001";
		int pageNum = 1;
		int resultsOnPage = 10;
		String lang = "rus";
		String companyName = "АКЦИОНЕРНОЕ ОБЩЕСТВО*";
		String number = "0042744";
		String series = "АА";
		int actType = 3;
		String firstName = "МАРАЛ";
		String lastName = "АДИЛОВА";
		String middleName = "МУСАЕВНА";
		String nameQuarter = "008";
		District district = new District("46", "");
		int ownerId = 1;
		int idRight = 9;
		String name = "УЛ.БАЙ*";
		try {
		    getDataByCadastrNumber(cadastrNumber, pageNum, resultsOnPage, lang);
		    getDataByCompany(companyName, pageNum, resultsOnPage, lang);
		    getDataByDocument(actType, series, number, pageNum, resultsOnPage, lang);
		    getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
		    getDataQuarter(district, nameQuarter, pageNum, resultsOnPage, lang);
		    getDataShort(ownerId, pageNum, resultsOnPage, lang);
		    getLandFullData(idRight);
		    getRegion(pageNum, resultsOnPage, lang);
		    getStreet(name, pageNum, resultsOnPage, lang);
		} catch (RemoteException re) {
			re.printStackTrace();
		}
	}
	
	static void getDataByCadastrNumber(String cadastrNumber, int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    kz.lof.webservices.store.gkz.LandShortDataResult idata = gKZProxy.getDataByCadastrNumber(cadastrNumber, pageNum, resultsOnPage, lang);
	    System.out.println();
	}
	
	static void getDataByCompany(String companyName, int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    CompanyShortDataResult idata = gKZProxy.getDataByCompany(companyName, pageNum, resultsOnPage, lang);
        System.out.println();
	}
	
	static void getDataByDocument(int actType, String series, String number, int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    LandShortDataResult iData = gKZProxy.getDataByDocument(actType, series, number, pageNum, resultsOnPage, lang);
	    System.out.println();
	}
	
	static void getDataByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    HumanShortDataResult iData = gKZProxy.getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
	    System.out.println();
	}
	    
	static void getDataQuarter(District district, String nameQuarter, int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    QuarterSearchResult iData = gKZProxy.getDataQuarter(district, nameQuarter, pageNum, resultsOnPage, lang);
	    System.out.println();
	}
	
	static void getDataShort(int ownerId, int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    LandShortDataResult iData = gKZProxy.getDataShort(ownerId, pageNum, resultsOnPage, lang);
	    System.out.println();
	}
	
	static void  getLandFullData(int idRight) throws RemoteException{
	    LandFullData iData = gKZProxy.getLandFullData(idRight);
	    System.out.println();
	} 
	
	static void getRegion(int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    RegionSearchResult iData = gKZProxy.getRegion(pageNum, resultsOnPage, lang);
	    System.out.println();
	}

	static void getStreet(String name, int pageNum, int resultsOnPage, String lang) throws RemoteException{
	    StreetSearchResult iData = gKZProxy.getStreet(name, pageNum, resultsOnPage, lang);
	    System.out.println();
	}
	

}
