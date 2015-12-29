package c47_poly2;

public class HttpSvervlet {
	public void service() {
		System.out.println("HttpServlet.()");
		doGet();
	}
	public void doGet() {
		System.out.println("Servlet.doGet()");
	}
}
