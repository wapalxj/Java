package c99_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.swing.plaf.ListUI;

public class TestList {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("aaaa");
		list.add(new Date());
		list.add(new dog());
		list.add(1234);
		list.remove(new Date());//hashcode和equals
		
		System.out.println("list.size is "+list.size());
//		System.out.println(list.isEmpty());
		
		List list2 =new ArrayList();
		list2.add("bbbb");
		list2.add("cccc");
		list.add(list2);
		
		System.out.println("list.size is "+list.size());
		
		System.out.println(list.get(0));
		list.set(0, "cccc");
		System.out.println(list.get(0));
		
		
		
		
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.add("aaaa");
		list.set(5, "dddddd");
		list.set(6, "dddddd");
		System.out.println(list.get(5));
		System.out.println(list.get(6));//有顺序且可以重复
	}

}
class dog{}