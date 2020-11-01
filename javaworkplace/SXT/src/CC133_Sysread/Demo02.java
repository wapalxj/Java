package CC133_Sysread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/*
 * ֻ�����ã�
	emptyXXX()�յĲ��ɱ伯��
		emptList()
		emptMap()
		emptSet()
	singletonXXX()һ��Ԫ�ز��ɱ伯��
		singleton(T o)
		singletonList(T o)
		singletonMap(K  key, V value)
	UnmodifiableXXX()���ɱ�����
		UnmodifiableList(testList<? extends T> list)
		UnmodifiableSet(Set<? extends T> s)
		UnmodifiableMap(Map<? extends K,? extends V> m)
	
 */
public class Demo02 {

	public static void main(String[] args) {
		Map<String, String> map =new HashMap<String, String>();
		map.put("vero", "qqq");
		map.put("vnix", "www");
		
//1.ֻ������:UnmodifiableXXX():���ɱ�����
		Map<String, String> map2 =Collections.unmodifiableMap(map);
//		map2.put("a", "a");//����ֻ�����ƣ����������Ԫ��
		System.out.println(map2.size());
		
//2.singletonXXX():ֻ��һ��Ԫ�ص�����
		List<String> list =Collections.singletonList(new String("Alicc"));
//		list.add("vnix");//���������Ԫ��
		System.out.println(list.get(0));
			
	}
//3.emptyXXX()
	public static Set<String> oper(Set<String> set) {
		if (null==set) {
			return Collections.EMPTY_SET;//�ⲿ��ȡ�����ָ���쳣
		}
		return set;
	}

}
