package CC195_httpserver;
/*ʹ��POST��ʽ��������
 * ������Ϊ��ǰ���򣬿ͻ���Ϊ�����
 * http://localhost:8888/
 * �����������󣬴�index.html,��¼
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
			Socket client =server.accept();
		
			byte[] data= new byte[2048];
			int len=client.getInputStream().read(data);
			
			//���տͻ���������Ϣ
//			String requestInfo=sb.toString().trim();//ȥ���ո�
			String requestInfo=new String(data,0,len);
			System.out.println(requestInfo);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		
	}

}
