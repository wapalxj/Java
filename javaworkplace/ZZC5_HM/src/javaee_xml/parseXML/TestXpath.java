package javaee_xml.parseXML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Created by wapal on 2017/5/31.
 */
public class TestXpath {
    public static String url="ZZC5_HM\\src\\javaee_xml\\parseXML\\Book.xml";
    public static void main(String[] args) throws DocumentException {
//        test1();
//        test2();
        test3();
    }
    //查询第二本书名
    public static void test1() throws DocumentException {
        SAXReader reader=new SAXReader();
        Document document=reader.read(url);
        String nodePath="/书架/书[2]/书名";
        Node node=document.selectSingleNode(nodePath);
        System.out.println(node.getText());
    }
    //遍历
    public static void test2() throws DocumentException {
        SAXReader reader=new SAXReader();
        Document document=reader.read(url);
        List list=document.selectNodes("//*");// //*所有元素
        for (int i = 0; i < list.size(); i++) {
            Node node= (Node) list.get(i);
            System.out.println(node.getName()+":\t"+node.getText());
        }
    }

    //获取所有书的书名
    public static void test3() throws DocumentException {
        String url="ZZC5_HM\\src\\javaee_xml\\parseXML\\Dom4jTest.xml";
        SAXReader reader=new SAXReader();
        Document document=reader.read(url);
        List list=document.selectNodes("/bookstore//book/title");// //*所有元素
        for (int i = 0; i < list.size(); i++) {
            Node node= (Node) list.get(i);
            System.out.println(node.getText());
        }
    }
}
