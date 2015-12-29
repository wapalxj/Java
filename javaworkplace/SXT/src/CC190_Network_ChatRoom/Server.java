package CC190_Network_ChatRoom;
/*
 * 写出数据：输出流
 * 读取数据：输入流
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(9999);
		Socket client=server.accept();
		
		//输入流:从客户端接收
		DataInputStream dis=new DataInputStream(client.getInputStream());
		String msg=dis.readUTF();
		System.out.println("服务器接收到："+msg);
		//输出流：输出到客户端
		DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		dos.writeUTF("服务器：->>"+msg);
		dos.flush();
}

}
