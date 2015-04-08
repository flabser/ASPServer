package kz.lof.webservices.clients.bti;

import java.io.*;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.rpc.Stub;

import kz.flabs.users.User;
import kz.lof.webservices.common.InfoEntry;
import kz.lof.webservices.common.ServiceInfo;
import kz.lof.webservices.store.bti.*;
import kz.pchelka.env.Environment;

public class Launcher {

	private static final String logFileDate = DateFormat.getDateTimeInstance().format(new Date()).replace('.', '-').replace(' ', '_').replace(':', '-');
	private static BTIServiceProxy bTIProxy;
	
	// ��� �����, � ������� ������������ ��� ������������, �������� ������ ��� ������ ���� � �������
	private static final String logFileName = "testlog.txt";
	// ���� � �����, ����. C:\Test\
	private static final String logFilePath = "";
	
	public static void main(String[] args) {
		Environment.addExtHost("bti", "127.0.0.1:15045", "���");
		bTIProxy = new BTIServiceProxy(new User("temp_user"));
		try {
//			testBTIServiceGetDataByFIO( "*�*", "*�*", "*�*", 0, 0, "RUS");
//			testBTIServiceGetDataByIIN("232323232323","RUS");
//			testBTIServiceGetDataByOrgName("����*", 0, 0, "RUS");
//			Street street = new Street();
//			street.setId(12);
//			street.setName("");
//			testBTIServiceGetDataByAddress(1, street,"22","","",0,0,"RUS");
//			testBTIServiceGetDataByDoc(1,9,"1*",0,0,"RUS");
//			testBTIServiceGetDataByOwnerId((long)1,(short)1,"RUS");
//			testBTIServiceGetFullDataByDoc((long)1000000003,(short)1, 0, "RUS");
//			testBTIServiceGetBuildingKinds("RUS");
//			testBTIServiceGetStreets("RUS");
//			testBTIServiceGetDocKinds("RUS");
//			testBTIServiceGetDocTypes("RUS");
			ServiceInfo si = bTIProxy.testService();
			for (InfoEntry entry : si.getAllInfo()) {
				System.out.println(entry.getName() + ": " + entry.getValue());
			}
		} catch (RemoteException re) {
			System.out.println("������� ����");
			re.printStackTrace();
		}
	}
	public static void testBTIServiceGetDocTypes(String lang) throws RemoteException {
		outln("  Method: BTIService -> getDocTypes");
		outln("    Result:");
		for(int i=0; i< bTIProxy.getDocTypes(lang).length; i++){
			DocType pShortData = bTIProxy.getDocTypes(lang)[i];
			outln("      Record data number: "+(i+1));
			outln("        id = " + pShortData.getId());
			outln("        name = " + pShortData.getName());
			outln("----------------------------------");
		}
		outln("-------------------------------------------------------------------------");
	}
	public static void testBTIServiceGetDocKinds(String lang) throws RemoteException {
		outln("  Method: BTIService -> getDocKind");
		outln("    Result:");
		for(int i=0; i<bTIProxy.getDocKinds(lang).length; i++){
			DocKind data = bTIProxy.getDocKinds(lang)[i];
			outln("      Record data number: "+(i+1));
			outln("        id = " + data.getId());
			outln("        name = " + data.getName());
			outln("----------------------------------");
		}
		outln("-------------------------------------------------------------------------");
	}
/*	public static void testBTIServiceGetStreets(String lang)throws RemoteException {
		outln("  Method: BTIService -> getStreets");
		outln("    Result:");
		for(int i=0; i< bTIProxy.getStreets(lang).length; i++){
			Street pShortData = bTIProxy.getStreets(lang)[i];
			outln("      Record data number: "+(i+1));
			outln("        	Street: ");
			outln("        		id = " + pShortData.getId());
			outln("        		statid = " + pShortData.getStatId());
			outln("        		name = " + pShortData.getName());
			outln("        		type:");
			outln("        			id = " +  pShortData.getType().getId());
			outln("        			name = " +  pShortData.getType().getName());
			outln("        			shortname = " + pShortData.getType().getShortName());
			outln("        		crosstype:");
			outln("        			id = " + pShortData.getCrossType().getId());
			outln("        			name = " + pShortData.getCrossType().getName());
			outln("        			shortname = " + pShortData.getCrossType().getShortName());
			outln("-------------------------------------");
		}
		outln("-------------------------------------------------------------------------");
	}*/
	public static void testBTIServiceGetBuildingKinds(String lang)throws RemoteException{
		outln("  Method: BTIService -> getBuildingKinds");
		outln("    Result:");
		for(int i=0; i< bTIProxy.getBuildingKinds(lang).length; i++){
			BuildingKind pShortData = bTIProxy.getBuildingKinds(lang)[i];
			outln("      Record data number: "+(i+1));
			outln("        id = " + pShortData.getId());
			outln("        name = " + pShortData.getName());
			outln("----------------------------------");
		}
		outln("-------------------------------------------------------------------------");
	}
	public static void testBTIServiceGetFullDataByDoc(long ownerId, short ownerStatus, int docId, String lang)throws RemoteException{
		outln("  Method: BTIService -> getFullDataByDoc");
		outln("    Parameters:");
		outln("      ownerId = " + ownerId);
		outln("      docId = " + docId);
		outln("      ownerStatus = " + ownerStatus);
		outln("      lang = " + lang);
		outln("    Result:");
		int count = 0;			
		BuildingFullData pShortData = bTIProxy.getFullDataByDoc(ownerId, ownerStatus,docId, lang);
		count = pShortData.getFlats();
		
		outln("      Record data: ");
		outln("        block = " + pShortData.getBlock());
		outln("        gkzBlock = " + pShortData.getGkzBlock());
		outln("        cadNumber = " + pShortData.getCadNumber());
		outln("        landNumber = " + pShortData.getLandNumber());	
		outln("        bYear = " + pShortData.getBYear());	
		outln("        storeys = " + pShortData.getStoreys());	
		outln("        overallSquare = " + pShortData.getOverallSquare());
		outln("        livingSquare = " + pShortData.getLivingSquare());
		outln("        bId = " + pShortData.getBId());
		outln("        id_record = " + pShortData.getApartments()[0].getDocument().getOwner().getId());
		outln("       	Wall Materials:");
		outln("        		id = " + pShortData.getWalls().getId());
		outln("        		name = " + pShortData.getWalls().getName());
		outln("       	Wall BuildingKind:");
		outln("        		id = " + pShortData.getBKind().getId());
		outln("        		name = " + pShortData.getBKind().getName());
		if(ownerStatus == 1){
			outln("PEOPLE");
			if(count ==0){
				outln("      DocumentData: ");
				outln("        docNumber = " + pShortData.getDocument().getDocNumber());
				outln("        limitAuthority = " + pShortData.getDocument().getLimitAuthority());
				outln("        limitPerson = " + pShortData.getDocument().getLimitPerson());
				outln("        limitCondition = " + pShortData.getDocument().getLimitCondition());	
				outln("        docDate = " +  DateFormat.getDateInstance().format(pShortData.getDocument().getDocDate().getTime()));	
				outln("        docRegDate = " +  DateFormat.getDateInstance().format(pShortData.getDocument().getDocRegDate().getTime()));
				outln("       	PropertyForm:");
				outln("        		id = " + pShortData.getDocument().getPropForm().getId());
				outln("        		name = " + pShortData.getDocument().getPropForm().getName());
				outln("       	PropertyKind:");
				outln("        		id = " + pShortData.getDocument().getPropKind().getId());
				outln("        		name = " + pShortData.getDocument().getPropKind().getName());
				outln("       	DocKind:");
				outln("        		id = " + pShortData.getDocument().getDocKind().getId());
				outln("        		name = " + pShortData.getDocument().getDocKind().getName());
				outln("       	DocType:");
				outln("        		id = " + pShortData.getDocument().getDocType().getId());
				outln("        		name = " + pShortData.getDocument().getDocType().getName());
				outln("       	BuildingPurpose:");
				outln("        		id = " + pShortData.getDocument().getPurpose().getId());
				outln("        		name = " + pShortData.getDocument().getPurpose().getName());
				outln("       	IDDocument:");
				outln("        		serial = " + pShortData.getDocument().getOwner().getIdDocument().getSerial());
				outln("        		number = " + pShortData.getDocument().getOwner().getIdDocument().getNumber());
				outln("        		authority = " + pShortData.getDocument().getOwner().getIdDocument().getAuthority());
				outln("        		date = " + DateFormat.getDateInstance().format(pShortData.getDocument().getOwner().getIdDocument().getDate().getTime()));
				outln("        		expirationid = " + DateFormat.getDateInstance().format(pShortData.getDocument().getOwner().getIdDocument().getExpiration().getTime()));
				outln("       		IDDocType:");
				outln("        			id = " + pShortData.getDocument().getOwner().getIdDocument().getType().getId());
				outln("        			name = " + pShortData.getDocument().getOwner().getIdDocument().getType().getName());
				outln("       	Country:");
				outln("        		id = " + pShortData.getDocument().getOwner().getCountry().getId());
				outln("        		shortName = " + pShortData.getDocument().getOwner().getCountry().getShortName());
				outln("        		fullName = " + pShortData.getDocument().getOwner().getCountry().getFullName());
				outln("       	PersonShortData:");
				outln("        		id = " + pShortData.getDocument().getOwner().getId());
				outln("        		status = " + pShortData.getDocument().getOwner().getStatus());
				outln("        		firstname = " + pShortData.getDocument().getOwner().getFirstName());
				outln("        		lastname = " + pShortData.getDocument().getOwner().getLastName());
				outln("        		middle = " + pShortData.getDocument().getOwner().getMiddleName());
				outln("        		rnn = " + pShortData.getDocument().getOwner().getRnn());
				outln("        		iin = " + pShortData.getDocument().getOwner().getIin());
				outln("        		address = " + pShortData.getDocument().getOwner().getAddress());
				outln("        		phone = " + pShortData.getDocument().getOwner().getPhone());

				outln("-------------------------------------------------------------------------");
			} else {
				for(int i=0; i<pShortData.getApartments().length; i++){
					outln("      Found record flat number: "+(i+1));
					outln("      DocumentData: ");
					outln("        flatNumber = " + pShortData.getApartments()[i].getFlatNumber());
					outln("        partLetter = " + pShortData.getApartments()[i].getPartLetter());
					outln("        phone = " + pShortData.getApartments()[i].getPhone());
					outln("        partYear = " + pShortData.getApartments()[i].getPartYear());
					outln("        pOverallSquare = " + pShortData.getApartments()[i].getPOverallSquare());
					outln("        pLiveSquare = " + pShortData.getApartments()[i].getPLiveSquare());
					outln("        rooms = " + pShortData.getApartments()[i].getRooms());
					outln("        premises = " + pShortData.getApartments()[i].getPremises());
					outln("        floor = " + pShortData.getApartments()[i].getFloor());
					outln("        docNumber = " + pShortData.getApartments()[i].getDocument().getDocNumber());
					outln("        limitAuthority = " + pShortData.getApartments()[i].getDocument().getLimitAuthority());
					outln("        limitPerson = " + pShortData.getApartments()[i].getDocument().getLimitPerson());
					outln("        limitCondition = " + pShortData.getApartments()[i].getDocument().getLimitCondition());	
					outln("        docDate = " + DateFormat.getDateInstance().format(pShortData.getApartments()[i].getDocument().getDocDate().getTime()));	
					outln("        docRegDate = " + DateFormat.getDateInstance().format(pShortData.getApartments()[i].getDocument().getDocRegDate().getTime()));
					outln("       	PropertyForm:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getPropForm().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getPropForm().getName());
					outln("       	PropertyKind:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getPropKind().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getPropKind().getName());
					outln("       	DocKind:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getDocKind().getId());
					outln("        		name = " + pShortData.getDocument().getDocKind().getName());
					outln("       	DocType:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getDocType().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getDocType().getName());
					outln("       	BuildingPurpose:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getPurpose().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getPurpose().getName());
					outln("       	IDDocument:");
					outln("        		serial = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getSerial());
					outln("        		number = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getNumber());
					outln("        		authority = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getAuthority());
					outln("        		date = " + DateFormat.getDateInstance().format(pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getDate().getTime()));
					outln("        		expirationid = " + DateFormat.getDateInstance().format(pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getExpiration().getTime()));
					outln("       		IDDocType:");
					outln("        			id = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getType().getId());
					outln("        			name = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getType().getName());
					outln("       	Country:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getOwner().getCountry().getId());
					outln("        		shortName = " + pShortData.getApartments()[i].getDocument().getOwner().getCountry().getShortName());
					outln("        		fullName = " + pShortData.getApartments()[i].getDocument().getOwner().getCountry().getFullName());
					outln("       	PersonShortData:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getOwner().getId());
					outln("        		status = " + pShortData.getApartments()[i].getDocument().getOwner().getStatus());
					outln("        		firstname = " + pShortData.getApartments()[i].getDocument().getOwner().getFirstName());
					outln("        		lastname = " + pShortData.getApartments()[i].getDocument().getOwner().getLastName());
					outln("        		middle = " + pShortData.getApartments()[i].getDocument().getOwner().getMiddleName());
					outln("        		rnn = " + pShortData.getApartments()[i].getDocument().getOwner().getRnn());
					outln("        		iin = " + pShortData.getApartments()[i].getDocument().getOwner().getIin());
					outln("        		address = " + pShortData.getApartments()[i].getDocument().getOwner().getAddress());
					outln("        		phone = " + pShortData.getApartments()[i].getDocument().getOwner().getPhone());
					outln("-------------------------------------");
					
				}
				outln("-------------------------------------------------------------------------");
			}
			
			
		}else{
			outln("COMPANY");
			if(count ==0){
				outln("      DocumentData: ");
				outln("        docNumber = " + pShortData.getDocument().getDocNumber());
				outln("        limitAuthority = " + pShortData.getDocument().getLimitAuthority());
				outln("        limitPerson = " + pShortData.getDocument().getLimitPerson());
				outln("        limitCondition = " + pShortData.getDocument().getLimitCondition());	
				outln("        docDate = " +  DateFormat.getDateInstance().format(pShortData.getDocument().getDocDate().getTime()));	
				outln("        docRegDate = " +  DateFormat.getDateInstance().format(pShortData.getDocument().getDocRegDate().getTime()));
				outln("       	PropertyForm:");
				outln("        		id = " + pShortData.getDocument().getPropForm().getId());
				outln("        		name = " + pShortData.getDocument().getPropForm().getName());
				outln("       	PropertyKind:");
				outln("        		id = " + pShortData.getDocument().getPropKind().getId());
				outln("        		name = " + pShortData.getDocument().getPropKind().getName());
				outln("       	DocKind:");
				outln("        		id = " + pShortData.getDocument().getDocKind().getId());
				outln("        		name = " + pShortData.getDocument().getDocKind().getName());
				outln("       	DocType:");
				outln("        		id = " + pShortData.getDocument().getDocType().getId());
				outln("        		name = " + pShortData.getDocument().getDocType().getName());
				outln("       	BuildingPurpose:");
				outln("        		id = " + pShortData.getDocument().getPurpose().getId());
				outln("        		name = " + pShortData.getDocument().getPurpose().getName());
				outln("       	IDDocument:");
				outln("        		serial = " + pShortData.getDocument().getOwner().getIdDocument().getSerial());
				outln("        		number = " + pShortData.getDocument().getOwner().getIdDocument().getNumber());
				outln("        		authority = " + pShortData.getDocument().getOwner().getIdDocument().getAuthority());
				outln("        		date = " + DateFormat.getDateInstance().format(pShortData.getDocument().getOwner().getIdDocument().getDate().getTime()));
				outln("        		expirationid = " + DateFormat.getDateInstance().format(pShortData.getDocument().getOwner().getIdDocument().getExpiration().getTime()));
				outln("       		IDDocType:");
				outln("        			id = " + pShortData.getDocument().getOwner().getIdDocument().getType().getId());
				outln("        			name = " + pShortData.getDocument().getOwner().getIdDocument().getType().getName());
				outln("       	Country:");
				outln("        		id = " + pShortData.getDocument().getOwner().getCountry().getId());
				outln("        		shortName = " + pShortData.getDocument().getOwner().getCountry().getShortName());
				outln("        		fullName = " + pShortData.getDocument().getOwner().getCountry().getFullName());
				outln("       	PersonShortData:");
				outln("        		id = " + pShortData.getDocument().getOwner().getId());
				outln("        		status = " + pShortData.getDocument().getOwner().getStatus());
				outln("        		company = " + pShortData.getDocument().getOwner().getLastName());
				outln("        		bank = " + pShortData.getDocument().getOwner().getBank());
				outln("        		bank account = " + pShortData.getDocument().getOwner().getAccount());
				outln("        		rnn = " + pShortData.getDocument().getOwner().getRnn());
				outln("        		iin = " + pShortData.getDocument().getOwner().getIin());
				outln("        		address = " + pShortData.getDocument().getOwner().getAddress());
				outln("        		phone = " + pShortData.getDocument().getOwner().getPhone());

				outln("-------------------------------------------------------------------------");
			} else {
				for(int i=0; i<pShortData.getApartments().length; i++){
					outln("      Number: "+i);
					outln("      DocumentData: ");
					outln("        flatNumber = " + pShortData.getApartments()[i].getFlatNumber());
					outln("        partLetter = " + pShortData.getApartments()[i].getPartLetter());
					outln("        phone = " + pShortData.getApartments()[i].getPhone());
					outln("        partYear = " + pShortData.getApartments()[i].getPartYear());
					outln("        pOverallSquare = " + pShortData.getApartments()[i].getPOverallSquare());
					outln("        pLiveSquare = " + pShortData.getApartments()[i].getPLiveSquare());
					outln("        rooms = " + pShortData.getApartments()[i].getRooms());
					outln("        premises = " + pShortData.getApartments()[i].getPremises());
					outln("        floor = " + pShortData.getApartments()[i].getFloor());
					outln("        docNumber = " + pShortData.getApartments()[i].getDocument().getDocNumber());
					outln("        limitAuthority = " + pShortData.getApartments()[i].getDocument().getLimitAuthority());
					outln("        limitPerson = " + pShortData.getApartments()[i].getDocument().getLimitPerson());
					outln("        limitCondition = " + pShortData.getApartments()[i].getDocument().getLimitCondition());	
					outln("        docDate = " + DateFormat.getDateInstance().format(pShortData.getApartments()[i].getDocument().getDocDate().getTime()));	
					outln("        docRegDate = " + DateFormat.getDateInstance().format(pShortData.getApartments()[i].getDocument().getDocRegDate().getTime()));
					outln("       	PropertyForm:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getPropForm().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getPropForm().getName());
					outln("       	PropertyKind:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getPropKind().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getPropKind().getName());
					outln("       	DocKind:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getDocKind().getId());
					outln("        		name = " + pShortData.getDocument().getDocKind().getName());
					outln("       	DocType:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getDocType().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getDocType().getName());
					outln("       	BuildingPurpose:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getPurpose().getId());
					outln("        		name = " + pShortData.getApartments()[i].getDocument().getPurpose().getName());
					outln("       	IDDocument:");
					outln("        		serial = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getSerial());
					outln("        		number = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getNumber());
					outln("        		authority = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getAuthority());
					outln("        		date = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getDate());
					outln("        		expirationid = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getExpiration());
					outln("       		IDDocType:");
					outln("        			id = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getType().getId());
					outln("        			name = " + pShortData.getApartments()[i].getDocument().getOwner().getIdDocument().getType().getName());
					outln("       	Country:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getOwner().getCountry().getId());
					outln("        		shortName = " + pShortData.getApartments()[i].getDocument().getOwner().getCountry().getShortName());
					outln("        		fullName = " + pShortData.getApartments()[i].getDocument().getOwner().getCountry().getFullName());
					outln("       	PersonShortData:");
					outln("        		id = " + pShortData.getApartments()[i].getDocument().getOwner().getId());
					outln("        		status = " + pShortData.getApartments()[i].getDocument().getOwner().getStatus());
					outln("        		company = " + pShortData.getApartments()[i].getDocument().getOwner().getLastName());
					outln("        		bank = " + pShortData.getApartments()[i].getDocument().getOwner().getBank());
					outln("        		bank account = " + pShortData.getApartments()[i].getDocument().getOwner().getAccount());
					outln("        		rnn = " + pShortData.getApartments()[i].getDocument().getOwner().getRnn());
					outln("        		iin = " + pShortData.getApartments()[i].getDocument().getOwner().getIin());
					outln("        		address = " + pShortData.getApartments()[i].getDocument().getOwner().getAddress());
					outln("        		phone = " + pShortData.getApartments()[i].getDocument().getOwner().getPhone());
					outln("-------------------------------------");
					
				}
				outln("-------------------------------------------------------------------------");
			}
		}
		
	}
	public static void testBTIServiceGetDataByOwnerId(long ownerId, short ownerStatus, String lang)throws RemoteException {
		outln("  Method: BTIService -> getDataByOwnerId");
		outln("    Parameters:");
		outln("      ownerId = " + ownerId);
		outln("      ownerStatus = " + ownerStatus);
		outln("      lang = " + lang);
		outln("    Result:");
		RealtySearchResult pData = bTIProxy.getDataByOwnerId(ownerId, ownerStatus, lang);
		if(ownerStatus ==1){
			outln("      PEOPLE ");
			outln("      Records found: " + pData.getTotalFound());
			
			for(int i=0; i<pData.getShortData().length; i++){
				RealtyShortData pShortData = pData.getShortData()[i];
				outln("      Record data number: "+(1+i));
				outln("        ownerId = " + pShortData.getOwnerId());
				outln("        docId = " + pShortData.getDocId());
				outln("        ownerStatus = " + pShortData.getOwnerStatus());
				outln("        oFirstName = " + pShortData.getOFirstName());	
				outln("        oLastName = " + pShortData.getOLastName());	
				outln("        oMiddleName = " + pShortData.getOMiddleName());	
				outln("        dNumber = " + pShortData.getDNumber());	
				outln("        oBirthDate = " + DateFormat.getDateInstance().format(pShortData.getOBirthDate().getTime()));
				outln("        dRegDate = " + DateFormat.getDateInstance().format(pShortData.getDRegDate().getTime()));
				outln("        DocKind: ");
				outln("        	id = " + pShortData.getDKind().getId());
				outln("        	name = " + pShortData.getDKind().getName());
				outln("        DocType: ");
				outln("        	id = " + pShortData.getDType().getId());
				outln("        	name = " + pShortData.getDType().getName());
				outln("        BuildingKind: ");
				outln("        	id = " + pShortData.getBuildingKind().getId());
				outln("        	name = " + pShortData.getBuildingKind().getName());
				outln("        Address: ");
				outln("        	house = " + pShortData.getAddress().getHouse());
				outln("        	flat = " + pShortData.getAddress().getFlat());
				outln("        	Region: ");
				outln("        		id = " + pShortData.getAddress().getRegion().getId());
				outln("        		name = " + pShortData.getAddress().getRegion().getName());
				outln("        	District: ");
				outln("        		id = " + pShortData.getAddress().getDistrict().getId());
				outln("        		name = " + pShortData.getAddress().getDistrict().getName());
				outln("        	City: ");
				outln("        		id = " + pShortData.getAddress().getCity().getId());
				outln("        		name = " + pShortData.getAddress().getCity().getName());
				outln("        	Street: ");
				outln("        		id = " + pShortData.getAddress().getStreet().getId());
				outln("        		statid = " + pShortData.getAddress().getStreet().getStatId());
				outln("        		name = " + pShortData.getAddress().getStreet().getName());
				outln("        		type:");
				outln("        			id = " +  pShortData.getAddress().getStreet().getType().getId());
				outln("        			name = " +  pShortData.getAddress().getStreet().getType().getName());
				outln("        			shortname = " + pShortData.getAddress().getStreet().getType().getShortName());
				outln("        		crosstype:");
				outln("        			id = " + pShortData.getAddress().getStreet().getCrossType().getId());
				outln("        			name = " + pShortData.getAddress().getStreet().getCrossType().getName());
				outln("        			shortname = " + pShortData.getAddress().getStreet().getCrossType().getShortName());
				outln("-------------------------------------");
			}
			
		} else {
			outln("      COMPANY ");
			outln("      Records found: " + pData.getTotalFound());
			
			for(int i=0; i<pData.getShortData().length; i++){
				RealtyShortData pShortData = pData.getShortData()[i];
				outln("      Record data number: " +(i+1));
				outln("        ownerId = " + pShortData.getOwnerId());
				outln("        docId = " + pShortData.getDocId());
				outln("        ownerStatus = " + pShortData.getOwnerStatus());	
				outln("        name = " + pShortData.getOLastName());	
				outln("        dNumber = " + pShortData.getDNumber());	
				outln("        dRegDate = " + DateFormat.getDateInstance().format(pShortData.getDRegDate().getTime()));
				outln("        DocKind: ");
				outln("        	id = " + pShortData.getDKind().getId());
				outln("        	name = " + pShortData.getDKind().getName());
				outln("        DocType: ");
				outln("        	id = " + pShortData.getDType().getId());
				outln("        	name = " + pShortData.getDType().getName());
				outln("        BuildingKind: ");
				outln("        	id = " + pShortData.getBuildingKind().getId());
				outln("        	name = " + pShortData.getBuildingKind().getName());
				outln("        Address: ");
				outln("        	house = " + pShortData.getAddress().getHouse());
				outln("        	flat = " + pShortData.getAddress().getFlat());
				outln("        	Region: ");
				outln("        		id = " + pShortData.getAddress().getRegion().getId());
				outln("        		name = " + pShortData.getAddress().getRegion().getName());
				outln("        	District: ");
				outln("        		id = " + pShortData.getAddress().getDistrict().getId());
				outln("        		name = " + pShortData.getAddress().getDistrict().getName());
				outln("        	City: ");
				outln("        		id = " + pShortData.getAddress().getCity().getId());
				outln("        		name = " + pShortData.getAddress().getCity().getName());
				outln("        	Street: ");
				outln("        		id = " + pShortData.getAddress().getStreet().getId());
				outln("        		statid = " + pShortData.getAddress().getStreet().getStatId());
				outln("        		name = " + pShortData.getAddress().getStreet().getName());
				outln("        		type:");
				outln("        			id = " +  pShortData.getAddress().getStreet().getType().getId());
				outln("        			name = " +  pShortData.getAddress().getStreet().getType().getName());
				outln("        			shortname = " + pShortData.getAddress().getStreet().getType().getShortName());
				outln("        		crosstype:");
				outln("        			id = " + pShortData.getAddress().getStreet().getCrossType().getId());
				outln("        			name = " + pShortData.getAddress().getStreet().getCrossType().getName());
				outln("        			shortname = " + pShortData.getAddress().getStreet().getCrossType().getShortName());
				outln("-------------------------------------");
			}
			
		}
		
		
		outln("-------------------------------------------------------------------------");
	
	}
	
	public static void testBTIServiceGetDataByDoc(int docKind, int docType, String docNumber,
			int pageNum, int resultsOnPage, String lang)throws RemoteException {
		outln("  Method: BTIService -> getDataByDoc");
		outln("    Parameters:");
		outln("      docKind = " + docKind);
		outln("      docType = " + docType);
		outln("      docNumber = " + docNumber);
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);
		outln("    Result:");
		RealtySearchResult pData = bTIProxy.getDataByDoc(docKind, docType, docNumber, pageNum, resultsOnPage, lang);
		outln("      Records found: " + pData.getTotalFound());
		outln("      Record data: ");
		RealtyShortData pShortData = pData.getShortData()[0];
		outln("        ownerId = " + pShortData.getOwnerId());
		outln("        docId = " + pShortData.getDocId());
		outln("        ownerStatus = " + pShortData.getOwnerStatus());
		outln("        dNumber = " + pShortData.getDNumber());	
		outln("        oBirthDate = " + DateFormat.getDateInstance().format(pShortData.getOBirthDate().getTime()));
		outln("        dRegDate = " + DateFormat.getDateInstance().format(pShortData.getDRegDate().getTime()));
		outln("        DocKind: ");
		outln("        	id = " + pShortData.getDKind().getId());
		outln("        	name = " + pShortData.getDKind().getName());
		outln("        DocType: ");
		outln("        	id = " + pShortData.getDType().getId());
		outln("        	name = " + pShortData.getDType().getName());
		outln("        BuildingKind: ");
		outln("        	id = " + pShortData.getBuildingKind().getId());
		outln("        	name = " + pShortData.getBuildingKind().getName());
		outln("        Address: ");
		outln("        	house = " + pShortData.getAddress().getHouse());
		outln("        	flat = " + pShortData.getAddress().getFlat());
		outln("        	Region: ");
		outln("        		id = " + pShortData.getAddress().getRegion().getId());
		outln("        		name = " + pShortData.getAddress().getRegion().getName());
		outln("        	District: ");
		outln("        		id = " + pShortData.getAddress().getDistrict().getId());
		outln("        		name = " + pShortData.getAddress().getDistrict().getName());
		outln("        	City: ");
		outln("        		id = " + pShortData.getAddress().getCity().getId());
		outln("        		name = " + pShortData.getAddress().getCity().getName());
		outln("        	Street: ");
		outln("        		id = " + pShortData.getAddress().getStreet().getId());
		outln("        		statid = " + pShortData.getAddress().getStreet().getStatId());
		outln("        		name = " + pShortData.getAddress().getStreet().getName());
		outln("        		type:");
		outln("        			id = " +  pShortData.getAddress().getStreet().getType().getId());
		outln("        			name = " +  pShortData.getAddress().getStreet().getType().getName());
		outln("        			shortname = " + pShortData.getAddress().getStreet().getType().getShortName());
		outln("        		crosstype:");
		outln("        			id = " + pShortData.getAddress().getStreet().getCrossType().getId());
		outln("        			name = " + pShortData.getAddress().getStreet().getCrossType().getName());
		outln("        			shortname = " + pShortData.getAddress().getStreet().getCrossType().getShortName());
		
		outln("-------------------------------------------------------------------------");
	
	}
	
	public static void testBTIServiceGetDataByAddress(int buildingKind, Street street, String house, String flat, 
			String extras, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		outln("  Method: BTIService -> getDataByAddress");
		outln("    Parameters:");
		outln("      buildingKind = " + buildingKind);
		outln("      street id= " + street.getId());
		outln("      street name= " + street.getName());
		outln("      house = " + house);
		outln("      flat = " + flat);
		outln("      extras = " + extras);
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);
		outln("    Result:");
		RealtySearchResult pData = bTIProxy.getDataByAddress(buildingKind, street, house, flat, 
				 											extras, pageNum, resultsOnPage, lang);
		outln("      Records found: " + pData.getTotalFound());
		for(int i=0; i<pData.getShortData().length; i++){			
			RealtyShortData pShortData = pData.getShortData()[i];
			outln("     Record data number: " + (i+1));
			outln("        ownerId = " + pShortData.getOwnerId());
			outln("        docId = " + pShortData.getDocId());
			outln("        ownerStatus = " + pShortData.getOwnerStatus());
			outln("        oFirstName = " + pShortData.getOFirstName());	
			outln("        oLastName = " + pShortData.getOLastName());	
			outln("        oMiddleName = " + pShortData.getOMiddleName());	
			outln("        dNumber = " + pShortData.getDNumber());	
			outln("        oBirthDate = " + DateFormat.getDateInstance().format(pShortData.getOBirthDate().getTime()));
			outln("        dRegDate = " + DateFormat.getDateInstance().format(pShortData.getDRegDate().getTime()));
			outln("        DocKind: ");
			outln("        	id = " + pShortData.getDKind().getId());
			outln("        	name = " + pShortData.getDKind().getName());
			outln("        DocType: ");
			outln("        	id = " + pShortData.getDType().getId());
			outln("        	name = " + pShortData.getDType().getName());
			outln("        BuildingKind: ");
			outln("        	id = " + pShortData.getBuildingKind().getId());
			outln("        	name = " + pShortData.getBuildingKind().getName());
			outln("        Address: ");
			outln("        	house = " + pShortData.getAddress().getHouse());
			outln("        	flat = " + pShortData.getAddress().getFlat());
			outln("        	Region: ");
			outln("        		id = " + pShortData.getAddress().getRegion().getId());
			outln("        		name = " + pShortData.getAddress().getRegion().getName());
			outln("        	District: ");
			outln("        		id = " + pShortData.getAddress().getDistrict().getId());
			outln("        		name = " + pShortData.getAddress().getDistrict().getName());
			outln("        	City: ");
			outln("        		id = " + pShortData.getAddress().getCity().getId());
			outln("        		name = " + pShortData.getAddress().getCity().getName());
			outln("        	Street: ");
			outln("        		id = " + pShortData.getAddress().getStreet().getId());
			outln("        		statid = " + pShortData.getAddress().getStreet().getStatId());
			outln("        		name = " + pShortData.getAddress().getStreet().getName());
			outln("        		type:");
			outln("        			id = " +  pShortData.getAddress().getStreet().getType().getId());
			outln("        			name = " +  pShortData.getAddress().getStreet().getType().getName());
			outln("        			shortname = " + pShortData.getAddress().getStreet().getType().getShortName());
			outln("        		crosstype:");
			outln("        			id = " + pShortData.getAddress().getStreet().getCrossType().getId());
			outln("        			name = " + pShortData.getAddress().getStreet().getCrossType().getName());
			outln("        			shortname = " + pShortData.getAddress().getStreet().getCrossType().getShortName());
			
			outln("-----------------------------------");
		}
		outln("-------------------------------------------------------------------------");
	}
	public static void testBTIServiceGetDataByOrgName(String orgName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		outln("  Method: BTIService -> getDataByOrgName");
		outln("    Parameters:");
		outln("      orgName = " + orgName);
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);
		outln("    Result:");
		PersonSearchResult pData = bTIProxy.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
		outln("      Records found: " + pData.getTotalFound());
		for(int i =0; i<pData.getShortData().length; i++){
			PersonShortData pShortData = pData.getShortData()[i];
			outln("      Record data number: "+(i+1));
			outln("         Name = " + pShortData.getLastName());
			outln("        Status = " + pShortData.getStatus());		
			outln("        RNN = " + pShortData.getRnn());
			outln("        Address = " + pShortData.getAddress());
			outln("        Phone = " + pShortData.getPhone()); 
			outln("        Bank = " + pShortData.getBank()); 
			outln("        Account = " + pShortData.getAccount()); 
			outln("        Birthday = " + DateFormat.getDateInstance().format(pShortData.getBirthDate().getTime()));
			outln("        Country:");
			outln("			id = " + pShortData.getCountry().getId());
			outln("			fullname = " + pShortData.getCountry().getFullName());
			outln("			shortname = " + pShortData.getCountry().getShortName());
			outln("-----------------------------------");
		}
		
		
		outln("-------------------------------------------------------------------------");
	}
	public static void testBTIServiceGetDataByIIN(String iin, String lang) throws RemoteException {
		outln("  Method: BTIService -> getDataByIIN");
		outln("    Parameters:");
		outln("      iin = " + iin);
		outln("      lang = " + lang);
		outln("    Result:");
		PersonSearchResult pData = bTIProxy.getDataByIIN(iin, lang);
		outln("      Records found: " + pData.getTotalFound());
		PersonShortData pShortData = pData.getShortData()[0];
		outln("        First Name = " + pShortData.getFirstName());
		outln("        Last Name = " + pShortData.getLastName());
		outln("        MiddleName = " + pShortData.getMiddleName());
		outln("        Status = " + pShortData.getStatus());		
		outln("        RNN = " + pShortData.getRnn());
		outln("        IIN = " + pShortData.getIin());
		outln("        Address = " + pShortData.getAddress());
		outln("        Phone = " + pShortData.getPhone()); 
		outln("        Bank = " + pShortData.getBank()); 
		outln("        Account = " + pShortData.getAccount()); 
		outln("        Birthday = " + DateFormat.getDateInstance().format(pShortData.getBirthDate().getTime()));
		outln("        idDocument:");
		outln("          idDocType: ");
		outln("				id = " + pShortData.getIdDocument().getType().getId());
		outln("				name = " + pShortData.getIdDocument().getType().getName());
		outln("        Country:");
		outln("			id = " + pShortData.getCountry().getId());
		outln("			fullname = " + pShortData.getCountry().getFullName());
		outln("			shortname = " + pShortData.getCountry().getShortName());

		outln("-------------------------------------------------------------------------");
	}
	public static void testBTIServiceGetDataByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		outln("  Method: BTIService -> getDataByFIO");
		outln("    Parameters:");
		outln("      lastName = " + lastName);
		outln("      firstName = " + firstName);
		outln("      middleName = " + middleName);
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);
		outln("    Result:");
		PersonSearchResult pData = bTIProxy.getDataByFIO(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
		outln("      Records found: " + pData.getTotalFound());
		for(int i=0; i<pData.getShortData().length; i++){
			PersonShortData pShortData = pData.getShortData()[i];
			outln("      Record data: " +(i+1));
			outln("        First Name = " + pShortData.getFirstName());
			outln("        Last Name = " + pShortData.getLastName());
			outln("        MiddleName = " + pShortData.getMiddleName());
			outln("        Status = " + pShortData.getStatus());		
			outln("        RNN = " + pShortData.getRnn());
			outln("        IIN = " + pShortData.getIin());
			outln("        Address = " + pShortData.getAddress());
			outln("        Phone = " + pShortData.getPhone()); 
			outln("        Bank = " + pShortData.getBank()); 
			outln("        Account = " + pShortData.getAccount()); 
			outln("        Birthday = " + DateFormat.getDateInstance().format(pShortData.getBirthDate().getTime()));
			outln("        idDocument:");
			outln("          idDocType: ");
			outln("				id = " + pShortData.getIdDocument().getType().getId());
			outln("				name = " + pShortData.getIdDocument().getType().getName());
			outln("        Country:");
			outln("			id = " + pShortData.getCountry().getId());
			outln("			fullname = " + pShortData.getCountry().getFullName());
			outln("			shortname = " + pShortData.getCountry().getShortName());
			outln("----------------------------------");
		}
		

		outln("-------------------------------------------------------------------------");
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
