/**
 * SocialServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.social;

import kz.pchelka.env.Environment;
import org.apache.axis.client.Stub;

public class SocialServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.frontface.social.SocialServiceService {

    public SocialServiceServiceLocator() {
    }


    public SocialServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SocialServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SocialService
    private java.lang.String SocialService_address = "http://" +  Environment.getExtHost("social") + "/WS/services/SocialService";

    public java.lang.String getSocialServiceAddress() {
        return SocialService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SocialServiceWSDDServiceName = "SocialService";

    public java.lang.String getSocialServiceWSDDServiceName() {
        return SocialServiceWSDDServiceName;
    }

    public void setSocialServiceWSDDServiceName(java.lang.String name) {
        SocialServiceWSDDServiceName = name;
    }

    public kz.lof.webservices.frontface.social.SocialService getSocialService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SocialService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }

        SocialService social = getSocialService(endpoint);
        ((Stub)social).setUsername("temp_user");
        ((Stub)social).setPassword("temp_password");
        return social;
    }

    public kz.lof.webservices.frontface.social.SocialService getSocialService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kz.lof.webservices.frontface.social.SocialServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.social.SocialServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSocialServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSocialServiceEndpointAddress(java.lang.String address) {
        SocialService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kz.lof.webservices.frontface.social.SocialService.class.isAssignableFrom(serviceEndpointInterface)) {
                kz.lof.webservices.frontface.social.SocialServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.social.SocialServiceSoapBindingStub(new java.net.URL(SocialService_address), this);
                _stub.setPortName(getSocialServiceWSDDServiceName());
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
        if ("SocialService".equals(inputPortName)) {
            return getSocialService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://social.webservices.lof.kz", "SocialServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://social.webservices.lof.kz", "SocialService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SocialService".equals(portName)) {
            setSocialServiceEndpointAddress(address);
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
