package CC200_httpserver_Package_Request;
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
			//����
			Request req=new Request(client.getInputStream());
			
			
			//��Ӧ
			Response response=new Response(client.getOutputStream());
			//��������
			response.println("<html><head><title>HTTP��Ӧ</title>");
			response.println("</head><body>");
			response.println("��ӭ").println(req.getParamet("username")).println("����");
//			String [] s=req.getParametValues("fav");
//			response.println("��ӭ").println(s[0]).println("����");
//			response.println("��ӭ").println(s[1]).println("����");
//			response.println("��ӭ").println(s[2]).println("����");
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
