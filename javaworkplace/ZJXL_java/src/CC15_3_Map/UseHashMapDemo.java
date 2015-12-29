package CC15_3_Map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UseHashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 1; i < 10; i++) {
			hm.put("Key" + i, i);
		}
		// 使用KeySet遍历集合
		Set<String> keySet = hm.keySet();
	
		for (String key : keySet) {

			System.out.println(key + ":" + hm.get(key));
			// 循环遍历过程中，不允许移除元素，否则，引发ConcurrentModificationException
			// if(hm.get(key) % 2!=0){
			// hm.remove(key);
			// }
		}
		System.out.println("\n使用Iterator遍历并移除元素");
		Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
		Iterator<Map.Entry<String, Integer>> itor = entrySet.iterator();
		while (itor.hasNext()) {
			Map.Entry<String, Integer> entry = itor.next();
			if(entry.getValue() % 2!=0){
				itor.remove();
				System.out.println(entry.getKey() + ":" + entry.getValue()+" is removed");
			}
			else{
				System.out.println(entry.getKey() + ":" + entry.getValue());	
			}
			
			
		}
	}

}
