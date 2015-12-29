package CC185_Network_InetAddress;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

import com.sun.jndi.cosnaming.IiopUrl.Address;

/*
 * ��InetAddress������+�˿�
 */
public class T2_InetSocketAddress {

	public static void main(String[] args) throws UnknownHostException {
		InetSocketAddress address=new InetSocketAddress("localhost",9999);
		//����
		address=new InetSocketAddress(InetAddress.getByName("127.0.0.1"),9999);
		System.out.println(address.getHostName());
		System.out.println(address.getPort());
		
		InetAddress addr=address.getAddress();
		System.out.println(addr.getHostAddress());//IP��ַ
		System.out.println(addr.getHostName());//���������
	}

}
