package kz.lof.webservices.clients.udp;

import kz.flabs.users.User;
import org.apache.axis.client.Stub;

public class UDPCamServiceProxy implements kz.lof.webservices.clients.udp.UDPCamService {
	private String _endpoint = null;
	private kz.lof.webservices.clients.udp.UDPCamService uDPCamService = null;
	private User user = null;

	public UDPCamServiceProxy(User user) {
		this.user  = user;
		_initUDPCamServiceProxy();
	}

	public UDPCamServiceProxy(String endpoint) {
		_endpoint = endpoint;
		_initUDPCamServiceProxy();
	}

	private void _initUDPCamServiceProxy() {
		try {
			uDPCamService = (new kz.lof.webservices.clients.udp.UDPCamServiceServiceLocator()).getUDPCamService();
			if (uDPCamService != null) {
				((Stub)uDPCamService)._setProperty("kz.lof.webservices.current_user", user);
				if (_endpoint != null)
					((javax.xml.rpc.Stub)uDPCamService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)uDPCamService)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (uDPCamService != null)
			((javax.xml.rpc.Stub)uDPCamService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public kz.lof.webservices.clients.udp.UDPCamService getUDPCamService() {
		if (uDPCamService == null)
			_initUDPCamServiceProxy();
		return uDPCamService;
	}

	public kz.lof.webservices.store.udp.HumanShortData getAddressByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, java.util.Date birthDate, java.lang.String lang) throws java.rmi.RemoteException{
		if (uDPCamService == null)
			_initUDPCamServiceProxy();
		return uDPCamService.getAddressByFIO(firstName, lastName, middleName, birthDate, lang);
	}

	public kz.lof.webservices.store.udp.TrustData[] getWarrByGRNZ(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException{
		if (uDPCamService == null)
			_initUDPCamServiceProxy();
		return uDPCamService.getWarrByGRNZ(grnz, lang);
	}

	public kz.lof.webservices.store.udp.VehicleFullData getFullDataByGRNZ(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException{
		if (uDPCamService == null)
			_initUDPCamServiceProxy();
		return uDPCamService.getFullDataByGRNZ(grnz, lang);
	}

	public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException{
		if (uDPCamService == null)
			_initUDPCamServiceProxy();
		return uDPCamService.testService();
	}


}