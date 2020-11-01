package CC187_Network_UDP_CS;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 服务端:先运行服务端
 * 如果不先打开服务器，也不会报错，因为UDP不是面向连接的
 */
public class MyServer {

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
		byte [] data =packet.getData();
		int len=packet.getLength();
		System.err.println(new String(data,0,len));
		//6.释放
		server.close();
	}

}
