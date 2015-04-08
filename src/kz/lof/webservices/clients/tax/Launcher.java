package kz.lof.webservices.clients.tax;

import java.io.*;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import kz.flabs.users.User;

import kz.lof.webservices.store.tax.*;
import kz.pchelka.env.Environment;

public class Launcher {

	private static final String logFileDate = DateFormat.getDateTimeInstance().format(new Date()).replace('.', '-').replace(' ', '_').replace(':', '-');
	private static TaxIndServiceProxy taxIndProxy;
	private static TaxPayServiceProxy taxPayProxy;

	// ��� �����, � ������� ������������ ��� ������������, �������� ������ ��� ������ ���� � �������
	private static final String logFileName = "";
	// ���� � �����, ����. C:\Test\
	private static final String logFilePath = "";

	public static void main(String[] args) {
		//Environment.addExtHost("nk", "192.168.0.13:9892", "��");
		Environment.addExtHost("nk", "192.168.0.83", "НК");
		taxIndProxy = new TaxIndServiceProxy(new User("temp_user"));
		taxPayProxy = new TaxPayServiceProxy(new User("temp_user"));
		try {
			testTaxPayServiceGetDataByOrgName("*ь*", 0, 0, "РУС");
			/*testTaxIndServiceGetDataByFIO("��?��*", "��?��*��", "�����*", 0, 0, "RUS");
			testTaxIndServiceGetDataByRNN("412400322455", "RUS");
			testTaxIndServiceGetFullData(1, "RUS");
			testTaxPayServiceGetDataByFIO("������*", "", "", 0, 0, "RUS");
			testTaxPayServiceGetDataByOrgName("*magenta*", 0, 0, "RUS");
			testTaxPayServiceGetDataByRNN("031400076729", "RUS");
			testTaxPayServiceGetDataByIIN("790105302010", "RUS");*/
			//testTaxPayServiceGetFullData((long)2, (short)2, "RUS");
			/*Address adr1 = new Address();
			Address adr2 = new Address();
			adr1.setStreet(new Street(0, "фурманова"));
			//adr1.setHouse("271");
			adr2.setStreet(new Street(0, "таугуль-1"));
			adr2.setHouse("50");
			testTaxPayServiceGetOrgsByAddress(new Address[]{adr1, adr2}, new GregorianCalendar(1997, 1, 1).getTime(), null, 0, 0, "RUS");
			*///testTaxPayServiceGetFullData((long)9, (short)2, "RUS");
			//Address[] adr = {new Address(new State(), new Region(), new Place(), new Street(1, "���������"), "130", "45")};
			//testTaxPayServiceGetOrgsByAddress(adr, new Date(), new Date(), 0, 0, "RUS");
		} catch (RemoteException re) {
			System.out.println("������� ����");
			re.printStackTrace();
		}
	}

