package CC203_httpserver_Polymorphism;

import CC200_httpserver_Package_Request.CloseUtil;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Administrator on 2015/12/7.
 * 多个响应：多线程
 */
public class Dispatcher implements Runnable {
    private Request req;
    private Response res;
    private Socket client;
    private int code=200;
    public Dispatcher(Socket client)  {
        this.client = client;
        try {
            this.req = new Request(this.client.getInputStream());
            this.res = new Response(this.client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            code=500;
            return;
        }


    }

    @Override
    public void run() {
        try {
            Servlet ser=WebApp.getServlet(req.getUrl());
            if (ser==null){
                this.code=404;
            }else {
                ser.service(req, res);
            }
            res.pushToClient(code);
        } catch (Exception e) {
            code = 500;
//            e.printStackTrace();
        }try {
                res.pushToClient(500);
        } catch (IOException e1) {
                e1.printStackTrace();
        }
//            e.printStackTrace();
        CloseUtil.closeSocket(client);
    }
}
