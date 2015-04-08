/**
 * UDPCamServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.udp;

public class UDPCamServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.frontface.udp.UDPCamServiceService {

    public UDPCamServiceServiceLocator() {
    }


    public UDPCamServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UDPCamServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UDPCamService
    private java.lang.String UDPCamService_address = "http://localhost:15045/WS/services/UDPCamService";

    public java.lang.String getUDPCamServiceAddress() {
        return UDPCamService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UDPCamServiceWSDDServiceName = "UDPCamService";

    public java.lang.String getUDPCamServiceWSDDServiceName() {
        return UDPCamServiceWSDDServiceName;
    }

    public void setUDPCamServiceWSDDServiceName(java.lang.String name) {
        UDPCamServiceWSDDServiceName = name;
    }

    public kz.lof.webservices.frontface.udp.UDPCamService getUDPCamService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UDPCamService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUDPCamService(endpoint);
    }

    public kz.lof.webservices.frontface.udp.UDPCamService getUDPCamService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kz.lof.webservices.frontface.udp.UDPCamServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.udp.UDPCamServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUDPCamServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUDPCamServiceEndpointAddress(java.lang.String address) {
        UDPCamService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kz.lof.webservices.frontface.udp.UDPCamService.class.isAssignableFrom(serviceEndpointInterface)) {
                kz.lof.webservices.frontface.udp.UDPCamServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.udp.UDPCamServiceSoapBindingStub(new java.net.URL(UDPCamService_address), this);
                _stub.setPortName(getUDPCamServiceWSDDServiceName());
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
        if ("UDPCamService".equals(inputPortName)) {
            return getUDPCamService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "UDPCamServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "UDPCamService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UDPCamService".equals(portName)) {
            setUDPCamServiceEndpointAddress(address);
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
