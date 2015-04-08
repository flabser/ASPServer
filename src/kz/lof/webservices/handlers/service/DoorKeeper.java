package kz.lof.webservices.handlers.service;

import kz.flabs.appenv.AppEnv;
import kz.flabs.users.User;
import kz.pchelka.env.Environment;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class DoorKeeper extends BasicHandler {

	private static final long serialVersionUID = 1L;

	@Override
	public void invoke(MessageContext ctx) throws AxisFault {
		System.out.println("DoorKeeper");
		String userName = ctx.getUsername();
		User user = null;
		if (userName == null || userName.length() == 0) {
			throw new AxisFault("Username must be provided");
		}
		AppEnv application = Environment.getApplication("InfocityServices");
		user = new User(userName, application);
		if (!user.isValid) {
			throw new AxisFault("User " + userName + " not found in InfocityServices");
		}
		ctx.setProperty("kz.lof.webservices.current_user", user);
	}

}
