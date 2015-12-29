package CC185_Network_InetAddress;
/*
 * û�з�װ�˿�
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class T1_InetAddress {

	public static void main(String[] args) throws UnknownHostException {
		//ʹ��getLocalHost��������InetAddress����
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//IP��ַ
		System.out.println(addr.getHostName());//���������
		
	
		//���������õ�InetAddress����
		addr=InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());//����baidu������IP��ַ
		System.out.println(addr.getHostName());//�������
		
		//����IP�õ�InetAddress����
		addr=InetAddress.getByName("119.75.218.70");
		System.out.println(addr.getHostAddress());//����baidu������IP��ַ
		System.out.println(addr.getHostName());//���IP,���DNS�����Ļ����ͷ�������
	}

}
