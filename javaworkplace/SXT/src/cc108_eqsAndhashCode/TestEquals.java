package cc108_eqsAndhashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list =new ArrayList();
		String s1=new String("aaa");
		String s2=new String("aaa");
		list.add(s1);
		list.add(s2);
		
		System.out.println(list.size());
		
		
		Map map =new HashMap();
		//所谓键不能重复：是依赖于equals方法，equals方法为true，则重复
		map.put(s1, "AAAA");
		map.put(s2, "BBBB");
		System.out.println(map.get("aaa"));
		
		Student ss1 =new Student(1,"q");
		Student ss2 =new Student(2,"yy");
		System.out.println(ss1.equals(new Student(1,"q")));
	}

}
