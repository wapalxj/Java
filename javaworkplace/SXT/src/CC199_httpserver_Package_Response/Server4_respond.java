package CC199_httpserver_Package_Response;
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

public class Server4_respond {
	private ServerSocket server;
	public static final String CRLF="\r\n";
	public static final String BLANK=" ";
	public static void main(String[] args) {
		Server4_respond server=new Server4_respond();
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
		
			byte[] data= new byte[20480];
			int len=client.getInputStream().read(data);
			//接收客户端请求信息
//			String requestInfo=sb.toString().trim();//去掉空格
			String requestInfo=new String(data,0,len);
			System.out.println(requestInfo);
			
			//响应
			Response response=new Response(client.getOutputStream());
			//正文内容
			response.println("<html><head><title>HTTP响应</title>");
			response.println("</head><body>hello TomCat2222</body></html>");
//			response.pushToClient(404);
			response.pushToClient(200);
//			response.pushToClient(500);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		
	}

}
