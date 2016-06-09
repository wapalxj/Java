package CC203_httpserver_Polymorphism;
/*使用POST方式接收数据
 * 服务器为当前程序，客户端为浏览器
 *
 * 开启服务器后，打开网页：
 * 当前包下的网页登录
 * 响应客户端
 * 
 * 注意：浏览器不同效果不同!!!!!
 * 
 */
import CC200_httpserver_Package_Request.CloseUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5 {
	private ServerSocket server;
	private boolean isShutDown=false;
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
			while (!isShutDown){
				Socket client =server.accept();
				new Thread(new Dispatcher(client)).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		isShutDown=true;
		CloseUtil.closeSocket(server);
	}

}
