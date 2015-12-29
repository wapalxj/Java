package c59_Moni_ArratList;

import java.beans.IndexedPropertyChangeEvent;
import java.util.Arrays;


/**
 * ģ��ʵ��JDK�е�AArratList,ģ��StringBuffer
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
	 * ��ʼ��
	 */
	public MyArrayList() {
	//	value =new Object[10];
		this(10);
	}	
	public MyArrayList(int capacity) {
		if (capacity<0) {
			try {
				throw new Exception();//�ֶ��׳��쳣
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
	 * get����
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		rangeCheck(index);
		return value[index];
	}
	/**
	 * ����,indexOf�����׵�ַ��lastIndexOf���ص����׵�ַ
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
	 * //�ֶ����û��߸ı����ĳ��Ԫ��
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
	 * �쳣
	 * @param index
	 */
	public void rangeCheck(int index) {
		if (index<0||index>size-1) {
			try {
				throw new Exception();//�ֶ��׳��쳣
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
