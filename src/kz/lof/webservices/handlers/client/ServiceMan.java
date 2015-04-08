package kz.lof.webservices.handlers.client;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class ServiceMan extends BasicHandler {

	private static final long serialVersionUID = 1L;

	@Override
	public void invoke(MessageContext ctx) throws AxisFault {
		if ("urn:AdminService".equals(ctx.getTargetService())) {
			ctx.setProperty("kz.lof.webservices.green_light", true);
		}
	}

}
