package c99_Collection;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.geom.AreaOp.AddOp;

/**
 * 自己实现的一个ArrayList
 * @author Administrator
 *
 */

public class MyArrayList {
	private Object [] elementDate;
	
	private int size;
	
	public MyArrayList() {//constructor1
		this(10);
	}
	
	public MyArrayList(int initialCapacity) {//constructor2
		if (initialCapacity<0) {
			try {
				throw new Exception("Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementDate =new Object[initialCapacity];
		
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean add(Object obj) {//数组扩容与拷贝
		ensureCapacity();
		elementDate[this.size]=obj;
		this.size++;
		return true;
	}
	public boolean add(int index,Object obj) {//数组扩容与拷贝
		RangeCheck(index);
		ensureCapacity();
		System.arraycopy(elementDate, index, elementDate, index+1, this.size-index);
		elementDate[index]=obj;
		this.size++;
		return true;
	}
	
	public Object get(int index) {
		RangeCheck(index);
		return elementDate[index];
	}
	
	public void remove(int index) {//移除指定位置的对象
		RangeCheck(index);
		int numMoved =this.size-index-1;//需要移动的元素个数
		if (numMoved>0) {
			System.arraycopy(elementDate, index+1, elementDate, index, numMoved);
			elementDate[--this.size]=null;
		}
	}
	public void remove(Object obj) {//移除指定位置的对象,注意：当obj为null时，此处没有做处理
		for (int i = 0; i < this.size; i++) {
			if (get(i).equals(obj)) {
				remove(i);
			}
		}
	}
	
	public Object set(int index,Object obj) {
		RangeCheck(index);
		Object oldValue =elementDate[index];
		elementDate[index]=obj;
		return oldValue;
	}
	
	private void RangeCheck(int index) {
		if (index<0||index>=this.size) {
			try {
				throw new Exception("越界了");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void ensureCapacity() {
		if (this.size+1>elementDate.length) {
			Object [] newArray=new Object[size*2+2];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate=newArray;
		}
	}
	public static void main(String[] args) {
		MyArrayList list =new MyArrayList();
		list.add("1111");
		list.add("1111");
		list.add("1111");
		list.add("22222");
		
		List i =new ArrayList();
		List i2 =new ArrayList();
		
		i2.addAll(1, i);
		System.out.println(list.get(3));
//		System.out.println(list.get(10));
	}
}
