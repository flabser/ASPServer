/**
 * UDPCamService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.udp;

public interface UDPCamService extends java.rmi.Remote {
    public kz.lof.webservices.store.udp.HumanShortData getAddressByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, java.util.Date birthDate, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.TrustData[] getWarrByGRNZ(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.udp.VehicleFullData getFullDataByGRNZ(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException;
}
