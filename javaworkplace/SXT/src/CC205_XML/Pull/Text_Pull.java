package CC205_XML.Pull;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Administrator on 2016/5/19.
 * pull解析
 */
public class Text_Pull {
    public static void main(String[] args)   throws XmlPullParserException, IOException
    {
        //工厂类
        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        //是否支持域名空间的解析
        factory.setNamespaceAware(true);
        //获取解析器对象
        XmlPullParser xpp = factory.newPullParser();

        xpp.setInput ( new StringReader( "<foo>Hello World!</foo>" ) );
        int eventType = xpp.getEventType();
        while (eventType != xpp.END_DOCUMENT) {
            if(eventType == xpp.START_DOCUMENT) {
                System.out.println("Start document");
            } else if(eventType == xpp.END_DOCUMENT) {
                System.out.println("End document");
            } else if(eventType == xpp.START_TAG) {
                System.out.println("Start tag: "+xpp.getName());
            } else if(eventType == xpp.END_TAG) {
                System.out.println("End tag: "+xpp.getName());
            } else if(eventType == xpp.TEXT) {
                System.out.println("Text: "+xpp.getText());
            }
            //移动指针
            eventType = xpp.next();
        }
    }
}