	public static void testTaxPayServiceGetOrgsByAddress(Address[] adr, Date fromDate, Date toDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		outln("  Method: TaxPayService -> getOrgsByAddress");
		/*outln("    Parameters:");
		outln("      Addresses:");
		for (Address a : adr) {
			outln("        State = " + a.getState().getId() + " (" + a.getState().getName() + ")");
			outln("        Region = " + a.getRegion().getId() + " (" + a.getRegion().getName() + ")");
			outln("        Place = " + a.getPlace().getId() + " (" + a.getPlace().getName() + ")");
			outln("        Street = " + a.getStreet().getId() + " (" + a.getStreet().getName() + ")");
			outln("        House = " + a.getHouse());
			outln("        Flat = " + a.getFlat());
			outln("        ----");
		}
		outln("      fromDate = " + DateFormat.getDateInstance().format(fromDate));
		outln("      toDate = " + DateFormat.getDateInstance().format(toDate));
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);*/
		outln("    Result:");
		TaxPayerFullData[] pData = taxPayProxy.getOrgsByAddresses(adr, fromDate, toDate, 0, 0, lang);
		outln("      Orgs found: " + pData.length);
		for (TaxPayerFullData data : pData) {
			outln("========================================================================");
			outln("        Company Name = " + data.getFirstName());
			outln("        Should be empty = " + data.getLastName());
			outln("        Should be empty = " + data.getMiddleName());
			outln("        Company ID = " + data.getId());
			outln("        Payer Status = " + data.getStatus() +
					" (" + (data.getStatus() == 1 ? "company" : "person") + ")");
			outln("        RNN = " + data.getRnn());
			outln("        IIN = " + data.getIin());
			outln("        OKPO Number = " + data.getDocNumber());
			outln("        Company Registration Date = " + DateFormat.getDateInstance().format(data.getBirthDate().getTime()));
			outln("        Real Address:");
			outln("          State = " + data.getRealAddress().getState().getId() +
					" (" + data.getRealAddress().getState().getName() + ")");
			outln("          Region = " + data.getRealAddress().getRegion().getId() +
					" (" + data.getRealAddress().getRegion().getName() + ")");
			outln("          City = " + data.getRealAddress().getPlace().getId() +
					" (" + data.getRealAddress().getPlace().getName() + ")");
			outln("          Street = " + data.getRealAddress().getStreet().getId() +
					" (" + data.getRealAddress().getStreet().getName() + ")");
			outln("          House = " + data.getRealAddress().getHouse());
			outln("          Flat = " + data.getRealAddress().getFlat());
			outln("        Registration Address:");
			outln("          State = " + data.getRegAddress().getState().getId() +
					" (" + data.getRegAddress().getState().getName() + ")");
			outln("          Region = " + data.getRegAddress().getRegion().getId() +
					" (" + data.getRegAddress().getRegion().getName() + ")");
			outln("          City = " + data.getRegAddress().getPlace().getId() +
					" (" + data.getRegAddress().getPlace().getName() + ")");
			outln("          Street = " + data.getRegAddress().getStreet().getId() +
					" (" + data.getRegAddress().getStreet().getName() + ")");
			outln("          House = " + data.getRegAddress().getHouse());
			outln("          Flat = " + data.getRegAddress().getFlat());
			outln("-------------------------------------------------------------------------");
		}
	}

	public static void testTaxPayServiceGetFullData(long payerId, short payerStatus, String lang) throws RemoteException {
		outln("  Method: TaxPayService -> getFullData");
		outln("    Parameters:");
		outln("      payerId = " + payerId);
		outln("      payerStatus = " + payerStatus);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxPayerFullData pData = taxPayProxy.getFullData(payerId, payerStatus, lang);
		outln("      Record data:");
		String entity = (pData.getStatus() == 1 ? "Company" : "Person");
		outln("        " + entity + " ID = " + pData.getId());
		outln("        Payer Status = " + pData.getStatus() +
				" (" + (pData.getStatus() == 1 ? "company" : "person") + ")");
		outln("        RNN = " + pData.getRnn());
		outln("        IIN = " + pData.getIin());
		outln("        " + entity + " First Name = " + pData.getFirstName());
		outln("        " + entity + " Last Name = " + pData.getLastName());
		outln("        " + entity + " Middle Name = " + pData.getMiddleName());
		outln("        " + entity + " Birthday = " + DateFormat.getDateInstance().format(pData.getBirthDate().getTime()));
		outln("        Real Address:");
		outln("          State = " + pData.getRealAddress().getState().getId() +
				" (" + pData.getRealAddress().getState().getName() + ")");
		outln("          Region = " + pData.getRealAddress().getRegion().getId() +
				" (" + pData.getRealAddress().getRegion().getName() + ")");
		outln("          City = " + pData.getRealAddress().getPlace().getId() +
				" (" + pData.getRealAddress().getPlace().getName() + ")");
		outln("          Street = " + pData.getRealAddress().getStreet().getId() +
				" (" + pData.getRealAddress().getStreet().getName() + ")");
		outln("          House = " + pData.getRealAddress().getHouse());
		outln("          Flat = " + pData.getRealAddress().getFlat());
		outln("        Registration Address:");
		outln("          State = " + pData.getRegAddress().getState().getId() +
				" (" + pData.getRegAddress().getState().getName() + ")");
		outln("          Region = " + pData.getRegAddress().getRegion().getId() +
				" (" + pData.getRegAddress().getRegion().getName() + ")");
		outln("          City = " + pData.getRegAddress().getPlace().getId() +
				" (" + pData.getRegAddress().getPlace().getName() + ")");
		outln("          Street = " + pData.getRegAddress().getStreet().getId() +
				" (" + pData.getRegAddress().getStreet().getName() + ")");
		outln("          House = " + pData.getRegAddress().getHouse());
		outln("          Flat = " + pData.getRegAddress().getFlat());
		outln("        " + entity + " Registration Date = " + DateFormat.getDateInstance().format(pData.getRegDate().getTime()));
		outln("        Person Document Serial = " + pData.getDocSerial());
		outln("        Person Document Number = " + pData.getDocNumber());
		outln("        Person Document Release Date = " + DateFormat.getDateInstance().format(pData.getDocReleaseDate().getTime()));
		outln("        Person Document Authority = " + pData.getDocAuthority());
		outln("        Company Registry Number = " + pData.getRegistryNumber());
		outln("        Company's Type of Activity = " + pData.getActivityType().getId() +
				" (" + pData.getActivityType().getName() + ", " + pData.getActivityType().getBranchCode() + ")");
		outln("        Company's Form of Organization = " + pData.getOrgForm().getId() +
				" (" + pData.getOrgForm().getName() + ")");
		outln("        Company's Form of Property = " + pData.getPropForm().getId() +
				" (" + pData.getPropForm().getName() + ")");
		outln("        Company's Form of Legal Person = " + pData.getPersonType().getId() +
				" (" + pData.getPersonType().getName() + ")");
		outln("        Company's OKPO = " + pData.getOkpo());
		outln("-------------------------------------------------------------------------");
	}


