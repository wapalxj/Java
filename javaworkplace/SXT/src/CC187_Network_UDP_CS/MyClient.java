package CC187_Network_UDP_CS;
/*
 *
 * 客户端：再运行客户端
 * 如果不先打开服务器，也不会报错，因为UDP不是面向连接的
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
		//1.创建客户端+端口（连接时端口与服务器不同：因为不是面向连接的）
		DatagramSocket client =new DatagramSocket(6666);
		//2.准备数据
		String msg="udp grammer";
		//3.打包
		byte [] data=msg.getBytes();
					//在数据中指定服务器地址和端口，因为是数据去找服务器
		DatagramPacket packet=new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888));
		//4.发送
		client.send(packet);
		//5.释放
		client.close();
	}

	

}
