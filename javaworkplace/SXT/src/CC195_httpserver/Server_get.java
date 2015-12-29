package CC195_httpserver;
/*
 * ʹ��GET��ʽ�������ݣ�����POST���ղ���
 * ������Ϊ��ǰ���򣬿ͻ���Ϊ�����
 * http://localhost:8888/
 * �����������󣬴�index.html,��¼
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
			StringBuilder sb=new StringBuilder();
			String msg=null;//���տͻ���������Ϣ
			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			while((msg=br.readLine()).length()>0) {
				sb.append(msg);
				sb.append("\r\n");
				if(msg==null){
					break;
				}		
			}
			//���տͻ���������Ϣ
//			String requestInfo=sb.toString().trim();//ȥ���ո�
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		
	}

}
