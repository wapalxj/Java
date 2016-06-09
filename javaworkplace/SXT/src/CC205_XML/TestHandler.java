package CC205_XML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/8.
 */
public class TestHandler extends DefaultHandler{
    //记录标签名
    private String tag=null;
    public TestHandler() {

    }

    //根标签root
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("处理文档开始");
    }
    //子标签
    //左标签left
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("开始一个元素"+qName);
        if (qName!=null){
            tag=qName;
        }
        if (attributes.getLength()>=1){
            for (int i=0;i<attributes.getLength();i++){
                System.out.println("属性："+attributes.getQName(i)+"=="+attributes.getValue(attributes.getQName(i)));
            }
        }
//        if ((qName!=null)&&qName.equals("person")){
//            person=new Person();
//        }
    }
    //标签值
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str=new String(ch,start,length);
//        if (tag!=null&&tag.equals("name")){
//            person.setName(str);
        if (!str.trim().equals("")){
            System.out.println("元素值是："+str);
        }
//        }else if (tag!=null&&tag.equals("age")){
//            Integer age=Integer.valueOf(str);
//            person.setAge(age);
//        }
    }
    //闭标签
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("结束一个元素"+qName);
//        if (qName.equals("person")){
//            this.persons.add(person);
//        }
        tag=null;
    }
    //闭根元素
    @Override
    public void endDocument() throws SAXException {
        System.out.println("处理文档结束");
    }
}
