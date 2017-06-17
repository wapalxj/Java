package javaee_xml.parseXML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Created by wapal on 2017/5/31.
 */
public class TestDom4j {
    public static void main(String[] args) throws DocumentException {
        test2();
    }
    //得到某一个具体节点的内容，第二本书的书名：葵花宝典
    public static void test1(String[] args) throws DocumentException {
        //创建一个解析对象
        SAXReader reader=new SAXReader();
        //把xml文件加载到document对象中
        Document document=reader.read("ZZC5_HM\\src\\javaee_xml\\parseXML\\Book.xml");
        Element root =document.getRootElement();//获取根
//        Element bookNode=root.element("书");
//        System.out.println(bookNode.getName());
        List list=root.elements();//当前节点的所有子节点
        Element book= (Element) list.get(1);//得到第二本书
        String name=book.element("书名").getText();//获取书名
        System.out.println(name);
    }
    
    //遍历所有元素的节点
    public static void test2() throws DocumentException {
        //创建一个解析对象
        SAXReader reader=new SAXReader();
        //把xml文件加载到document对象中
        Document document=reader.read("ZZC5_HM\\src\\javaee_xml\\parseXML\\Book.xml");
        Element root =document.getRootElement();//获取根
        treeWalk(root);
    }

    //递归遍历
    private static void treeWalk(Element e) {
        System.out.print(e.getName());
        //e.nodeCount()：当前节点所有字节点的数量s
        for (int i = 0; i <e.nodeCount() ; i++) {
            Node node=e.node(i);//取出下标为i的节点
            if (node instanceof Element) {//是否为标签
                System.out.println();
                treeWalk((Element) node);
            }else if (!(node.getStringValue().trim()).equals("")){
                System.out.print(node.getText().trim()+" ");
            }
        }
    }
}
