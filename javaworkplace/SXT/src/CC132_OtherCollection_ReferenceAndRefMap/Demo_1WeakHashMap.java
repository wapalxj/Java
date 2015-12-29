package CC132_OtherCollection_ReferenceAndRefMap;

import java.util.WeakHashMap;

/*
 * WeakHashMap:��Ϊ������:gc������������
 */
public class Demo_1WeakHashMap {

	public static void main(String[] args) {
		WeakHashMap<String,String> map= new WeakHashMap<String, String>();
		//�����ض��󣬲������
		map.put("abc", "a");
		map.put("d", "test");
		//����
		map.put(new String("vero"), "c");
		map.put(new String("Alicc"), "d");
		
		//֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}

}
