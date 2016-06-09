package CC203_httpserver_Polymorphism;

/**
 * Created by Administrator on 2015/12/9.
 * ´æ´¢:
 * <servlet>
     <servlet-name>login</servlet-name>
     <servlet-class>CC203_httpserver_Polymorphism.LoginServlet</servlet-class>
 </servlet>
 */

public class WebEntity {
    private String name;
    private String clz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClz() {
        return clz;
    }

    public void setClz(String clz) {
        this.clz = clz;
    }
}
