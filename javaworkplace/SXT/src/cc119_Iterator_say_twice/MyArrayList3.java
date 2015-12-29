package cc119_Iterator_say_twice;

import java.util.Iterator;

import javax.tools.JavaCompiler;

/**
 * 通过比较简单的迭代器了解迭代器底层
 * @author Administrator
 *
 */
public class MyArrayList3 implements java.lang.Iterable<String>{
	private String [] elem ={"a","b","c","d"};
	private int size =elem.length;
	/**
	 * 匿名内部类
	 * @return
	 */
	
	public Iterator<String> iterator() {
		return new Iterator<String>(){
			private int cursor =-1;//游标
			
			public boolean hasNext() {
				return cursor+1<size;
			}
			public String next() {
				cursor++;
				return elem[cursor];
			}
			public void remove() {
			
			}
		};
	
	}
	public static void main(String[] args) {
			MyArrayList3 list =new MyArrayList3();
			Iterator<String> it =list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			//使用增强for
			for (String temp : list) {//必须实现java.lang.Iterable接口，重写iterator方法
				System.out.println(temp);;
			}
	}

}
