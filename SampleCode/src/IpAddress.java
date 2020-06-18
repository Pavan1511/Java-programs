//WAP to find the IP address of the system

import java.net.InetAddress;
public class IpAddress {

	public static void main(String[] args) throws Exception {
		InetAddress host = InetAddress.getLocalHost();
		System.out.println(host);
		System.out.println("The IP address is: "+host.getHostAddress());
	}
}
