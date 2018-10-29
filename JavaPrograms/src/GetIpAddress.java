import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {
	public static void main(String args[]) throws UnknownHostException {
		System.out.println("IP Address: "+ InetAddress.getLocalHost());
	}
}
