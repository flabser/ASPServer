/**
 * UDPCamServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.udp;

import org.apache.axis.MessageContext;
import kz.lof.webservices.clients.udp.UDPCamService;
import kz.lof.webservices.clients.udp.UDPCamServiceProxy;
import kz.flabs.users.User;

public class UDPCamServiceSoapBindingImpl implements kz.lof.webservices.frontface.udp.UDPCamService{
    public kz.lof.webservices.store.udp.HumanShortData getAddressByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, java.util.Date birthDate, java.lang.String lang) throws java.rmi.RemoteException {
        UDPCamService svc = new UDPCamServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getAddressByFIO(firstName, lastName, middleName, birthDate, lang);
    }

    public kz.lof.webservices.store.udp.TrustData[] getWarrByGRNZ(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPCamService svc = new UDPCamServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getWarrByGRNZ(grnz, lang);
    }

    public kz.lof.webservices.store.udp.VehicleFullData getFullDataByGRNZ(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException {
    	UDPCamService svc = new UDPCamServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.getFullDataByGRNZ(grnz, lang);
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
    	UDPCamService svc = new UDPCamServiceProxy((User) MessageContext.getCurrentContext().getProperty("kz.lof.webservices.current_user"));
        return svc.testService();
    }

}
