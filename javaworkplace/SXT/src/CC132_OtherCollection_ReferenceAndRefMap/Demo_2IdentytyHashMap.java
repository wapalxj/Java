package CC132_OtherCollection_ReferenceAndRefMap;

import java.util.IdentityHashMap;

import com.sun.javafx.geom.transform.Identity;

/*
 * IdentytyHashMap:���Ƚϵ�ַȥ��
 */
public class Demo_2IdentytyHashMap {

	public static void main(String[] args) {
		IdentityHashMap<String,String> map =new IdentityHashMap<String, String>();
		//�������е�"a"
		map.put("a", "a1");
		map.put("a", "a2");
		System.out.println(map.size());
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a1");
		System.out.println(map.size());
		

	}

}
