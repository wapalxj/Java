package cc119_Iterator_say_twice;

import java.util.Iterator;

import javax.tools.JavaCompiler;

/**
 * ͨ���Ƚϼ򵥵ĵ������˽�������ײ�
 * @author Administrator
 *
 */
public class MyArrayList3 implements java.lang.Iterable<String>{
	private String [] elem ={"a","b","c","d"};
	private int size =elem.length;
	/**
	 * �����ڲ���
	 * @return
	 */
	
	public Iterator<String> iterator() {
		return new Iterator<String>(){
			private int cursor =-1;//�α�
			
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
			//ʹ����ǿfor
			for (String temp : list) {//����ʵ��java.lang.Iterable�ӿڣ���дiterator����
				System.out.println(temp);;
			}
	}

}
