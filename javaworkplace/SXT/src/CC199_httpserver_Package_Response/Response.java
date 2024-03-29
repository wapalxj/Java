package CC199_httpserver_Package_Response;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

/*
 * 对上一步封装Response
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
	 * 构建正文
	 */
	public Response print(String info) {
		content.append(info);
		len+=info.getBytes().length;
		return this;
	}
	/*
	 * 构建正文+回车
	 */
	public Response println(String info) {
		content.append(info).append(CRLF);
		len+=(info+CRLF).getBytes().length;
		return this;
	}
	/*
	 * 构建响应头
	 */
	private void createHeadInfo(int code){
		//第1行：.HTTP协议版本、状态代码、描述":"HTTP/1.1 200 OK"
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
		//第2行.响应头
		headInfo.append("Server:vero Server/0.0.1").append(CRLF);
		//第3行.时间
		headInfo.append("Date:").append(new Date()).append(CRLF);
		//第4行.响应头
		headInfo.append("Content-type:text/html;charset=GBK").append(CRLF);
		//第5行.正文长度:字节数
		headInfo.append("Content-length:").append(len).append(CRLF);
		headInfo.append(CRLF);
	}
	
	void pushToClient(int code) throws IOException{
		if (headInfo==null) {
			code=500;
		}
		createHeadInfo(code);
		//头信息+分割符
		bw.append(headInfo.toString());
		//正文
		bw.append(content.toString());
		bw.flush();
	}
	
	public void close() {
		CloseUtil.closeAll(bw);
	}
}
