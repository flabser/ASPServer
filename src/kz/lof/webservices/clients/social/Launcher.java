package kz.lof.webservices.clients.social;

import kz.flabs.users.User;
import kz.lof.webservices.store.social.*;
import kz.pchelka.env.Environment;

public class Launcher {

    private static SocialServiceProxy ssProxy;

    public static void main(String[] args) {
        Environment.addExtHost("social", "localhost:15045", "SOCIAL");
        ssProxy = new SocialServiceProxy(new User("temp_user"));

        String firstName = "АННА";
        String lastName = "ВЕРХОВОД";
        String middleName = "*";
        int pageNum = 1;
        int resultsOnPage = 50;
        String lang = "rus";
        District[] districts = new District[]{
                new District(1, "АЛАТАУСКИЙ")
        };
        int idPerson = 8;
        Address[] addresses = new Address[]{
                new Address(new District(1, "АЛАТАУСКИЙ"), "", "", new Street(20, ""))
        };

        try {
            testGetStreets("мака*");
            testGetHumanByFullName(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
            testGetHumanByDistrict(districts, pageNum, resultsOnPage, lang);
            testGetHumanById(idPerson, lang);
            testGetHumanByAddress(addresses, pageNum, resultsOnPage, lang);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void testGetStreets(String name) throws Exception {
        Street[] iData = ssProxy.getStreets(name, "rus");
        System.out.println();
    }

    public static void testGetHumanByFullName(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws Exception {
        HumanSearchResult iData = ssProxy.getHumanByFullName(firstName, lastName, middleName, pageNum, resultsOnPage, lang);
        System.out.println();
    }

    public static void testGetHumanByDistrict(District[] districts, int pageNum, int resultsOnPage, String lang) throws Exception {
        HumanSearchResult iData = ssProxy.getHumanByDistrict(districts, pageNum, resultsOnPage, lang);
        System.out.println();
    }

    public static void testGetHumanById(int idPerson, String lang) throws Exception {
        HumanFullData iData = ssProxy.getHumanById(idPerson, lang);
        System.out.println();
    }

    public static void testGetHumanByAddress(Address[] addresses, int pageNum, int resultsOnPage, String lang) throws Exception {
        HumanSearchResult iData = ssProxy.getHumanByAddress(addresses, pageNum, resultsOnPage, lang);
        System.out.println();
    }
}
