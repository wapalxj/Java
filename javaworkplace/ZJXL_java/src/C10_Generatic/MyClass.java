package C10_Generatic;
import java.util.ArrayList;
import java.util.List;

/**
 * 为什么要引入泛型
 * @author Administrator
 *
 */
public class MyClass {
	public static void main(String[] args) {
		//不使用泛型
		List strL =new ArrayList();//创建一个值想存放字符串的List
		strL.add("aaaa");
		strL.add("aaaa");
		
		strL.add(1);//不小心把数字存进去了，在下行当做String处理
		
	
		String s=(String)strL.get(1);//当做String处理
		System.out.println(s.length());//运行时异常：java.lang.ClassCastException
		
		//使用泛型
		List<String> strL2 =new ArrayList<String>();//创建一个值想存放字符串的List
		strL2.add("aaaa");//
		//strL2.add(138);//编译通不过
		
	}
}
