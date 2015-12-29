package CC200_httpserver_Package_Request;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

/*
 * ����һ����װResponse
 */
public class Response {
	
	public static final String CRLF="\r\n";
	public static final String BLANK=" ";
	private BufferedWriter bw;
	private StringBuilder headInfo;
	private StringBuilder content;
	private int len=0;
	public Response() {
		headInfo =new StringBuilder();
		content=new StringBuilder();
		len=0;
	}
	
	public Response(Socket client) {
		this();
		try {
			bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		} catch (IOException e) {
			headInfo=null;
		}
	}
	
	public Response(OutputStream os) {
		this();
		bw=new BufferedWriter(new OutputStreamWriter(os));
	}
	/*
	 * ��������
	 */
	public Response print(String info) {
		content.append(info);
		len+=info.getBytes().length;
		return this;
	}
	/*
	 * ��������+�س�
	 */
	public Response println(String info) {
		content.append(info).append(CRLF);
		len+=(info+CRLF).getBytes().length;
		return this;
	}
	/*
	 * ������Ӧͷ
	 */
	private void createHeadInfo(int code){
		//��1�У�.HTTPЭ��汾��״̬���롢����":"HTTP/1.1 200 OK"
		headInfo.append("HTTP/1.1").append(BLANK).append(code).append(BLANK);
		switch (code) {
		case 200:
			headInfo.append("OK");
			break;
		case 404:
			headInfo.append("NOT FOUND");
			content=new StringBuilder("NOT FOUND");
			break;	
		case 505:
			headInfo.append("SEVER ERROR");
			content=new StringBuilder("SEVER ERROR");
			break;	
//		default:
//			break;
		}
		
		
		headInfo.append(CRLF);
		//��2��.��Ӧͷ
		headInfo.append("Server:vero Server/0.0.1").append(CRLF);
		//��3��.ʱ��
		headInfo.append("Date:").append(new Date()).append(CRLF);
		//��4��.��Ӧͷ
		headInfo.append("Content-type:text/html;charset=GBK").append(CRLF);
		//��5��.���ĳ���:�ֽ���
		headInfo.append("Content-length:").append(len).append(CRLF);
		headInfo.append(CRLF);
	}
	
	void pushToClient(int code) throws IOException{
		if (headInfo==null) {
			code=500;
		}
		createHeadInfo(code);
		//ͷ��Ϣ+�ָ��
		bw.append(headInfo.toString());
		//����
		bw.append(content.toString());
		bw.flush();
	}
	
	public void close() {
		CloseUtil.closeAll(bw);
	}
}
