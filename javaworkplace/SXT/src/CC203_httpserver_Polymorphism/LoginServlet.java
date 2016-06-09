package CC203_httpserver_Polymorphism;

/**
 * Created by Administrator on 2015/12/8.
 */
public class LoginServlet extends Servlet {
    @Override
    public void doGet(Request req, Response res) throws Exception {
//		res.println("<html><head><title>»¶Ó­»ØÀ´</title>");
//		res.println("</head><body>");
//		res.println("»¶Ó­").println(req.getParamet("username")).println("»ØÀ´");
//		res.println("</body></html>");
        String username=req.getParamet("username");
        String pwd=req.getParamet("pwd");
        if (login(username,pwd)){
            res.println("µÇÂ¼³É¹¦");
        }else {
            res.println("µÇÂ¼Ê§°Ü");
        }

    }

    public boolean login(String username, String password){
        return username.equals("vero")&&password.equals("123456");
    }
    @Override
    public void doPost(Request req, Response res) throws Exception {

    }
}
