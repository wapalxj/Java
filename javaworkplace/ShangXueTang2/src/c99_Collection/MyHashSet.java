package c99_Collection;

import java.util.HashMap;
import java.util.HashSet;

public class MyHashSet {
	HashMap map;
	private static final Object PRESENT =new Object();

	public MyHashSet() {
		map=new HashMap();
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);//set的不可重复就是利用MAP的键
	}
	public int size() {
		return map.size();
	}
	public static void main(String[] args) {
		MyHashSet s =new MyHashSet();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
	}
}
