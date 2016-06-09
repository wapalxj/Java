package CC200_httpserver_Package_Request;

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
        Servlet ser=new Servlet(req,res);
        ser.service();
        try {
            res.pushToClient(code);
        } catch (IOException e) {
            code=500;
            e.printStackTrace();
        }
        CloseUtil.closeSocket(client);
    }
}
