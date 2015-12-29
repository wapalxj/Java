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
		// ʹ��KeySet��������
		Set<String> keySet = hm.keySet();
	
		for (String key : keySet) {

			System.out.println(key + ":" + hm.get(key));
			// ѭ�����������У��������Ƴ�Ԫ�أ���������ConcurrentModificationException
			// if(hm.get(key) % 2!=0){
			// hm.remove(key);
			// }
		}
		System.out.println("\nʹ��Iterator�������Ƴ�Ԫ��");
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
