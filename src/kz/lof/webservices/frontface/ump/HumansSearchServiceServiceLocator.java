/**
 * HumansSearchServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.frontface.ump;

import kz.pchelka.env.Environment;
import org.apache.axis.client.Stub;

public class HumansSearchServiceServiceLocator extends org.apache.axis.client.Service implements HumansSearchServiceService {

    public HumansSearchServiceServiceLocator() {
    }


    public HumansSearchServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HumansSearchServiceServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HumansSearchService
    private String HumansSearchService_address = "http://" + Environment.getExtHost("ump") + "/WS/services/HumansSearchService";

    public String getHumansSearchServiceAddress() {
        return HumansSearchService_address;
    }

    // The WSDD service name defaults to the port name.
    private String HumansSearchServiceWSDDServiceName = "HumansSearchService";

    public String getHumansSearchServiceWSDDServiceName() {
        return HumansSearchServiceWSDDServiceName;
    }

    public void setHumansSearchServiceWSDDServiceName(String name) {
        HumansSearchServiceWSDDServiceName = name;
    }

    public HumansSearchService getHumansSearchService() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
         try {
             endpoint = new java.net.URL(HumansSearchService_address);
         }
         catch (java.net.MalformedURLException e) {
             throw new javax.xml.rpc.ServiceException(e);
         }
         HumansSearchService hSS = getHumansSearchService(endpoint);
         ((Stub)hSS).setUsername("temp_user");
         ((Stub)hSS).setPassword("temp_password");
         return hSS;
     }

    public HumansSearchService getHumansSearchService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            HumansSearchServiceSoapBindingStub _stub = new HumansSearchServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHumansSearchServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHumansSearchServiceEndpointAddress(String address) {
        HumansSearchService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (HumansSearchService.class.isAssignableFrom(serviceEndpointInterface)) {
                HumansSearchServiceSoapBindingStub _stub = new HumansSearchServiceSoapBindingStub(new java.net.URL(HumansSearchService_address), this);
                _stub.setPortName(getHumansSearchServiceWSDDServiceName());
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
        if ("HumansSearchService".equals(inputPortName)) {
            return getHumansSearchService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "HumansSearchServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "HumansSearchService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

if ("HumansSearchService".equals(portName)) {
            setHumansSearchServiceEndpointAddress(address);
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
