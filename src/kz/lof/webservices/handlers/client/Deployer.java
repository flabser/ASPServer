package kz.lof.webservices.handlers.client;

import java.io.File;

import org.apache.axis.utils.Admin;

public class Deployer {

	public static void main(String[] args) throws Exception {
		final String[] serviceList = {
				"clients",
		};
//=====================================================================================
		for (String service : serviceList) {
			String descriptorPath = "webapps/InfocityServices/WEB-INF/deployers/" + service + "/deploy.wsdd";
			if (!new File(descriptorPath).exists()) {
				System.out.println("Файл " + descriptorPath + " не найден");
				continue;
			}
			String[] params = {"client", descriptorPath};
			Admin.main(params);
		}
	}

}
