package cc119_Iterator_say_twice;

import java.util.Iterator;

/**
 * 比较简单的迭代器，加入接口
 * @author Administrator
 *
 */
public class MyArrayList2 {
	private String [] elem ={"a","b","c","d"};
	private int size =elem.length;
	
	private class MyIt implements Iterator<String>{
		private int cursor =-1;
		
		public boolean hasNext() {
			return cursor+1<size;
		}
		public String next() {
			cursor++;
			return elem[cursor];
		}
		public void name() {
			
		}
	}
	
	public Iterator<String> iterator() {
		return new MyIt();
	}
	
	public static void main(String[] args) {
			MyArrayList2 list =new MyArrayList2();
			Iterator<String> it =list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
