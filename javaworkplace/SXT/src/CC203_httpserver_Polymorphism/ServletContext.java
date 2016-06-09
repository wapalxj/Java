package CC203_httpserver_Polymorphism;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/8.
 * 为每一个servlet取别名
 */
public class ServletContext {
    //login--->LoginServlet
    private Map<String, String> servlet;
    //url-->login
    //login-->login
    private Map<String, String> mapping;

    public ServletContext() {
        this.servlet = new HashMap<>();
        this.mapping = new HashMap<>();
    }

    public Map<String, String> getServlet() {
        return servlet;
    }

    public void setServlet(Map<String, String> servlet) {
        this.servlet = servlet;
    }

    public Map<String, String> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, String> mapping) {
        this.mapping = mapping;
    }
}
