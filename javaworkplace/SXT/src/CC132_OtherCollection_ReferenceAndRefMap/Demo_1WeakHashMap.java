package CC132_OtherCollection_ReferenceAndRefMap;

import java.util.WeakHashMap;

/*
 * WeakHashMap:键为弱类型:gc运行立即回收
 */
public class Demo_1WeakHashMap {

	public static void main(String[] args) {
		WeakHashMap<String,String> map= new WeakHashMap<String, String>();
		//常量池对象，不会回收
		map.put("abc", "a");
		map.put("d", "test");
		//回收
		map.put(new String("vero"), "c");
		map.put(new String("Alicc"), "d");
		
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}

}
