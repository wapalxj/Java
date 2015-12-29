package CC195_httpserver;
/*使用POST方式接收数据
 * 服务器为当前程序，客户端为浏览器
 * http://localhost:8888/
 * 开启服务器后，打开index.html,登录
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2_post_receiveData {
	private ServerSocket server;
	public static void main(String[] args) {
		Server2_post_receiveData server=new Server2_post_receiveData();
		server.start();

	}
	/*
	 *  启动
	 */
	public void start() {
		try {
			server = new ServerSocket(8888);	
			this.receive();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/*
	 *接收客户端 
	 */
	private void receive() {
		try {
			Socket client =server.accept();
		
			byte[] data= new byte[2048];
			int len=client.getInputStream().read(data);
			
			//接收客户端请求信息
//			String requestInfo=sb.toString().trim();//去掉空格
			String requestInfo=new String(data,0,len);
			System.out.println(requestInfo);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		
	}

}
