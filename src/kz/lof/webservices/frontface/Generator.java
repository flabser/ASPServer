package kz.lof.webservices.frontface;

import java.util.List;

import org.apache.axis.client.AdminClient;
import org.apache.axis.wsdl.toJava.Emitter;

public class Generator {

	public static void main(String[] args) throws Exception {
		final String[] serviceList = {
//				"ForeignersSearchService",
//				"BTIService",
//				"HumansSearchService",
//				"QuestService",
//				"TaxIndService",
//				"TaxPayService",
//				"UDPCamService",
//				"UDPService",
				"UAIGService"
		};
		final String axisURL = "http://localhost:15045/WS/";
		for (String service : serviceList) {
			Emitter emitter = new Emitter();
			emitter.setServerSide(true);
			emitter.setNStoPkg("src/kz/lof/webservices/frontface/frontns.properties");
			emitter.setOutputDir("src");
			emitter.setUsername("temp_user");
			emitter.setPassword("temp_password");
			emitter.run(axisURL + "services/" + service + "?wsdl");
		}
	}
	
	

}
