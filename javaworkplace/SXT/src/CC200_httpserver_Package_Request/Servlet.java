package CC200_httpserver_Package_Request;

import java.io.IOException;

/*
 * ��װ�ַ���
 */
public class Servlet {
	public void service() {
		
	}
	public Servlet(Request req, Response res) {
		//��������
		res.println("<html><head><title>HTTP��Ӧ</title>");
		res.println("</head><body>");
		res.println("��ӭ").println(req.getParamet("username")).println("����");
		String [] s=req.getParametValues("fav");
		res.println("��ӭ").println(s[0]).println("����");
		res.println("��ӭ").println(s[1]).println("����");
		res.println("��ӭ").println(s[2]).println("����");
		res.println("</body></html>");
	}
}


