/**
 * SocialService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.social;

public interface SocialService extends java.rmi.Remote {
    public kz.lof.webservices.store.social.HumanFullData getHumanById(int idPerson, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.social.Street[] getStreets(String name, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.social.HumanSearchResult getHumanByAddress(kz.lof.webservices.store.social.Address[] addresses, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.social.HumanSearchResult getHumanByDistrict(kz.lof.webservices.store.social.District[] districts, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.social.District[] getDistricts(String name, String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.social.HumanSearchResult getHumanByFullName(String firstname, String lastname, String middlename, int pageNum, int resultsOnPage, String lang) throws java.rmi.RemoteException;
}
