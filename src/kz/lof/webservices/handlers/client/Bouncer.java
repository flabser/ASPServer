package kz.lof.webservices.handlers.client;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.RPCElement;

import kz.flabs.users.User;
import kz.flabs.webrule.Role;
import kz.flabs.runtimeobj.document.structure.Employer;
import kz.flabs.runtimeobj.document.structure.UserRole;
import kz.pchelka.server.Server;

public class Bouncer extends BasicHandler {

	private static final long serialVersionUID = 1L;
	private MessageContext currentMessageContext;
	
	@Override
	public void invoke(MessageContext ctx) throws AxisFault {
		currentMessageContext = ctx;
		if (currentMessageContext.getProperty("kz.lof.webservices.green_light") != null &&
				((boolean)currentMessageContext.getProperty("kz.lof.webservices.green_light")) == true) {
			return;
		}
		User sysUser = (User)ctx.getProperty("kz.lof.webservices.current_user");
		if (sysUser == null) throw new AxisFault("Authentication data is missing");
		Employer appUser = sysUser.getAppUser();
		if (appUser == null) throw new AxisFault(sysUser.getUserID() + " is not allowed to use Infocity Services");
		String serviceName = ctx.getProperty("wsdl.portName").toString();
		String operationName = getOperationName();
		if (isPermitted(operationName, sysUser)) return;
		if (!appUser.hasRole(new UserRole(new Role(serviceName + " -> " + operationName, "")))) {
			throw new AxisFault("User " + appUser.getUserID() + " does not have access to method " + operationName + " of service " + serviceName + ". Go away.");
		} else {
			Server.logger.normalLogEntry("Access to method " + operationName + " of service " + serviceName + " for user " + appUser.getUserID() + " granted. Proceeding...");
		}
	}
	
	// здесь надо разрешить доступ к служебным методам админки и поисковой системы, таким как
	// выдача списка улиц для подсказки при вводе, просмотр логов, проверка состяния сервера-источника
	private boolean isPermitted(String operationName, User user) {
		if (("testService".equals(operationName) || "getLog".equals(operationName)) && user.enabledApps.containsKey("InfocityAdmin")) {
			return true;
		}
		if ("getStreets".equals(operationName) && user.enabledApps.containsKey("InfocityServices")) {
			return true;
		}
		if ("getFlabs".equals(operationName) && user.enabledApps.containsKey("InfocityServices")) {
			return true;
		}
		return false;
	}


	private String getOperationName() throws AxisFault {
		try {
			return ((RPCElement)currentMessageContext.getRequestMessage().getSOAPEnvelope().getFirstBody()).getMethodName();
		} catch (AxisFault af) {
			af.setFaultString("Невозможно получить название метода для создания записи в журнале, операция отменена");
			throw af;
		}
	}
	
}
