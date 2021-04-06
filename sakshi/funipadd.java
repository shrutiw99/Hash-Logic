package practice;

import java.net.InetAddress;

public class funipadd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ipp();
	}

	
	public static void ipp() throws Exception
	{
		InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("System IP Address : " +
                      (localhost.getHostAddress()));
	}
}
