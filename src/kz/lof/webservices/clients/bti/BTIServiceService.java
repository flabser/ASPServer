/**
 * BTIServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.bti;

public interface BTIServiceService extends javax.xml.rpc.Service {
    public String getBTIServiceAddress();

    public BTIService getBTIService() throws javax.xml.rpc.ServiceException;

    public BTIService getBTIService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
