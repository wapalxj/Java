package CC203_httpserver_Polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/9.
 * ¥Ê¥¢”≥…‰
 *  <servlet-mapping>
 <servlet-name>login</servlet-name>
 <url-pattern>/login</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
 <servlet-name>login</servlet-name>
 <url-pattern>/log</url-pattern>
 </servlet-mapping>
 */
public class WebMapping {
    private String name;
    private List<String> urlPattern;

    public WebMapping(){
        urlPattern=new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(List<String> urlPattern) {
        this.urlPattern = urlPattern;
    }
}
