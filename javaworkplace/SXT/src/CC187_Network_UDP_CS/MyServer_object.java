package CC187_Network_UDP_CS;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 传输其他数据类型
 * 字节数组---->double
 * 
 */
public class MyServer_object {

	public static void main(String[] args) throws IOException {
		//1.创建服务器+端口
		DatagramSocket server =new DatagramSocket(8888);
		//2.准备接收容器
		byte[] container =new byte[1024];
		//3.封装成包
		DatagramPacket packet =new DatagramPacket(container, container.length);
		//4.接收数据
		server.receive(packet);
		//5.分析数据
		double data =convert(packet.getData());
		System.err.println(data);
		//6.释放
		server.close();
	}
	/*
	 * 字节数组+data 输入流
	 */
	public static double convert(byte []data) throws IOException {
		DataInputStream dis=new DataInputStream(new ByteArrayInputStream(data));
		double num=dis.readDouble();
		return num;
		
	}
	

}
