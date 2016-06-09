package CC205_XML;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by Administrator on 2016/5/10.
 */
public class Test {
    public static void main(String[] args) {
        //1.获取解析工厂
        SAXParserFactory factory=SAXParserFactory.newInstance();
        //2.从解析工厂，获取解析器
        SAXParser parser= null;
        try {
            parser = factory.newSAXParser();
            //3.加载文档document处理器,并且编写处理器
            TestHandler handler=new TestHandler();
            parser.parse(Thread.currentThread().getContextClassLoader()
                            .getResourceAsStream("CC205_XML\\Petri net 1.xml")
                    ,handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
