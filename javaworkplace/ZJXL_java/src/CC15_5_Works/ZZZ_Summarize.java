package CC15_5_Works;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ZZZ_Summarize {

	public static void main(String[] args) {
		Integer []arr ={1,2,3,4,5,6};
		List<Integer> list =new ArrayList<>();
		Set<Integer> set= new HashSet<>();
		Map<Integer, Integer>  map =new HashMap<> ();
		
		int i=0;
		for (Integer e : arr) {
			list.add(e);
			set.add(e);
			map.put(++i, e);
		}
		
		

		
//		Iterator<Integer> Ilist =list.iterator();
//		while (Ilist.hasNext()) {
//			Integer i =Ilist.next();
//			System.out.println(i);
//			
//		}
//		
//		Iterator<Integer> Iset =set.iterator();
//		while (Iset.hasNext()) {
//			Integer i =Iset.next();
//			System.out.println(i);	
//		}
		
//1.不用泛型的keyset		
//			Set Imap =map.keySet();
//			Iterator it =Imap.iterator();
//			while ( it.hasNext()) {
//				Integer k = (Integer)it.next();
//				Integer v =map.get(k);
//				System.out.println(v);
//			}
		
//2.用泛型的keyset	
//			Set<Integer> Imap =map.keySet();
//			Iterator<Integer> it =Imap.iterator();
//			while ( it.hasNext()) {
//				Integer k = it.next();
//				Integer v =map.get(k);
//				System.out.println(v);
//			}
			
//1.不用泛型的entryset				
			Set entry =map.entrySet();
			Iterator et =entry.iterator();
			while (et.hasNext()) {
				Entry en =(Entry)et.next();
				Integer k =(Integer) en.getKey() ;
				Integer v =(Integer) en.getValue();
				System.out.println(v);
			}
			
//2.用泛型的entryset				
		    Set<Map.Entry<Integer, Integer>> entry2 = map.entrySet();
			Iterator <Map.Entry<Integer, Integer>> et2 =entry2.iterator();
			while (et2.hasNext()) {
				Map.Entry<Integer, Integer> en2 =et2.next();
				Integer k = en2.getKey() ;
				Integer v = en2.getValue();
				System.out.println(v);
			}
//3.foreach循环遍历Map		
//			for (Integer integer : map.keySet()) {
//			System.out.println(map.get(integer));
//		}
			
	}

}
