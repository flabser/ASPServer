/**
 * ForeignersSearchServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.ump;

public class ForeignersSearchServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.frontface.ump.ForeignersSearchServiceService {

    public ForeignersSearchServiceServiceLocator() {
    }


    public ForeignersSearchServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ForeignersSearchServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ForeignersSearchService
    private java.lang.String ForeignersSearchService_address = "http://localhost:15045/WS/services/ForeignersSearchService";

    public java.lang.String getForeignersSearchServiceAddress() {
        return ForeignersSearchService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ForeignersSearchServiceWSDDServiceName = "ForeignersSearchService";

    public java.lang.String getForeignersSearchServiceWSDDServiceName() {
        return ForeignersSearchServiceWSDDServiceName;
    }

    public void setForeignersSearchServiceWSDDServiceName(java.lang.String name) {
        ForeignersSearchServiceWSDDServiceName = name;
    }

    public kz.lof.webservices.frontface.ump.ForeignersSearchService getForeignersSearchService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ForeignersSearchService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getForeignersSearchService(endpoint);
    }

    public kz.lof.webservices.frontface.ump.ForeignersSearchService getForeignersSearchService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kz.lof.webservices.frontface.ump.ForeignersSearchServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.ump.ForeignersSearchServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getForeignersSearchServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setForeignersSearchServiceEndpointAddress(java.lang.String address) {
        ForeignersSearchService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kz.lof.webservices.frontface.ump.ForeignersSearchService.class.isAssignableFrom(serviceEndpointInterface)) {
                kz.lof.webservices.frontface.ump.ForeignersSearchServiceSoapBindingStub _stub = new kz.lof.webservices.frontface.ump.ForeignersSearchServiceSoapBindingStub(new java.net.URL(ForeignersSearchService_address), this);
                _stub.setPortName(getForeignersSearchServiceWSDDServiceName());
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
        if ("ForeignersSearchService".equals(inputPortName)) {
            return getForeignersSearchService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "ForeignersSearchServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "ForeignersSearchService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ForeignersSearchService".equals(portName)) {
            setForeignersSearchServiceEndpointAddress(address);
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
