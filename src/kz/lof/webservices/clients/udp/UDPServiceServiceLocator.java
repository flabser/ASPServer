/**
 * UDPServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.udp;

import org.apache.axis.client.Stub;

import kz.pchelka.env.Environment;

public class UDPServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.clients.udp.UDPServiceService {

	public UDPServiceServiceLocator() {
	}


	public UDPServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public UDPServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for UDPService
	private java.lang.String UDPService_address = "http://" + Environment.getExtHost("udp") + "/WS/services/UDPService";

	public java.lang.String getUDPServiceAddress() {
		return UDPService_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String UDPServiceWSDDServiceName = "UDPService";

	public java.lang.String getUDPServiceWSDDServiceName() {
		return UDPServiceWSDDServiceName;
	}

	public void setUDPServiceWSDDServiceName(java.lang.String name) {
		UDPServiceWSDDServiceName = name;
	}

	public kz.lof.webservices.clients.udp.UDPService getUDPService() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(UDPService_address);
		}
		catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		kz.lof.webservices.clients.udp.UDPService udpService = getUDPService(endpoint);
		((Stub)udpService).setUsername("temp_user");
		((Stub)udpService).setPassword("temp_password");
		return udpService;
	}

	public kz.lof.webservices.clients.udp.UDPService getUDPService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			kz.lof.webservices.clients.udp.UDPServiceSoapBindingStub _stub = new kz.lof.webservices.clients.udp.UDPServiceSoapBindingStub(portAddress, this);
			_stub.setPortName(getUDPServiceWSDDServiceName());
			return _stub;
		}
		catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setUDPServiceEndpointAddress(java.lang.String address) {
		UDPService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (kz.lof.webservices.clients.udp.UDPService.class.isAssignableFrom(serviceEndpointInterface)) {
				kz.lof.webservices.clients.udp.UDPServiceSoapBindingStub _stub = new kz.lof.webservices.clients.udp.UDPServiceSoapBindingStub(new java.net.URL(UDPService_address), this);
				_stub.setPortName(getUDPServiceWSDDServiceName());
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
		if ("UDPService".equals(inputPortName)) {
			return getUDPService();
		}
		else  {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "UDPServiceService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "UDPService"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("UDPService".equals(portName)) {
			setUDPServiceEndpointAddress(address);
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