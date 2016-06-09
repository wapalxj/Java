package CC200_httpserver_Package_Request;

import java.io.IOException;

/*
 * 封装分发器
 */
public class Servlet {
	public void service() {
		
	}
	public Servlet(Request req, Response res) {
		//正文内容
		res.println("<html><head><title>HTTP响应</title>");
		res.println("</head><body>");
		res.println("欢迎").println(req.getParamet("username")).println("回来");
		String [] s=req.getParametValues("fav");
		res.println("欢迎").println(s[0]).println("回来");
		res.println("欢迎").println(s[1]).println("回来");
		res.println("欢迎").println(s[2]).println("回来");
		res.println("</body></html>");
	}
}


