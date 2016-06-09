package CC203_httpserver_Polymorphism;
/*ʹ��POST��ʽ��������
 * ������Ϊ��ǰ���򣬿ͻ���Ϊ�����
 *
 * �����������󣬴���ҳ��
 * ��ǰ���µ���ҳ��¼
 * ��Ӧ�ͻ���
 * 
 * ע�⣺�������ͬЧ����ͬ!!!!!
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
	 *  ����
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
	 *���տͻ��� 
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
