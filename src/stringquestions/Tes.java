package stringquestions;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Tes {

	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost().getHostAddress());
	}
}
