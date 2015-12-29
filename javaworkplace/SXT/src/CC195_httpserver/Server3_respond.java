package CC195_httpserver;
/*使用POST方式接收数据
 * 服务器为当前程序，客户端为浏览器
 *
 * 开启服务器后，直接打开网页：
 *  http://localhost:8888/
 * 响应客户端
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

public class Server3_respond {
	private ServerSocket server;
	public static final String CRLF="\r\n";
	public static final String BLANK=" ";
	public static void main(String[] args) {
		Server3_respond server=new Server3_respond();
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
			
			//响应客户端
			StringBuilder resContext=new StringBuilder();
			//正文内容
			resContext.append("<html><head><title>HTTP响应</title>"
					+ "<body>hello TomCat</body></head></html>");
			//响应格式：
			StringBuilder response=new StringBuilder();
			//第1行：.HTTP协议版本、状态代码、描述":"HTTP/1.1 200 OK"
			response.append("HTTP/1.1").append(BLANK).append("200").append(BLANK).append("OK").append(CRLF);
			//第2行.响应头
			response.append("Server:vero Server/0.0.1").append(CRLF);
			//第3行.时间
			response.append(new Date()).append(CRLF);
			//第4行.响应头
			response.append("Content-type:text/html;charset=GBK").append(CRLF);
			//第5行.正文长度:字节数
			response.append("Content-length:").append(resContext.toString().getBytes().length).append(CRLF);
			//增加应正文：
			response.append(CRLF);
			response.append(resContext);
			
			//输出响应报文
			BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			bw.write(response.toString());
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		
	}

}
