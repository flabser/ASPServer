//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.lof.webservices.frontface.ump;

import kz.pchelka.env.Environment;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

public class HumansSearchServiceServiceLocator extends Service implements HumansSearchServiceService {
    private String HumansSearchService_address = "http://" + Environment.getExtHost("ump") + "/WS/services/HumansSearchService";
    private String HumansSearchServiceWSDDServiceName = "HumansSearchService";
    private HashSet ports = null;

    public HumansSearchServiceServiceLocator() {
    }

    public HumansSearchServiceServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public HumansSearchServiceServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getHumansSearchServiceAddress() {
        return this.HumansSearchService_address;
    }

    public String getHumansSearchServiceWSDDServiceName() {
        return this.HumansSearchServiceWSDDServiceName;
    }

    public void setHumansSearchServiceWSDDServiceName(String name) {
        this.HumansSearchServiceWSDDServiceName = name;
    }

    public HumansSearchService getHumansSearchService() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.HumansSearchService_address);
        } catch (MalformedURLException var3) {
            throw new ServiceException(var3);
        }

        HumansSearchService hSS = this.getHumansSearchService(endpoint);
        ((Stub)hSS).setUsername("temp_user");
        ((Stub)hSS).setPassword("temp_password");
        return hSS;
    }

    public HumansSearchService getHumansSearchService(URL portAddress) throws ServiceException {
        try {
            HumansSearchServiceSoapBindingStub e = new HumansSearchServiceSoapBindingStub(portAddress, this);
            e.setPortName(this.getHumansSearchServiceWSDDServiceName());
            return e;
        } catch (AxisFault var3) {
            return null;
        }
    }

    public void setHumansSearchServiceEndpointAddress(String address) {
        this.HumansSearchService_address = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if(HumansSearchService.class.isAssignableFrom(serviceEndpointInterface)) {
                HumansSearchServiceSoapBindingStub t = new HumansSearchServiceSoapBindingStub(new URL(this.HumansSearchService_address), this);
                t.setPortName(this.getHumansSearchServiceWSDDServiceName());
                return t;
            }
        } catch (Throwable var3) {
            throw new ServiceException(var3);
        }

        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null?"null":serviceEndpointInterface.getName()));
    }

    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if(portName == null) {
            return this.getPort(serviceEndpointInterface);
        } else {
            String inputPortName = portName.getLocalPart();
            if("HumansSearchService".equals(inputPortName)) {
                return this.getHumansSearchService();
            } else {
                Remote _stub = this.getPort(serviceEndpointInterface);
                ((Stub)_stub).setPortName(portName);
                return _stub;
            }
        }
    }

    public QName getServiceName() {
        return new QName("http://ump.webservices.lof.kz", "HumansSearchServiceService");
    }

    public Iterator getPorts() {
        if(this.ports == null) {
            this.ports = new HashSet();
            this.ports.add(new QName("http://ump.webservices.lof.kz", "HumansSearchService"));
        }

        return this.ports.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if("HumansSearchService".equals(portName)) {
            this.setHumansSearchServiceEndpointAddress(address);
        } else {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}