	public static void testTaxPayServiceGetDataByIIN(String iin, String lang) throws RemoteException {
		outln("  Method: TaxPayService -> getDataByIIN");
		outln("    Parameters:");
		outln("      iin = " + iin);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxPayersSearchResult pData = taxPayProxy.getDataByIIN(iin, lang);
		outln("      Records found: " + pData.getTotalFound());
		outln("      First record data: ");
		TaxPayerShortData pShortData = pData.getShortData()[0];
		outln("        First Name = " + pShortData.getFirstName());
		outln("        Last Name = " + pShortData.getLastName());
		outln("        MiddleName = " + pShortData.getMiddleName());
		outln("        People ID = " + pShortData.getId());
		outln("        Payer Status = " + pShortData.getStatus() +
				" (" + (pShortData.getStatus() == 1 ? "company" : "person") + ")");
		outln("        RNN = " + pShortData.getRnn());
		outln("        IIN = " + pShortData.getIin());
		outln("        Document Number = " + pShortData.getDocNumber());
		outln("        Phone = " + pShortData.getPhone());
		outln("        Birthday = " + DateFormat.getDateInstance().format(pShortData.getBirthDate().getTime()));
		outln("        Real Address:");
		outln("          State = " + pShortData.getRealAddress().getState().getId() +
				" (" + pShortData.getRealAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRealAddress().getRegion().getId() +
				" (" + pShortData.getRealAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRealAddress().getPlace().getId() +
				" (" + pShortData.getRealAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRealAddress().getStreet().getId() +
				" (" + pShortData.getRealAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRealAddress().getHouse());
		outln("          Flat = " + pShortData.getRealAddress().getFlat());
		outln("        Registration Address:");
		outln("          State = " + pShortData.getRegAddress().getState().getId() +
				" (" + pShortData.getRegAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRegAddress().getRegion().getId() +
				" (" + pShortData.getRegAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRegAddress().getPlace().getId() +
				" (" + pShortData.getRegAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRegAddress().getStreet().getId() +
				" (" + pShortData.getRegAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRegAddress().getHouse());
		outln("          Flat = " + pShortData.getRegAddress().getFlat());
		outln("-------------------------------------------------------------------------");
	}

