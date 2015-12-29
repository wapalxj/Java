package CC187_Network_UDP_CS;
/*
 * 客户端：
 * 传输其他数据类型:double-->字节数组
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
		//1.创建服务器+端口（连接时端口与服务器不同：因为不是面向连接的）
		DatagramSocket client =new DatagramSocket(6666);
		//2.准备数据
		double num=89.12;
		//3.打包
		byte [] data=convert(num);
					//在数据中指定服务器地址和端口，因为是数据去找服务器
		DatagramPacket packet=new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888));
		//4.发送
		client.send(packet);
		//5.释放
		client.close();
	}
	
	//字节数组：数据源+Data输出流:将double写到字节数组中
	public static byte[] convert(double num) throws IOException {
		byte [] data=null;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bos);
		
		dos.writeDouble(num);
		dos.flush();
		//获取数据
		data=bos.toByteArray();
		dos.close();
		return data;
		
	}

}
