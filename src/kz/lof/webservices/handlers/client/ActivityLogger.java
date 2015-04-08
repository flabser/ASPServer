package kz.lof.webservices.handlers.client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.Map.Entry;

import kz.flabs.appenv.AppEnv;
import kz.flabs.dataengine.ActivityStatusType;
import kz.flabs.dataengine.IActivity;
import kz.flabs.runtimeobj.document.structure.Employer;
import kz.flabs.users.User;
import kz.pchelka.env.Environment;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.SOAPPart;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.*;
import org.xml.sax.SAXException;

public class ActivityLogger extends BasicHandler {

	private static final long serialVersionUID = 1L;
	private MessageContext currentMessageContext;

	@Override
	public void invoke(MessageContext ctx) throws AxisFault {
		currentMessageContext = ctx;
		if (currentMessageContext.getProperty("kz.lof.webservices.green_light") != null &&
				((boolean)currentMessageContext.getProperty("kz.lof.webservices.green_light")) == true) {
			return;
		}
		String currentUserID = "anonymous";
		Employer appUser = null;
		User sysUser = (User)ctx.getProperty("kz.lof.webservices.current_user");
		if (sysUser != null) {
			appUser = sysUser.getAppUser();
		}
		if (appUser != null) {
			currentUserID = appUser.getUserID();
		}
		AppEnv application = Environment.getApplication("InfocityServices");
		IActivity activity = application.getDataBase().getActivity();
		String transactionID = "";
		if (!ctx.getPastPivot()) {
			try {
				transactionID = currentUserID + "@" + Long.toString(new GregorianCalendar().getTimeInMillis());
				ctx.setProperty("ActivityTransactionID", transactionID);
				String hostName = "";
				try {
					hostName = new URL(ctx.getProperty("transport.url").toString()).getHost();
				} catch (MalformedURLException m) {
					hostName = "-default-";
				}
				String serviceName = ctx.getProperty("wsdl.portName").toString();
				String operationName = getOperationName();
				HashMap<String, String> arguments = getOperationArgs();
				String argsAsString = "";
				for (Entry<String, String> arg : arguments.entrySet()) {
					argsAsString += arg.getKey() + "=" + arg.getValue() + ", ";
				}
				if (argsAsString.length() > 0) {
					argsAsString = argsAsString.substring(0, argsAsString.length() - 2);
				}
				out("Writing start to logtable:");
				out("CurrentUserID: " + currentUserID);
				out("ServiceName: " + serviceName);
				out("OperationName : " + operationName);
				out("ArgsAsString: " + argsAsString);
				out("HostName: " + hostName);
				out("TransactionID: " + transactionID);
				if (activity.postStartOfActivity("Request", currentUserID, serviceName, operationName, argsAsString, hostName, transactionID, new Date()) <= 0) {
					throw new Exception();
				}
			} catch (Exception e) {
				throw new AxisFault("Невозможно создать запись о запросе в журнале, запрос отклонен", e);
			}
		} else {
			try {
				int totalsCount = 0;
				int totalsSize = 0;
				transactionID = (String) ctx.getProperty("ActivityTransactionID");
				SOAPBodyElement body = (SOAPBodyElement)ctx.getResponseMessage().getSOAPEnvelope().getFirstBody();
				if (body instanceof RPCElement) {
					RPCElement elem = (RPCElement)body;
					for (RPCParam param : (Vector<RPCParam>)elem.getParams()) {
						Object obj = param.getObjectValue();
						if (obj == null) {
							out("Writing NULL error to logtable:");
							out("ReturnTime: " + new Date().toString());
							out("TransactionID: " + transactionID);
							activity.postEndOfFailureActivity(ActivityStatusType.ERROR, new Date(), "Service method returned NULL object", transactionID);
							return;
						}
						try {
							Method m = obj.getClass().getMethod("getTotalFound", new Class[]{});
							totalsCount = (int)m.invoke(obj, new Object[]{});
						} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException nme) {
							totalsCount = 1;
						}
					}
				} else if (body instanceof SOAPFault) {
					SOAPFault faultObj = ((SOAPFault)body);
					throw faultObj.getFault();
				}
				out("Writing success to logtable:");
				out("ReturnTime: " + new Date().toString());
				out("TotalsCount: " + totalsCount);
				out("TotalsSize: " + totalsSize);
				out("TransactionID: " + transactionID);
				if (activity.postEndOfActivity(ActivityStatusType.SUCCESS, new Date(), "", totalsCount, totalsSize, transactionID) <= 0) {
					throw new Exception("Невозможно обновить запись в журнале, ответ с данными не будет предоставлен");
				}
			} catch (Exception e) {
				throw AxisFault.makeFault(e);
			}
		}
	}

	@Override
	public void onFault(MessageContext ctx) {
		String transactionID = (String) ctx.getProperty("ActivityTransactionID");
		AppEnv application = Environment.getApplication("InfocityServices");
		IActivity activity = application.getDataBase().getActivity();
		SOAPPart sp = (SOAPPart)ctx.getResponseMessage().getSOAPPart();
		AxisFault exception = (AxisFault)sp.getCurrentMessage();
		out("Writing fault error to logtable:");
		out("ReturnTime: " + new Date().toString());
		out("FaultString: " + exception.getFaultString());
		exception.printStackTrace();
		out("TransactionID: " + transactionID);
		activity.postEndOfFailureActivity(ActivityStatusType.ERROR, new Date(), exception.getFaultString(), transactionID);
	}

	private void out(Object o) {
		System.out.println(o);
	}

	private String getOperationName() throws AxisFault {
		try {
			return ((RPCElement)currentMessageContext.getRequestMessage().getSOAPEnvelope().getFirstBody()).getMethodName();
		} catch (AxisFault af) {
			af.setFaultString("Невозможно получить название метода для создания записи в журнале, операция отменена");
			throw af;
		}
	}

	private HashMap<String, String> getOperationArgs() throws AxisFault, SAXException {
		HashMap<String, String> args = new HashMap<String, String>();
		try {
			RPCElement method = ((RPCElement)currentMessageContext.getCurrentMessage().getSOAPEnvelope().getFirstBody());
			Vector<RPCParam> arguments = method.getParams();
			for (RPCParam argument : arguments) {
				args.put(argument.getName(), argument.getValue());
			}
		} catch (AxisFault af) {
			af.setFaultString("Невозможно получить параметры метода для создания записи в журнале, операция отменена");
			throw af;
		} catch (SAXException se) {
			throw new SAXException("Ошибка чтения параметров метода из SOAP-сообщения для создания записи в журнале, операция отменена");
		}
		return args;
	}

}
