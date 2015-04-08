/**
 * GKZServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.gkz;

import org.apache.axis.client.Stub;

public class GKZServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.clients.gkz.GKZServiceService {

    public GKZServiceServiceLocator() {
    }


    public GKZServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GKZServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GKZService
    private java.lang.String GKZService_address = "http://localhost:15045/WS/services/GKZService";

    public java.lang.String getGKZServiceAddress() {
        return GKZService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GKZServiceWSDDServiceName = "GKZService";

    public java.lang.String getGKZServiceWSDDServiceName() {
        return GKZServiceWSDDServiceName;
    }

    public void setGKZServiceWSDDServiceName(java.lang.String name) {
        GKZServiceWSDDServiceName = name;
    }

    public kz.lof.webservices.clients.gkz.GKZService getGKZService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GKZService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        kz.lof.webservices.clients.gkz.GKZService gkzService = getGKZService(endpoint);
        ((Stub)gkzService).setUsername("temp_user");
        ((Stub)gkzService).setPassword("temp_password");
        return getGKZService(endpoint);
    }

    public kz.lof.webservices.clients.gkz.GKZService getGKZService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kz.lof.webservices.clients.gkz.GKZServiceSoapBindingStub _stub = new kz.lof.webservices.clients.gkz.GKZServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGKZServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGKZServiceEndpointAddress(java.lang.String address) {
        GKZService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kz.lof.webservices.clients.gkz.GKZService.class.isAssignableFrom(serviceEndpointInterface)) {
                kz.lof.webservices.clients.gkz.GKZServiceSoapBindingStub _stub = new kz.lof.webservices.clients.gkz.GKZServiceSoapBindingStub(new java.net.URL(GKZService_address), this);
                _stub.setPortName(getGKZServiceWSDDServiceName());
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
        if ("GKZService".equals(inputPortName)) {
            return getGKZService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "GKZServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "GKZService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GKZService".equals(portName)) {
            setGKZServiceEndpointAddress(address);
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
