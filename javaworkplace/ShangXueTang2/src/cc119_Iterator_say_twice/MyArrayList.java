package cc119_Iterator_say_twice;
/**
 * 比较简单的迭代器
 * @author Administrator
 *
 */
public class MyArrayList {
	private String [] elem ={"a","b","c","d"};
	
	private int size =elem.length;
	
	
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
	
	public static void main(String[] args) {
			MyArrayList list =new MyArrayList();
			while (list.hasNext()) {
				System.out.println(list.next());
			}
	}

}
