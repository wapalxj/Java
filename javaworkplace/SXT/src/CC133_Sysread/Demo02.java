package CC133_Sysread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/*
 * 只读设置：
	emptyXXX()空的不可变集合
		emptList()
		emptMap()
		emptSet()
	singletonXXX()一个元素不可变集合
		singleton(T o)
		singletonList(T o)
		singletonMap(K  key, V value)
	UnmodifiableXXX()不可变容器
		UnmodifiableList(List<? extends T> list)
		UnmodifiableSet(Set<? extends T> s)
		UnmodifiableMap(Map<? extends K,? extends V> m)
	
 */
public class Demo02 {

	public static void main(String[] args) {
		Map<String, String> map =new HashMap<String, String>();
		map.put("vero", "qqq");
		map.put("vnix", "www");
		
//1.只读控制:UnmodifiableXXX():不可变容器
		Map<String, String> map2 =Collections.unmodifiableMap(map);
//		map2.put("a", "a");//加入只读控制，不能再添加元素
		System.out.println(map2.size());
		
//2.singletonXXX():只有一个元素的容器
		List<String> list =Collections.singletonList(new String("Alicc"));
//		list.add("vnix");//不能再添加元素
		System.out.println(list.get(0));
			
	}
//3.emptyXXX()
	public static Set<String> oper(Set<String> set) {
		if (null==set) {
			return Collections.EMPTY_SET;//外部获取避免空指针异常
		}
		return set;
	}

}
