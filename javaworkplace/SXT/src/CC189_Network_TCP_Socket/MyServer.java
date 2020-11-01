package CC189_Network_TCP_Socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*还是需要先启动服务器
 * 1.创建服务端,指定端口
 * 2.接收客户端连接
 * 3.发送和接收数据
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		//1.创建服务端,指定端口
		ServerSocket server=new ServerSocket(8888);
		//2.接收客户端连接:阻塞式：等待客户端连接
		Socket socket=server.accept();
		System.out.println("sssssssssss");
		//3.发送数据
		String msg="vero";
		
		//输出流1
//		BufferedWriter bw= new BufferedWriter(
//				new OutputStreamWriter(
//					socket.getOutputStream())
//		);
//		bw.write(msg);
//		bw.newLine();
//		bw.flush();
		//或者2：
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
	}

}
