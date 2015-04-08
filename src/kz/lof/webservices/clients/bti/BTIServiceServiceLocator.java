/**
 * BTIServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.bti;

import kz.pchelka.env.Environment;
import org.apache.axis.client.Stub;

public class BTIServiceServiceLocator extends org.apache.axis.client.Service implements BTIServiceService {

    public BTIServiceServiceLocator() {
    }


    public BTIServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BTIServiceServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BTIService
    private String BTIService_address = "http://" + Environment.getExtHost("bti") + "/WS/services/BTIService";

    public String getBTIServiceAddress() {
        return BTIService_address;
    }

    // The WSDD service name defaults to the port name.
    private String BTIServiceWSDDServiceName = "BTIService";

    public String getBTIServiceWSDDServiceName() {
        return BTIServiceWSDDServiceName;
    }

    public void setBTIServiceWSDDServiceName(String name) {
        BTIServiceWSDDServiceName = name;
    }

    public BTIService getBTIService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BTIService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        kz.lof.webservices.clients.bti.BTIService bss = getBTIService(endpoint);
        ((Stub)bss).setUsername("temp_user");
        ((Stub)bss).setPassword("temp_password");
        return bss;
    }

    public BTIService getBTIService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BTIServiceSoapBindingStub _stub = new BTIServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBTIServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBTIServiceEndpointAddress(String address) {
        BTIService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (BTIService.class.isAssignableFrom(serviceEndpointInterface)) {
                BTIServiceSoapBindingStub _stub = new BTIServiceSoapBindingStub(new java.net.URL(BTIService_address), this);
                _stub.setPortName(getBTIServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
        if ("BTIService".equals(inputPortName)) {
            return getBTIService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bti.webservices.lof.kz", "BTIServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bti.webservices.lof.kz", "BTIService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("BTIService".equals(portName)) {
            setBTIServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
