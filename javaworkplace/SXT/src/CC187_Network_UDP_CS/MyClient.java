package CC187_Network_UDP_CS;
/*
 *
 * �ͻ��ˣ������пͻ���
 * ������ȴ򿪷�������Ҳ���ᱨ����ΪUDP�����������ӵ�
 *
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;


public class MyClient {
	
	public static void main(String[] args) throws IOException {
		//1.�����ͻ���+�˿ڣ�����ʱ�˿����������ͬ����Ϊ�����������ӵģ�
		DatagramSocket client =new DatagramSocket(6666);
		//2.׼������
		String msg="udp grammer";
		//3.���
		byte [] data=msg.getBytes();
					//��������ָ����������ַ�Ͷ˿ڣ���Ϊ������ȥ�ҷ�����
		DatagramPacket packet=new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888));
		//4.����
		client.send(packet);
		//5.�ͷ�
		client.close();
	}

	

}
