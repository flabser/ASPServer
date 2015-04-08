package kz.lof.webservices.clients.udp;

import java.io.*;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import kz.flabs.users.User;
import kz.lof.webservices.store.udp.*;
import kz.pchelka.env.Environment;

public class Launcher {

	private static final String logFileDate = DateFormat.getDateTimeInstance().format(new Date()).replace('.', '-').replace(' ', '_').replace(':', '-');
	private static UDPServiceProxy uDPProxy;
	private static UDPCamServiceProxy uDPCamProxy;
	
	
	
	// ��� �����, � ������� ������������ ��� ������������, �������� ������ ��� ������ ���� � �������
	private static final String logFileName = "udp";
	// ���� � �����, ����. C:\Test\
	private static final String logFilePath = "logs\\";
	
	public static void main(String[] args) throws ParseException {
		Environment.addExtHost("udp", "192.168.0.39:15045", "УДП");
		uDPProxy = new UDPServiceProxy(new User("temp_user"));
		uDPCamProxy = new UDPCamServiceProxy(new User("temp_user"));
		
		District[] district = new District[1];
		district[0] = new District("19102743", null);
		
		Address[] address = {new Address(null, null, null, "АЭРОДРОМНАЯ", "97", null)};
		
		Calendar startDate = Calendar.getInstance();
		startDate.set(Calendar.YEAR, 1950);
		Calendar endDate = Calendar.getInstance();
		endDate.set(Calendar.YEAR, 2020);
		
		int pageNum = 1;
		int resultsOnPage = 20;
		String lang = "";
		
		int srtsId = 19100004;
		String grnz = "A545FNM";
		int ownerId = 2;
		String srtsSerial = "AA00008898";
		String srtsNumber = "";
		String iin = "111111";
		
		try {
			testUDPCamServiceGetFullDataByGRNZ("A545FNM", "");
			testUDPCamServiceGetWarrByGRNZ("A590ATM", "");
			testUDPServiceGetMarkAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetDataByRegId(srtsId, lang);
			testUDPServiceGetTheftData(grnz, lang);
			testUDPServiceGetDataByOwnerId(ownerId, lang);
			testUDPServiceGetDataByGRNZ(grnz, pageNum, resultsOnPage, lang);
			testUDPServiceGetDataBySRTS(srtsSerial, srtsNumber, lang);
			testUDPServiceGetDataByIIN(iin, lang);
			testUDPServiceGetDataByOrgName("ТОО ПАВЛОДАРСКИЙ ТРУБОПРОКАТНЫЙ ЗАВОД", pageNum, resultsOnPage, lang);
			testUDPServiceGetDataByFIO("РУСЛАН", "ЕСМУКАНОВ", "РЫСKАЛИUЛЫ", pageNum, resultsOnPage, lang);
			testUDPServiceGetCountAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetCountAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetMarkAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoYearAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoYearAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoDrivLicByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoDrivLicByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoOwnerTSByCodeRegion(district, pageNum, resultsOnPage, lang);
			testUDPServiceGetCountOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
			testUDPServiceGetCountOwnerTSByCodeRegion(district, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoTypeAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
			testUDPServiceGetInfoTypeAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
			
            
		} catch (RemoteException re) {
			System.out.println("ошибка");
			re.printStackTrace();
		}
	}
	
	public static void testUDPServiceGetMarkAMTSByCodeRegion(District[] district, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
     
        VehicleCountResult iData = uDPProxy.getMarkAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
        System.out.println();
    }

	public static void testUdpServiceGetLog( Date date) throws RemoteException {
        outln("  Method: UdpSearchService -> getLog");
        outln("    Result:");
        String[] d = uDPProxy.getLog(date);
        System.out.println(d.length);
        for(int i=0; i< d.length; i++){
            String iData = d[i];
            outln("      Record data number: "+(i+1));
            outln("      id = " + iData);
            outln("----------------------------------");
        }
        outln("-------------------------------------------------------------------------");
    }
	
	public static void testUDPCamServiceGetFullDataByGRNZ(String grnz, String lang) throws RemoteException {
		
		VehicleFullData iData = uDPCamProxy.getFullDataByGRNZ(grnz, lang);
		System.out.println();
	}
	public static void testUDPCamServiceGetWarrByGRNZ(String grnz, String lang) throws RemoteException {
		TrustData[] iData = uDPCamProxy.getWarrByGRNZ(grnz, lang);
		System.out.println();
	}
	public static void testUDPCamServiceGetAddressByFIO(String firstName, String lastName, String middleName, Date birthDate, String lang) throws RemoteException {
		
		HumanShortData iData = uDPCamProxy.getAddressByFIO(firstName, lastName, middleName, birthDate, lang);
		System.out.println();
	}
	public static void testUDPServiceGetDataByRegId(long srtsId, String lang) throws RemoteException {
		
		VehicleFullData iData = uDPProxy.getDataByRegId(srtsId, lang);
		System.out.println();
	}
	public static void testUDPServiceGetTheftData(String grnz, String lang) throws RemoteException {
		
		TheftSearchResult iData = uDPProxy.getTheftData(grnz, lang);
		System.out.println();
	}
	public static void testUDPServiceGetDataByOwnerId(long ownerId, String lang) throws RemoteException {
		
		VehicleSearchResult iData = uDPProxy.getDataByOwnerId(ownerId, lang);
		System.out.println();
	}
	public static void testUDPServiceGetDataByGRNZ(String grnz, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		VehicleSearchResult iData = uDPProxy.getDataByGRNZ(grnz, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	public static void testUDPServiceGetDataBySRTS(String srtsSerial, String srtsNumber, String lang) throws RemoteException {
		
		VehicleSearchResult iData = uDPProxy.getDataBySRTS(srtsSerial, srtsNumber, lang);
		System.out.println();
	}
	public static void testUDPServiceGetDataByIIN(String iin, String lang) throws RemoteException {
		
		HumanSearchResult iData = uDPProxy.getDataByIIN(iin, lang);
		System.out.println();
	}
	public static void testUDPServiceGetDataByOrgName(String orgName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		HumanSearchResult iData = uDPProxy.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	public static void testUDPServiceGetDataByFIO(String firstName, String lastName , String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		HumanSearchResult iData = uDPProxy.getDataByFIO(firstName, lastName,  middleName, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	public static void testUDPServiceGetCountAMTSByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		TSCountByAddr[] iData = uDPProxy.getCountAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetCountAMTSByCodeRegion(District[] district, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		TSCountByAddr[] iData = uDPProxy.getCountAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetMarkAMTSByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		VehicleCountResult iData = uDPProxy.getMarkAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoYearAMTSByCodeRegion(District[] district, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		VehicleCountResult iData = uDPProxy.getInfoYearAMTSByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoYearAMTSByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		VehicleCountResult iData = uDPProxy.getInfoYearAMTSByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoDrivLicByCodeRegion(District[] district, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		VehicleCountData[] iData = uDPProxy.getInfoDrivLicByCodeRegion(district, startDate, endDate, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoDrivLicByAdr  (Address[] address,Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		VehicleCountData[] iData = uDPProxy.getInfoDrivLicByAdr(address, startDate, endDate, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoOwnerTSByAdr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		HumanSearchResult iData = uDPProxy.getInfoOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoOwnerTSByCodeRegion(District[] district, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		HumanSearchResult iData = uDPProxy.getInfoOwnerTSByCodeRegion(district, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetCountOwnerTSByAdr(Address[] address,int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		TSCountByOwnType[] iData = uDPProxy.getCountOwnerTSByAdr(address, pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetCountOwnerTSByCodeRegion(District[] district, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		TSCountByOwnType[] iData = uDPProxy.getCountOwnerTSByCodeRegion(district,pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoTypeAMTSByAdr(Address[] address,Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		HumanSearchResult iData = uDPProxy.getInfoTypeAMTSByAdr(address,startDate,endDate,pageNum, resultsOnPage, lang);
		System.out.println();
	}
	
	public static void testUDPServiceGetInfoTypeAMTSByCodeRegion(District[] district,Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		
		HumanSearchResult iData = uDPProxy.getInfoTypeAMTSByCodeRegion(district,startDate,endDate,pageNum, resultsOnPage, lang);
		System.out.println();
	}

	public static void out(Object o) {
		String fullFileName = "";
		if (logFileName.length() > 0) {
			fullFileName = logFilePath + logFileDate + "_" + logFileName;
		}
		OutputStream os = null;
		try {
			os = new FileOutputStream(fullFileName, true);
		} catch (FileNotFoundException fe) {
			os = System.out;
		} finally {
			try {
				os.write(o.toString().getBytes());
				if (os instanceof FileOutputStream) os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	public static void outln(Object o) {
		String fullFileName = "";
		if (logFileName.length() > 0) {
			fullFileName = logFilePath + logFileDate + "_" + logFileName;
		}
		OutputStream os = null;
		try {
			os = new FileOutputStream(fullFileName, true);
		} catch (FileNotFoundException fe) {
			os = System.out;
		} finally {
			try {
				os.write(o.toString().getBytes());
				os.write(new byte[] {13, 10});
				if (os instanceof FileOutputStream) os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
