/**
 * UDPServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.udp;

public interface UDPServiceService extends javax.xml.rpc.Service {
    public java.lang.String getUDPServiceAddress();

    public kz.lof.webservices.frontface.udp.UDPService getUDPService() throws javax.xml.rpc.ServiceException;

    public kz.lof.webservices.frontface.udp.UDPService getUDPService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
