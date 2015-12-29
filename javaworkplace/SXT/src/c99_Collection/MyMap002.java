package c99_Collection;

import java.awt.List;
import java.awt.event.KeyAdapter;
import java.util.LinkedList;

/**
 * 提高效率//map底层：数组+链表:数组的每个元素是链表。
 * @author Administrator
 *
 */
public class MyMap002 {
	LinkedList []arr =new LinkedList[999];
	int size;
	
	public void put(Object key,Object value) {	
		MyEntry e =new MyEntry(key, value);
		
		int hash =key.hashCode();//此两行放置hashCode为负
		hash=hash<0?-hash:hash;
		
		int a=key.hashCode()%999;
		if (arr[a]==null) {
			LinkedList list =new LinkedList();
			arr[a]=list;
			list.add(e);
		}else {
			LinkedList list =arr[a];
			for (int i = 0; i < list.size(); i++) {
				MyEntry e2 =(MyEntry)list.get(i);
				if (e2.key.equals(key)) {
					 e2.value =value;;   //键值重复，覆盖
					 return;
				}
		    }
			
		//arr[a].add(e);
			list.add(e);
		}
		
	}
	
	public Object get(Object key) {
		int a=key.hashCode()%999; 
		if (arr[a]!=null) {
			LinkedList list =arr[a];
			for (int i = 0; i < list.size(); i++) {
				MyEntry e =(MyEntry)list.get(i);
				if (e.key.equals(key)) {
					return e.value;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		MyMap002 m =new MyMap002();
		m.put("vnix",new Wife("vero") );
		m.put("vnix2",new Wife("vero2") );
		Wife w=(Wife)m.get("vnix2");
		System.out.println(w.name);
	}

}
