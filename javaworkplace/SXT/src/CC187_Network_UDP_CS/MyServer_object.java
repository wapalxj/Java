package CC187_Network_UDP_CS;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * ����������������
 * �ֽ�����---->double
 * 
 */
public class MyServer_object {

	public static void main(String[] args) throws IOException {
		//1.����������+�˿�
		DatagramSocket server =new DatagramSocket(8888);
		//2.׼����������
		byte[] container =new byte[1024];
		//3.��װ�ɰ�
		DatagramPacket packet =new DatagramPacket(container, container.length);
		//4.��������
		server.receive(packet);
		//5.��������
		double data =convert(packet.getData());
		System.err.println(data);
		//6.�ͷ�
		server.close();
	}
	/*
	 * �ֽ�����+data ������
	 */
	public static double convert(byte []data) throws IOException {
		DataInputStream dis=new DataInputStream(new ByteArrayInputStream(data));
		double num=dis.readDouble();
		return num;
		
	}
	

}
