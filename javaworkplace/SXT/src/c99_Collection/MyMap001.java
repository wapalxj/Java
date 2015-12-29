package c99_Collection;

import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *  自定义实现类似Map001（暂不完美）
 *  MAP：存放键值对，根据键对象找值对象
 * @param args
 */
public class MyMap001 {
	MyEntry []arr =new MyEntry[990];
	int size;
	
	public void put(Object key,Object value) {
		MyEntry e =new MyEntry(key, value);
		/**
		 * 	Key:唯一标识，不能重复，重复处理：直接覆盖
		 */
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				arr[i].value=value;
				return ;
			}
		}
		arr[size++]=e;
	}
	
	public Object get(Object key) {
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return arr[i].value;
			}
		}
		return null;
	}
	
	public void remove(Object key) {
//		int k;
//		for (int i = 0; i < size; i++) {
//			if (arr[i].key.equals(key)) {
//				arr[i].key=null;
//				arr[i].value=null;
//				arr[i]=null;
//				k=i;
//			}
//		}
//		System.arraycopy(arr, 0, arr, k, arr.length-k);
	}
	
	public boolean containsKey(Object key) {
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value) {
		for (int i = 0; i < size; i++) {
			if (arr[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		MyMap001 m =new MyMap001();
		m.put("vnix", new Wife("vero"));
		m.put("vnix2", new Wife("vero2"));
		m.put("vnix2", new Wife("vero3"));
		Wife w =(Wife)m.get("vnix2");
		System.out.println(w.name);
	}

}

class MyEntry{//键值对
	Object key;
	Object value;
	
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}