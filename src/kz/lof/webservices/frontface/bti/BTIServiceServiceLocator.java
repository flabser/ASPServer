/**
 * BTIServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.bti;

public class BTIServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.frontface.bti.BTIServiceService {

    public BTIServiceServiceLocator() {
    }


    public BTIServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BTIServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BTIService
    private java.lang.String BTIService_address = "http://localhost:15045/WS/services/BTIService";

    public java.lang.String getBTIServiceAddress() {
        return BTIService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BTIServiceWSDDServiceName = "BTIService";

    public java.lang.String getBTIServiceWSDDServiceName() {
        return BTIServiceWSDDServiceName;
    }

    public void setBTIServiceWSDDServiceName(java.lang.String name) {
        BTIServiceWSDDServiceName = name;
    }

    public kz.lof.webservices.frontface.bti.BTIService getBTIService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BTIService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBTIService(endpoint);
    }

    public kz.lof.webservices.frontface.bti.BTIService getBTIService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kz.lof.webservices.frontface.bti.BTIServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.bti.BTIServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBTIServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBTIServiceEndpointAddress(java.lang.String address) {
        BTIService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kz.lof.webservices.frontface.bti.BTIService.class.isAssignableFrom(serviceEndpointInterface)) {
                kz.lof.webservices.frontface.bti.BTIServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.bti.BTIServiceSoapBindingStub(new java.net.URL(BTIService_address), this);
                _stub.setPortName(getBTIServiceWSDDServiceName());
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
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
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
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
