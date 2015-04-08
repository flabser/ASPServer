/**
 * TaxIndServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.tax;

import org.apache.axis.client.Stub;

import kz.pchelka.env.Environment;

public class TaxIndServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.clients.tax.TaxIndServiceService {

	public TaxIndServiceServiceLocator() {
	}


	public TaxIndServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public TaxIndServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for TaxIndService
	private java.lang.String TaxIndService_address = "http://" + Environment.getExtHost("nk") + "/WS/services/TaxIndService";

	public java.lang.String getTaxIndServiceAddress() {
		return TaxIndService_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String TaxIndServiceWSDDServiceName = "TaxIndService";

	public java.lang.String getTaxIndServiceWSDDServiceName() {
		return TaxIndServiceWSDDServiceName;
	}

	public void setTaxIndServiceWSDDServiceName(java.lang.String name) {
		TaxIndServiceWSDDServiceName = name;
	}

	public kz.lof.webservices.clients.tax.TaxIndService getTaxIndService() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(TaxIndService_address);
		}
		catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		kz.lof.webservices.clients.tax.TaxIndService taxIndService = getTaxIndService(endpoint);
		((Stub)taxIndService).setUsername("temp_user");
		((Stub)taxIndService).setPassword("temp_password");
		return taxIndService;
	}

	public kz.lof.webservices.clients.tax.TaxIndService getTaxIndService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			kz.lof.webservices.clients.tax.TaxIndServiceSoapBindingStub _stub = new kz.lof.webservices.clients.tax.TaxIndServiceSoapBindingStub(portAddress, this);
			_stub.setPortName(getTaxIndServiceWSDDServiceName());
			return _stub;
		}
		catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setTaxIndServiceEndpointAddress(java.lang.String address) {
		TaxIndService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (kz.lof.webservices.clients.tax.TaxIndService.class.isAssignableFrom(serviceEndpointInterface)) {
				kz.lof.webservices.clients.tax.TaxIndServiceSoapBindingStub _stub = new kz.lof.webservices.clients.tax.TaxIndServiceSoapBindingStub(new java.net.URL(TaxIndService_address), this);
				_stub.setPortName(getTaxIndServiceWSDDServiceName());
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
		if ("TaxIndService".equals(inputPortName)) {
			return getTaxIndService();
		}
		else  {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://tax.webservices.lof.kz", "TaxIndServiceService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://tax.webservices.lof.kz", "TaxIndService"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("TaxIndService".equals(portName)) {
			setTaxIndServiceEndpointAddress(address);
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
