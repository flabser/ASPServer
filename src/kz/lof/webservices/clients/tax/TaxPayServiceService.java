/**
 * TaxPayServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.tax;

public interface TaxPayServiceService extends javax.xml.rpc.Service {
    public java.lang.String getTaxPayServiceAddress();

    public kz.lof.webservices.clients.tax.TaxPayService getTaxPayService() throws javax.xml.rpc.ServiceException;

    public kz.lof.webservices.clients.tax.TaxPayService getTaxPayService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
