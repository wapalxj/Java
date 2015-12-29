package CC187_Network_UDP_CS;
/*
 * �ͻ��ˣ�
 * ����������������:double-->�ֽ�����
*/
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class MyClient_object {

	public static void main(String[] args) throws IOException {
		//1.����������+�˿ڣ�����ʱ�˿����������ͬ����Ϊ�����������ӵģ�
		DatagramSocket client =new DatagramSocket(6666);
		//2.׼������
		double num=89.12;
		//3.���
		byte [] data=convert(num);
					//��������ָ����������ַ�Ͷ˿ڣ���Ϊ������ȥ�ҷ�����
		DatagramPacket packet=new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888));
		//4.����
		client.send(packet);
		//5.�ͷ�
		client.close();
	}
	
	//�ֽ����飺����Դ+Data�����:��doubleд���ֽ�������
	public static byte[] convert(double num) throws IOException {
		byte [] data=null;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bos);
		
		dos.writeDouble(num);
		dos.flush();
		//��ȡ����
		data=bos.toByteArray();
		dos.close();
		return data;
		
	}

}
