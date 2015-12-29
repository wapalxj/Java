package CC15_5_Works;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class Co1_GenerationMethod {

	private static final String Integer = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(2);		
		
		Set<Integer> set =new HashSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(3);
		
		Map<String, Integer> map =new HashMap<String, Integer>();
		map.put("1", 6);
		map.put("1", 7);
		map.put("1", 8);
		
		System.out.println(max(null,list));
		System.out.println(max(null,set));
		System.out.println(max(map,null));
		
	}
	public static <T,T1> T1 max(Map<T,T1> m,Collection<T1> c){
		T1 max = null;
		
		if (c==null ){
			for (Object key : m.keySet())
			{
				if (max ==null) {
					max=(T1)m.get(key);
				}
				if ((Integer)max< (Integer)m.get(key)) {
					max=(T1) m.get(key);
				}
				
			}
		} 
		
		else {
			if (m==null) {
				for ( T1 i :c) {
					if (max ==null) {
						max=i;
					}
					if ((Integer)max<(Integer)i) {
						max=i;
					}
				}	
			}
		
			
		}

	
		
		return max ;
		}
}