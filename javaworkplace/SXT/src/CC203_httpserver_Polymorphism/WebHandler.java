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


    //����ǩroot
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("�����ĵ���ʼ");
        entityList=new ArrayList<>();
        mappingList=new ArrayList<>();
    }
    //�ӱ�ǩ
    //���ǩleft
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("��ʼһ��Ԫ��"+qName);
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
    //��ǩֵ
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
    //�ձ�ǩ
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("����һ��Ԫ��"+qName);
        if (qName!=null){
            if (qName.equals("servlet")){
                entityList.add(webEntity);
            }else if (qName.equals("servlet-mapping")){
                mappingList.add(webMapping);
            }
        }
        beginTag=null;
    }
    //�ո���ǩ
    @Override
    public void endDocument() throws SAXException {
        System.out.println("�����ĵ�����");
    }

    public List<WebEntity> getEntityList() {
        return entityList;
    }

    public List<WebMapping> getMappingList() {
        return mappingList;
    }
    //���Խ���
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//        SAXParserFactory factory=SAXParserFactory.newInstance();
//        SAXParser parser=factory.newSAXParser();
//        WebHandler handler=new WebHandler();
//        parser.parse(Thread.currentThread().getContextClassLoader()
//                .getResourceAsStream("CC203_httpserver_Polymorphism\\Web.xml")
//                ,handler);

//        testList<WebEntity> entities =handler.getEntityList();
//        for (WebEntity servlet:entities){
//            System.out.println(servlet.getName()+"--->"+servlet.getClz());
//        }
//        testList<WebMapping> mappings =handler.getMappingList();
//        for (WebMapping mapping:mappings){
//            System.out.println(mapping.getName()+"--->"+mapping.getUrlPattern());
//        }
    }

}
