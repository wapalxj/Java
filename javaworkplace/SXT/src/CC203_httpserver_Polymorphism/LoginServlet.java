package CC203_httpserver_Polymorphism;

/**
 * Created by Administrator on 2015/12/8.
 */
public class LoginServlet extends Servlet {
    @Override
    public void doGet(Request req, Response res) throws Exception {
//		res.println("<html><head><title>��ӭ����</title>");
//		res.println("</head><body>");
//		res.println("��ӭ").println(req.getParamet("username")).println("����");
//		res.println("</body></html>");
        String username=req.getParamet("username");
        String pwd=req.getParamet("pwd");
        if (login(username,pwd)){
            res.println("��¼�ɹ�");
        }else {
            res.println("��¼ʧ��");
        }

    }

    public boolean login(String username, String password){
        return username.equals("vero")&&password.equals("123456");
    }
    @Override
    public void doPost(Request req, Response res) throws Exception {

    }
}
