package CC203_httpserver_Polymorphism;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/8.
 */
public class WebApp {
    private static ServletContext context;
    static {

        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser parser= null;
        try {
            parser = factory.newSAXParser();
            WebHandler handler=new WebHandler();
            parser.parse(Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("CC203_httpserver_Polymorphism\\Web.xml")
                    ,handler);
//将list转换成map
            context=new ServletContext();
            //servlet-name servlet-class
            //一个name一个class
            Map<String,String> servlet =context.getServlet();
            for (WebEntity entity: handler.getEntityList()){
                servlet.put(entity.getName(),entity.getClz());
            }
            Map<String,String>mapping =context.getMapping();
            //反过来：key:url-pattern  value:servlet-name
            //多个url对应一个name
            for (WebMapping mapp: handler.getMappingList()){
                List<String> urls=mapp.getUrlPattern();
                for (String url:urls){
                    mapping.put(url,mapp.getName());
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




//        Map<java.lang.String, java.lang.String>mapping =context.getMapping();
//        //login映射为2个,regsiter为1个
//        mapping.put("/login","login");
//        mapping.put("/log","login");
//        mapping.put("/reg","register");
//
//        Map<String, String> servlet=context.getServlet();
//        servlet.put("login","CC203_httpserver_Polymorphism.LoginServlet");
//        servlet.put("register","CC203_httpserver_Polymorphism.RegisterServlet");
    }

    public static Servlet getServlet(String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (url==null||(url=url.trim()).equals("")){
            return null;
        }
        String name= context.getServlet().get(context.getMapping().get(url));
        //根据字符串(完整路径)创建对象,,反射
        return (Servlet)Class.forName(name).newInstance();
    }
}