	public static void testTaxPayServiceGetDataByRNN(String rnn, String lang) throws RemoteException {
		outln("  Method: TaxPayService -> getDataByRNN");
		outln("    Parameters:");
		outln("      rnn = " + rnn);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxPayersSearchResult pData = taxPayProxy.getDataByRNN(rnn, lang);
		outln("      Records found: " + pData.getTotalFound());
		outln("      First record data: ");
		TaxPayerShortData pShortData = pData.getShortData()[0];
		String entity = (pShortData.getStatus() == 1 ? "Company" : "Person");
		outln("        " + entity + " Name = " + pShortData.getFirstName());
		outln("        " + entity + " Last Name = " + pShortData.getLastName());
		outln("        " + entity + " Middle Name  = " + pShortData.getMiddleName());
		outln("        " + entity + " ID = " + pShortData.getId());
		outln("        Payer Status = " + pShortData.getStatus() +
				" (" + (pShortData.getStatus() == 1 ? "company" : "person") + ")");
		outln("        RNN = " + pShortData.getRnn());
		outln("        IIN = " + pShortData.getIin());
		outln("        OKPO Number or Document Number = " + pShortData.getDocNumber());
		outln("        Phone = " + pShortData.getPhone());
		outln("        " + entity + " Birthday = " + DateFormat.getDateInstance().format(pShortData.getBirthDate().getTime()));
		outln("        Real Address:");
		outln("          State = " + pShortData.getRealAddress().getState().getId() +
				" (" + pShortData.getRealAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRealAddress().getRegion().getId() +
				" (" + pShortData.getRealAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRealAddress().getPlace().getId() +
				" (" + pShortData.getRealAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRealAddress().getStreet().getId() +
				" (" + pShortData.getRealAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRealAddress().getHouse());
		outln("          Flat = " + pShortData.getRealAddress().getFlat());
		outln("        Registration Address:");
		outln("          State = " + pShortData.getRegAddress().getState().getId() +
				" (" + pShortData.getRegAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRegAddress().getRegion().getId() +
				" (" + pShortData.getRegAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRegAddress().getPlace().getId() +
				" (" + pShortData.getRegAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRegAddress().getStreet().getId() +
				" (" + pShortData.getRegAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRegAddress().getHouse());
		outln("          Flat = " + pShortData.getRegAddress().getFlat());
		outln("-------------------------------------------------------------------------");
	}

	public static void testTaxPayServiceGetDataByOrgName(String orgName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		outln("  Method: TaxPayService -> getDataByOrgName");
		outln("    Parameters:");
		outln("      orgName = " + orgName);
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxPayersSearchResult pData = taxPayProxy.getDataByOrgName(orgName, pageNum, resultsOnPage, lang);
		outln("      Records found: " + pData.getTotalFound());
		outln("      First record data: ");
		TaxPayerShortData pShortData = pData.getShortData()[0];
		outln("        Company Name = " + pShortData.getFirstName());
		outln("        Should be empty = " + pShortData.getLastName());
		outln("        Should be empty = " + pShortData.getMiddleName());
		outln("        Company ID = " + pShortData.getId());
		outln("        Payer Status = " + pShortData.getStatus() +
				" (" + (pShortData.getStatus() == 1 ? "company" : "person") + ")");
		outln("        RNN = " + pShortData.getRnn());
		outln("        IIN = " + pShortData.getIin());
		outln("        OKPO Number = " + pShortData.getDocNumber());
		outln("        Phone = " + pShortData.getPhone());
		outln("        Company Registration Date = " + DateFormat.getDateInstance().format(pShortData.getBirthDate().getTime()));
		outln("        Real Address:");
		outln("          State = " + pShortData.getRealAddress().getState().getId() +
				" (" + pShortData.getRealAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRealAddress().getRegion().getId() +
				" (" + pShortData.getRealAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRealAddress().getPlace().getId() +
				" (" + pShortData.getRealAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRealAddress().getStreet().getId() +
				" (" + pShortData.getRealAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRealAddress().getHouse());
		outln("          Flat = " + pShortData.getRealAddress().getFlat());
		outln("        Registration Address:");
		outln("          State = " + pShortData.getRegAddress().getState().getId() +
				" (" + pShortData.getRegAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRegAddress().getRegion().getId() +
				" (" + pShortData.getRegAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRegAddress().getPlace().getId() +
				" (" + pShortData.getRegAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRegAddress().getStreet().getId() +
				" (" + pShortData.getRegAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRegAddress().getHouse());
		outln("          Flat = " + pShortData.getRegAddress().getFlat());
		outln("-------------------------------------------------------------------------");
	}

