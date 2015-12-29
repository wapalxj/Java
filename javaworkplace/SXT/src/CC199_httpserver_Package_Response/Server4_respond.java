package CC199_httpserver_Package_Response;
/*ʹ��POST��ʽ��������
 * ������Ϊ��ǰ���򣬿ͻ���Ϊ�����
 *
 * ������������ֱ�Ӵ���ҳ��
 *  http://localhost:8888/
 * ��Ӧ�ͻ���
 * 
 * ע�⣺�������ͬЧ����ͬ!!!!!
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
		
			byte[] data= new byte[20480];
			int len=client.getInputStream().read(data);
			//���տͻ���������Ϣ
//			String requestInfo=sb.toString().trim();//ȥ���ո�
			String requestInfo=new String(data,0,len);
			System.out.println(requestInfo);
			
			//��Ӧ
			Response response=new Response(client.getOutputStream());
			//��������
			response.println("<html><head><title>HTTP��Ӧ</title>");
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
