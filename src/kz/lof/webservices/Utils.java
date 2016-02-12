package kz.lof.webservices;

import kz.pchelka.env.Environment;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Utils {

	/*public static void main(String[] args) {
		String ip = "192.168.0.13:8080";
		if (ip.contains(":")) {
			ip = ip.substring(0, ip.lastIndexOf(":"));
		}
		System.out.println(ip);
	}*/

	public static boolean checkHost(String hostId){
		boolean result = false;
		String ip = "";
		try {
			ip = Environment.getExtHost(hostId);
			if (ip.contains(":")) {
				ip = ip.substring(0, ip.lastIndexOf(":"));
			}
			InetAddress address = InetAddress.getByName(ip);
			result = address.isReachable(7000);

		} catch (UnknownHostException e) {
			System.err.println("Unable to lookup " + ip);
		} catch (IOException e) {
			System.err.println("Unable to reach " + ip);
		}
		return result;
	}

	public static boolean testService(String hostId, String serviceName){
		try {
			String s = "http://" + Environment.getExtHost(hostId) + "/WS/services/" + serviceName + "?wsdl";

			HttpClient c = new DefaultHttpClient();
			HttpParams params = c.getParams();
			HttpConnectionParams.setConnectionTimeout(params, 12000);
			HttpConnectionParams.setSoTimeout(params, 12000);
			HttpGet g = new HttpGet(s);
			HttpResponse response = c.execute(g);

			System.out.println(s);

			if (response.getStatusLine().getStatusCode() == 200) {
				return true;
			}
		} catch (ConnectTimeoutException ct) {
			return false;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;

	}
}


