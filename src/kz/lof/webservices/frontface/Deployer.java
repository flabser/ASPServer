package kz.lof.webservices.frontface;

import java.io.File;

import org.apache.axis.client.AdminClient;

public class Deployer {

	public static void main(String[] args) throws Exception {
		// список сервисов, которые опубликует Deployer
		final String[] serviceList = {
				"BTIService",
				"ForeignersSearchService",
				"HumansSearchService",
				"QuestService",
				"TaxIndService",
				"TaxPayService",
				"UDPCamService",
				"UDPService",
//			"SimpleService"
//				"SOAPMonitorService"
		};
		// URL того приложения, в которое будут опубликованы сервисы
		final String axisURL = "http://localhost:8889/FrontWS";
//=====================================================================================
		for (String service : serviceList) {
			String descriptorPath = "webapps/FrontWS/WEB-INF/deployers/" + service + "/deploy.wsdd";
			if (!new File(descriptorPath).exists()) {
				System.out.println("Файл " + descriptorPath + " не найден");
				continue;
			}
			String[] params = {"-l" + axisURL + "/AxisServlet", "-usysadmin", "-w123456", descriptorPath};
			AdminClient ac = new AdminClient();
			ac.process(params);
		}
	}

}