	public static void testTaxPayServiceGetDataByFIO(String lastName, String firstName, String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		outln("  Method: TaxPayService -> getDataByFIO");
		outln("    Parameters:");
		outln("      lastName = " + lastName);
		outln("      firstName = " + firstName);
		outln("      middleName = " + middleName);
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxPayersSearchResult pData = taxPayProxy.getDataByFIO(lastName, firstName, middleName, pageNum, resultsOnPage, lang);
		outln("      Records found: " + pData.getTotalFound());
		outln("      First record data: ");
		TaxPayerShortData pShortData = pData.getShortData()[0];
		outln("        First Name = " + pShortData.getFirstName());
		outln("        Last Name = " + pShortData.getLastName());
		outln("        MiddleName = " + pShortData.getMiddleName());
		outln("        People ID = " + pShortData.getId());
		outln("        Payer Status = " + pShortData.getStatus() +
				" (" + (pShortData.getStatus() == 1 ? "company" : "person") + ")");
		outln("        RNN = " + pShortData.getRnn());
		outln("        IIN = " + pShortData.getIin());
		outln("        Document Number = " + pShortData.getDocNumber());
		outln("        Phone = " + pShortData.getPhone());
		outln("        Birthday = " + DateFormat.getDateInstance().format(pShortData.getBirthDate().getTime()));
		outln("        Real Address:");
		outln("          State = " + pShortData.getRealAddress().getState().getId() +
				" (" + pShortData.getRealAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRealAddress().getRegion().getId() +
				" (" + pShortData.getRealAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRealAddress().getPlace().getId() +
				" (" + pShortData.getRealAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRealAddress().getStreet().getId() +
				" (" + pShortData.getRealAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRealAddress().getHouse());
		outln("          Flat = " + pShortData.getRealAddress().getFlat());
		outln("        Registration Address:");
		outln("          State = " + pShortData.getRegAddress().getState().getId() +
				" (" + pShortData.getRegAddress().getState().getName() + ")");
		outln("          Region = " + pShortData.getRegAddress().getRegion().getId() +
				" (" + pShortData.getRegAddress().getRegion().getName() + ")");
		outln("          City = " + pShortData.getRegAddress().getPlace().getId() +
				" (" + pShortData.getRegAddress().getPlace().getName() + ")");
		outln("          Street = " + pShortData.getRegAddress().getStreet().getId() +
				" (" + pShortData.getRegAddress().getStreet().getName() + ")");
		outln("          House = " + pShortData.getRegAddress().getHouse());
		outln("          Flat = " + pShortData.getRegAddress().getFlat());
		outln("-------------------------------------------------------------------------");
	}

	public static void testTaxIndServiceGetFullData(long indID, String lang) throws RemoteException {
		outln("  Method: TaxIndService -> getFullData");
		outln("    Parameters:");
		outln("      indID = " + indID);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxIndFullData iFullData = taxIndProxy.getFullData(indID, lang);
		outln("      Record Data: ");
		outln("        First Name = " + iFullData.getFirstName());
		outln("        Last Name = " + iFullData.getLastName());
		outln("        Middle Name = " + iFullData.getMiddleName());
		outln("        RNN = " + iFullData.getRnn());
		outln("        IIN = " + iFullData.getIin());
		outln("        Address:");
		outln("          State = " + iFullData.getAddress().getState().getId() +
				" (" + iFullData.getAddress().getState().getName() + ")");
		outln("          Region = " + iFullData.getAddress().getRegion().getId() +
				" (" + iFullData.getAddress().getRegion().getName() + ")");
		outln("          City = " + iFullData.getAddress().getPlace().getId() +
				" (" + iFullData.getAddress().getPlace().getName() + ")");
		outln("          Street = " + iFullData.getAddress().getStreet().getId() +
				" (" + iFullData.getAddress().getStreet().getName() + ")");
		outln("          House = " + iFullData.getAddress().getHouse());
		outln("          Flat = " + iFullData.getAddress().getFlat());
		outln("        Individual ID = " + iFullData.getId());
		outln("        People ID = " + iFullData.getPayerId());
		outln("        Activity Place = " + iFullData.getActivityPlace());
		outln("        Activity Type = " + iFullData.getActivityType());
		outln("        Business Name = " + iFullData.getBusinessName());
		outln("        Business Type = " + iFullData.getBusinessType() + 
				" (" + (iFullData.getBusinessType() == 1 ? "personal" : "cooperative") + ")");
		outln("        Type of cooperative business = " + iFullData.getCooperativeType() + 
				" (1 - married couple, 2 - family, 3 - partnership)");
		outln("        Quantity of members = " + iFullData.getCooperativeCount());
		outln("        Declaration type = " + iFullData.getDeclarationType() + 
				" (" + (iFullData.getDeclarationType() == 1 ? "first" : "data change") + ")");
		outln("        Document serial = " + iFullData.getDocSerial());
		outln("        Document number = " + iFullData.getDocNumber());
		outln("        Document release date = " + DateFormat.getDateInstance().format(iFullData.getDocReleaseDate().getTime()));
		outln("        Document authority = " + iFullData.getDocAuthority());
		outln("        Farm sign = " + iFullData.getIsFarm());
		outln("        Declaration Sent Date = " + DateFormat.getDateInstance().format(iFullData.getDeclarationSentDate().getTime()));
		outln("        Declaration Received Date = " + DateFormat.getDateInstance().format(iFullData.getDeclarationReceivedDate().getTime()));
		outln("        Officer = " + iFullData.getOfficerFullName());
		outln("        Taxing Office = " + iFullData.getTaxingOffice().getId() +
				" (" + iFullData.getTaxingOffice().getName() + ")");
		outln("        License Start Date = " + DateFormat.getDateInstance().format(iFullData.getLicenseStartDate().getTime()));
		outln("        License End Date = " + DateFormat.getDateInstance().format(iFullData.getLicenseEndDate().getTime()));
		outln("-------------------------------------------------------------------------");
	}

