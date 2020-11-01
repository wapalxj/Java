package CC189_Network_TCP_Socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*一个服务器，多个客户端
 */
public class Multi_Server {

	public static void main(String[] args) throws IOException {
		//1.创建服务端,指定端口
		ServerSocket server=new ServerSocket(8888);
		//2.接收客户端连接:阻塞式：等待客户端连接
		while (true) {//死循环，一个accept,一个客户端
			Socket socket=server.accept();
			System.out.println("sssssssssss");
			//3.发送数据
			String msg="vero";
			//输出流：
			DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
			
		}
	}

}
