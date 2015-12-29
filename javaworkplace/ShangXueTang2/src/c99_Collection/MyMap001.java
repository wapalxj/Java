package c99_Collection;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *  �Զ���ʵ������Map001���ݲ�������
 *  MAP����ż�ֵ�ԣ����ݼ�������ֵ����
 * @param args
 */
public class MyMap001 {
	MyEntry []arr =new MyEntry[990];
	int size;
	
	public void put(Object key,Object value) {
		MyEntry e =new MyEntry(key, value);
		/**
		 * 	Key:Ψһ��ʶ�������ظ����ظ�����ֱ�Ӹ���
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
	
	public void remove() {
		
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

class MyEntry{//��ֵ��
	Object key;
	Object value;
	
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}