	public static void testTaxIndServiceGetDataByRNN(String rnn, String lang) throws RemoteException {
		outln("  Method: TaxIndService -> getDataByRNN");
		outln("    Parameters:");
		outln("      rnn = " + rnn);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxIndSearchResult iData = taxIndProxy.getDataByRNN(rnn, lang);
		outln("      Records found: " + iData.getTotalFound());
		outln("      First record data: ");
		TaxIndShortData iShortData = iData.getShortData()[0];
		outln("        First Name = " + iShortData.getFirstName());
		outln("        Last Name = " + iShortData.getLastName());
		outln("        MiddleName = " + iShortData.getMiddleName());
		outln("        Individual ID = " + iShortData.getId());
		outln("        People ID = " + iShortData.getPayerId());
		outln("        RNN = " + iShortData.getRnn());
		outln("        IIN = " + iShortData.getIin());
		outln("        Business Name = " + iShortData.getBusinessName());
		outln("        Business Type = " + iShortData.getBusinessType() + 
				" (" + (iShortData.getBusinessType() == 1 ? "personal" : "cooperative") + ")");
		outln("-------------------------------------------------------------------------");
	}

	public static void testTaxIndServiceGetDataByFIO(String lastName, String firstName, String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
		outln("  Method: TaxIndService -> getDataByFIO");
		outln("    Parameters:");
		outln("      lastName = " + lastName);
		outln("      firstName = " + firstName);
		outln("      middleName = " + middleName);
		outln("      pageNum = " + pageNum);
		outln("      resultsOnPage = " + resultsOnPage);
		outln("      lang = " + lang);
		outln("    Result:");
		TaxIndSearchResult iData = taxIndProxy.getDataByFIO(lastName, firstName, middleName, pageNum, resultsOnPage, lang);
		outln("      Records found: " + iData.getTotalFound());
		outln("      First record data: ");
		TaxIndShortData iShortData = iData.getShortData()[0];
		outln("        First Name = " + iShortData.getFirstName());
		outln("        Last Name = " + iShortData.getLastName());
		outln("        MiddleName = " + iShortData.getMiddleName());
		outln("        Individual ID = " + iShortData.getId());
		outln("        People ID = " + iShortData.getPayerId());
		outln("        RNN = " + iShortData.getRnn());
		outln("        IIN = " + iShortData.getIin());
		outln("        Business Name = " + iShortData.getBusinessName());
		outln("        Business Type = " + iShortData.getBusinessType() + 
				" (" + (iShortData.getBusinessType() == 1 ? "personal" : "cooperative") + ")");
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
