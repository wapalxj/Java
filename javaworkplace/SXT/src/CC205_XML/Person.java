package CC205_XML;



import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2015/12/8.
 */
public class Person {
    private String name;
    private int age;

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//        1.获取解析工厂
        SAXParserFactory factory=SAXParserFactory.newInstance();
//        2.从解析工厂，获取解析器
        SAXParser parser=factory.newSAXParser();
//        3.加载文档document处理器,并且编写处理器
        PersonHandler personHandler=new PersonHandler();
        parser.parse(Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("CC205_XML\\person.xml")
                    ,personHandler);

        List<Person> persons =personHandler.getPersons();
        for (Person p:persons){
            System.out.println(p.getName()+"--->"+p.getAge());
        }
    }
    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
