package C11_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P219_SimpleCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		list();
		set();
	}
	
	public static void set() {
		Collection<Integer> c=new HashSet<>();
		for (int i = 0; i < 5; i++) {
			c.add(i);
		}
		c.add(4);
		System.out.println("set---------");
		for (Integer i:c) {
			System.out.print(i+" ,");
		}
		System.out.println();
	}
	public static void list() {
		Collection<Integer> c=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			c.add(i);
		}
		c.add(4);
		System.out.println("list---------");
		for (Integer i:c) {
			System.out.print(i+" ,");
		}
		System.out.println();
	}

}
