/**
 * QuestServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.ump;

import org.apache.axis.client.Stub;

import kz.pchelka.env.Environment;

public class QuestServiceServiceLocator extends org.apache.axis.client.Service implements kz.lof.webservices.clients.ump.QuestServiceService {

	public QuestServiceServiceLocator() {
	}


	public QuestServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public QuestServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for QuestService
	private java.lang.String QuestService_address = "http://" + Environment.getExtHost("ump") + "/WS/services/QuestService";

	public java.lang.String getQuestServiceAddress() {
		return QuestService_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String QuestServiceWSDDServiceName = "QuestService";

	public java.lang.String getQuestServiceWSDDServiceName() {
		return QuestServiceWSDDServiceName;
	}

	public void setQuestServiceWSDDServiceName(java.lang.String name) {
		QuestServiceWSDDServiceName = name;
	}

	public kz.lof.webservices.clients.ump.QuestService getQuestService() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(QuestService_address);
		}
		catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		kz.lof.webservices.clients.ump.QuestService qs = getQuestService(endpoint);
		((Stub)qs).setUsername("temp_user");
		((Stub)qs).setPassword("temp_password");
		return qs;
	}

	public kz.lof.webservices.clients.ump.QuestService getQuestService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			kz.lof.webservices.clients.ump.QuestServiceSoapBindingStub _stub = new kz.lof.webservices.clients.ump.QuestServiceSoapBindingStub(portAddress, this);
			_stub.setPortName(getQuestServiceWSDDServiceName());
			return _stub;
		}
		catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setQuestServiceEndpointAddress(java.lang.String address) {
		QuestService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (kz.lof.webservices.clients.ump.QuestService.class.isAssignableFrom(serviceEndpointInterface)) {
				kz.lof.webservices.clients.ump.QuestServiceSoapBindingStub _stub = new kz.lof.webservices.clients.ump.QuestServiceSoapBindingStub(new java.net.URL(QuestService_address), this);
				_stub.setPortName(getQuestServiceWSDDServiceName());
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
		if ("QuestService".equals(inputPortName)) {
			return getQuestService();
		}
		else  {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "QuestServiceService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "QuestService"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("QuestService".equals(portName)) {
			setQuestServiceEndpointAddress(address);
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