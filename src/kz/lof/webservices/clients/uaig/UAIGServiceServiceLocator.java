/**
 * UAIGServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.uaig;

import kz.pchelka.env.Environment;

import org.apache.axis.client.Stub;

public class UAIGServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.clients.uaig.UAIGServiceService {

    public UAIGServiceServiceLocator() {
    }


    public UAIGServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UAIGServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UAIGService
    private java.lang.String UAIGService_address = "http://" + Environment.getExtHost("uaig") + "/WS/services/UAIGService";

    public java.lang.String getUAIGServiceAddress() {
        return UAIGService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UAIGServiceWSDDServiceName = "UAIGService";

    public java.lang.String getUAIGServiceWSDDServiceName() {
        return UAIGServiceWSDDServiceName;
    }

    public void setUAIGServiceWSDDServiceName(java.lang.String name) {
        UAIGServiceWSDDServiceName = name;
    }

    public kz.lof.webservices.clients.uaig.UAIGService getUAIGService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UAIGService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        kz.lof.webservices.clients.uaig.UAIGService uaigService = getUAIGService(endpoint);
        ((Stub)uaigService).setUsername("temp_user");
        ((Stub)uaigService).setPassword("temp_password");
        return getUAIGService(endpoint);
    }

    public kz.lof.webservices.clients.uaig.UAIGService getUAIGService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kz.lof.webservices.clients.uaig.UAIGServiceSoapBindingStub _stub = new kz.lof.webservices.clients.uaig.UAIGServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUAIGServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUAIGServiceEndpointAddress(java.lang.String address) {
        UAIGService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kz.lof.webservices.clients.uaig.UAIGService.class.isAssignableFrom(serviceEndpointInterface)) {
                kz.lof.webservices.clients.uaig.UAIGServiceSoapBindingStub _stub = new kz.lof.webservices.clients.uaig.UAIGServiceSoapBindingStub(new java.net.URL(UAIGService_address), this);
                _stub.setPortName(getUAIGServiceWSDDServiceName());
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
        if ("UAIGService".equals(inputPortName)) {
            return getUAIGService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://uaig.webservices.lof.kz", "UAIGServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://uaig.webservices.lof.kz", "UAIGService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UAIGService".equals(portName)) {
            setUAIGServiceEndpointAddress(address);
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
