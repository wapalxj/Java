package CC203_httpserver_Polymorphism;

/**
 * Created by Administrator on 2015/12/8.
 */
public class RegisterString extends Servlet {

    @Override
    public void doGet(Request req, Response res) throws Exception {

    }

    @Override
    public void doPost(Request req, Response res) throws Exception {
        res.println("<html><head><title>����ע��</title>");
        res.println("</head><body>");
        res.println("����û�����"+req.getParamet("username"));
        res.println("</body></html>");
    }
}
