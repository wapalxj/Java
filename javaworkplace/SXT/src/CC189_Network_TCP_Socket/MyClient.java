package CC189_Network_TCP_Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/*TCP:客户端不启动，则出现异常
 * 创建客户端:必须指定服务器+端口
 */
public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1.创建客户端
		Socket client=new Socket("localhost",8888);
		//2.接收数据
		//输出流1:
//		BufferedReader br=new BufferedReader(
//				new InputStreamReader(client.getInputStream())
//		);
//		String echo =br.readLine();//这个实际上也是阻塞的方法，需要行结束符或者bw.newLine
//		System.out.println(echo);
		//或者2：
		DataInputStream dis=new DataInputStream(client.getInputStream());
		String echo =dis.readUTF();
		System.out.println(echo);
		
	}

}
