package CC195_httpserver;
/*
 * 使用GET方式接收数据，但是POST接收不到
 * 服务器为当前程序，客户端为浏览器
 * http://localhost:8888/
 * 开启服务器后，打开index.html,登录
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_get {
	private ServerSocket server;
	public static void main(String[] args) {
		Server_get server=new Server_get();
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
			StringBuilder sb=new StringBuilder();
			String msg=null;//接收客户端请求信息
			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			while((msg=br.readLine()).length()>0) {
				sb.append(msg);
				sb.append("\r\n");
				if(msg==null){
					break;
				}		
			}
			//接收客户端请求信息
//			String requestInfo=sb.toString().trim();//去掉空格
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		
	}

}
