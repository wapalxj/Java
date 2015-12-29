package c59_Moni_ArratList;

import java.beans.IndexedPropertyChangeEvent;
import java.util.Arrays;


/**
 * 模拟实现JDK中的AArratList,模拟StringBuffer
 * @author Administrator
 *
 */
public class MyArrayList {
	/**
	 * The value is used for object storage
	 */
	private Object [] value;
	/**
	 * the size is the number of objects used
	 */
	private int size;
	/**
	 * 初始化
	 */
	public MyArrayList() {
	//	value =new Object[10];
		this(10);
	}	
	public MyArrayList(int capacity) {
		if (capacity<0) {
			try {
				throw new Exception();//手动抛出异常
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		value =new Object[capacity];
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	/**
	 * add the element
	 * @param obj
	 */
	public void add(Object obj) {
		value[size]=obj;
		size++;
		if(size>=value.length){
			int newCapacity =value.length*2+2;
//			value = Arrays.copyOf(value, newCapacity);
			Object [] newsList=new Object[newCapacity];
			for (int i = 0; i < size; i++) {
				newsList[i]=value[i];
			}
			value =newsList;
		}
	}
	/**
	 * get方法
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		rangeCheck(index);
		return value[index];
	}
	/**
	 * 索引,indexOf返回首地址，lastIndexOf返回倒数首地址
	 * @param obj
	 * @return
	 */
	public int indexOf(Object obj) {
		if(obj==null){
			return -1;
		}
		else{
			for (int i = 0; i < size-1; i++) {
				if (obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
	}
	
	public int lastIndexOf(Object obj) {
		if(obj==null){
			return -1;
		}
		else{
			for (int i = size-1; i >= 0; i--) {
				if (obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
	}
	/**
	 * //手动设置或者改变表中某个元素
	 * @param index
	 * @param obj
	 * @return
	 */
	public Object set(int index,Object obj) {
		rangeCheck(index);
		Object old =value[index];
		value[index]=obj;
		return old;
	}
	/**
	 * 异常
	 * @param index
	 */
	public void rangeCheck(int index) {
		if (index<0||index>size-1) {
			try {
				throw new Exception();//手动抛出异常
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
