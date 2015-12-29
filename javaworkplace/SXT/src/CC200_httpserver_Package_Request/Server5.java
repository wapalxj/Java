package CC200_httpserver_Package_Request;
/*使用POST方式接收数据
 * 服务器为当前程序，客户端为浏览器
 *
 * 开启服务器后，直接打开网页：
 *  http://localhost:8888/
 * 响应客户端
 * 
 * 注意：浏览器不同效果不同!!!!!
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import sun.awt.RepaintArea;

public class Server5 {
	private ServerSocket server;
	public static final String CRLF="\r\n";
	public static final String BLANK=" ";
	public static void main(String[] args) {
		Server5 server=new Server5();
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
			//请求
			Request req=new Request(client.getInputStream());
			
			
			//响应
			Response response=new Response(client.getOutputStream());
			//正文内容
			response.println("<html><head><title>HTTP响应</title>");
			response.println("</head><body>");
			response.println("欢迎").println(req.getParamet("username")).println("回来");
//			String [] s=req.getParametValues("fav");
//			response.println("欢迎").println(s[0]).println("回来");
//			response.println("欢迎").println(s[1]).println("回来");
//			response.println("欢迎").println(s[2]).println("回来");
			response.println("</body></html>");
//			response.pushToClient(404);
			response.pushToClient(200);
//			response.pushToClient(500);
			System.out.println(req.getUrl());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		
	}

}
