/**
 * TaxPayServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.tax;

public class TaxPayServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.frontface.tax.TaxPayServiceService {

    public TaxPayServiceServiceLocator() {
    }


    public TaxPayServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaxPayServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TaxPayService
    private java.lang.String TaxPayService_address = "http://localhost:15045/WS/services/TaxPayService";

    public java.lang.String getTaxPayServiceAddress() {
        return TaxPayService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaxPayServiceWSDDServiceName = "TaxPayService";

    public java.lang.String getTaxPayServiceWSDDServiceName() {
        return TaxPayServiceWSDDServiceName;
    }

    public void setTaxPayServiceWSDDServiceName(java.lang.String name) {
        TaxPayServiceWSDDServiceName = name;
    }

    public kz.lof.webservices.frontface.tax.TaxPayService getTaxPayService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TaxPayService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTaxPayService(endpoint);
    }

    public kz.lof.webservices.frontface.tax.TaxPayService getTaxPayService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kz.lof.webservices.frontface.tax.TaxPayServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.tax.TaxPayServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTaxPayServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaxPayServiceEndpointAddress(java.lang.String address) {
        TaxPayService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kz.lof.webservices.frontface.tax.TaxPayService.class.isAssignableFrom(serviceEndpointInterface)) {
                kz.lof.webservices.frontface.tax.TaxPayServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.tax.TaxPayServiceSoapBindingStub(new java.net.URL(TaxPayService_address), this);
                _stub.setPortName(getTaxPayServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TaxPayService".equals(inputPortName)) {
            return getTaxPayService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tax.webservices.lof.kz", "TaxPayServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tax.webservices.lof.kz", "TaxPayService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TaxPayService".equals(portName)) {
            setTaxPayServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
