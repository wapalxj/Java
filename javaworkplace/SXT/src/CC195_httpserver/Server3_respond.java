package CC195_httpserver;
/*ʹ��POST��ʽ��������
 * ������Ϊ��ǰ���򣬿ͻ���Ϊ�����
 *
 * ������������ֱ�Ӵ���ҳ��
 *  http://localhost:8888/
 * ��Ӧ�ͻ���
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
			
			//��Ӧ�ͻ���
			StringBuilder resContext=new StringBuilder();
			//��������
			resContext.append("<html><head><title>HTTP��Ӧ</title>"
					+ "<body>hello TomCat</body></head></html>");
			//��Ӧ��ʽ��
			StringBuilder response=new StringBuilder();
			//��1�У�.HTTPЭ��汾��״̬���롢����":"HTTP/1.1 200 OK"
			response.append("HTTP/1.1").append(BLANK).append("200").append(BLANK).append("OK").append(CRLF);
			//��2��.��Ӧͷ
			response.append("Server:vero Server/0.0.1").append(CRLF);
			//��3��.ʱ��
			response.append(new Date()).append(CRLF);
			//��4��.��Ӧͷ
			response.append("Content-type:text/html;charset=GBK").append(CRLF);
			//��5��.���ĳ���:�ֽ���
			response.append("Content-length:").append(resContext.toString().getBytes().length).append(CRLF);
			//����Ӧ���ģ�
			response.append(CRLF);
			response.append(resContext);
			
			//�����Ӧ����
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
