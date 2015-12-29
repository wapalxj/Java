package CC191_Network_ChatRoom2;
/*
 * 写出数据：输出流
 * 读取数据：输入流
 * 这一步实现了一个客户端不断的与服务器交互数据
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		//不断连接多个客户端
		while (true) {
			ServerSocket server=new ServerSocket(9999);
			Socket client=server.accept();
			
			//输入流:从客户端接收
			DataInputStream dis=new DataInputStream(client.getInputStream());
			//输出流：输出到客户端
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			//不断重客户端读取和从输出到客户端
			while (true) {
				String msg=dis.readUTF();
				System.out.println("服务器接收到："+msg);
				
				dos.writeUTF("服务器：->>"+msg);
				dos.flush();
			}
			
		}
		
	}

}
