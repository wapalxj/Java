package CC203_httpserver_Polymorphism;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/9.
 */
public class WebHandler extends DefaultHandler {
    private List<WebEntity> entityList;
    private List<WebMapping> mappingList;
    private WebEntity webEntity;
    private WebMapping webMapping;
    private String beginTag;

    private boolean isMapping;


    //根标签root
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("处理文档开始");
        entityList=new ArrayList<>();
        mappingList=new ArrayList<>();
    }
    //子标签
    //左标签left
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("开始一个元素"+qName);
        if (qName!=null){
            beginTag=qName;
            if (qName.equals("servlet")){
                isMapping=false;
                webEntity =new WebEntity();
            }else if (qName.equals("servlet-mapping")){
                isMapping=true;
                webMapping=new WebMapping();
            }
        }

    }
    //标签值
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = new String(ch, start, length);
        if (beginTag != null) {
            if (isMapping) {
                if (beginTag.equals("servlet-name")) {
                    webMapping.setName(str);
                } else if (beginTag.equals("url-pattern")) {
                    webMapping.getUrlPattern().add(str);
                }
            } else {
                if (beginTag.equals("servlet-name")) {
                    webEntity.setName(str);
                } else if (beginTag.equals("servlet-class")) {
                    webEntity.setClz(str);
                }
            }
        }
    }
    //闭标签
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("结束一个元素"+qName);
        if (qName!=null){
            if (qName.equals("servlet")){
                entityList.add(webEntity);
            }else if (qName.equals("servlet-mapping")){
                mappingList.add(webMapping);
            }
        }
        beginTag=null;
    }
    //闭根标签
    @Override
    public void endDocument() throws SAXException {
        System.out.println("处理文档结束");
    }

    public List<WebEntity> getEntityList() {
        return entityList;
    }

    public List<WebMapping> getMappingList() {
        return mappingList;
    }
    //测试解析
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//        SAXParserFactory factory=SAXParserFactory.newInstance();
//        SAXParser parser=factory.newSAXParser();
//        WebHandler handler=new WebHandler();
//        parser.parse(Thread.currentThread().getContextClassLoader()
//                .getResourceAsStream("CC203_httpserver_Polymorphism\\Web.xml")
//                ,handler);

//        List<WebEntity> entities =handler.getEntityList();
//        for (WebEntity servlet:entities){
//            System.out.println(servlet.getName()+"--->"+servlet.getClz());
//        }
//        List<WebMapping> mappings =handler.getMappingList();
//        for (WebMapping mapping:mappings){
//            System.out.println(mapping.getName()+"--->"+mapping.getUrlPattern());
//        }
    }

}
