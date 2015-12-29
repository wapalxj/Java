package CC191_Network_ChatRoom2;
/*对上一步的封装
 * 客户端：发送数据+接收数据
 * 写出数据：输出流
 * 读取数据：输入流
 * 输入流与输出流不在同一个线程内：彼此独立
 * 因为在聊天室中，你发的消息服务器会转发到群里，但是你不发消息也能接收别人发的消息，
 * 所以输出流和输入流要独立
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client=new Socket("localhost",9999);
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
	}

}
