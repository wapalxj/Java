package CC15_5_Works;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Co5_article {
	public static void main(String[] args) {
		String article="While still catching-up to men in some spheres of modern life,"
				+"women appear to be way ahead in at least one undesirable category. "
				+"Women are particularly susceptible to developing depression and"
				+"anxiety disorders in response to stress compared to men,"
				+"according to Dr. Yehuda,chief psychiatrist at New York’s Veteran’s Administration Hospital.";
		String article2=article.replaceAll("\\.", "");
		
		String []words=article2.split(" |,");
		
		List<String> list =new ArrayList<String>();
		Set<String> set =new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			list.add(words[i].toLowerCase());
			set.add(words[i].toLowerCase());
		}
		
		
		System.out.println("本文出现的所有单词为"+list.size()+"个:");
		for (String wordsTable : list) {
			System.out.print(wordsTable+" ");
		}
		System.out.println();
		System.out.println("本文出现的单词为"+set.size()+"个:");
		for (String wordsTable2 : set) {
			System.out.println(wordsTable2+" ");
		}
		
//统计频数，排序：
		System.out.println("本文出现频数最高的3个单词以及出现次数为：");
		Map<String, Integer> map =new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			int count = map.containsKey(words[i].toLowerCase()) ? map.get(words[i].toLowerCase()) : 0;
			map.put(words[i].toLowerCase(), ++count);
		}
		
		 List<Map.Entry<String, Integer>> wordsList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet()); 
		 
		Collections.sort(wordsList,  
                new Comparator<Map.Entry<String, Integer>>() {  
                    public int compare(Entry<String, Integer> entry1,  
                            Entry<String, Integer> entry2) {  
                        int value1 = 0,value2=0; 
                        try {  
                            value1 = entry1.getValue();  
                            value2 = entry2.getValue();  
                        } catch (NumberFormatException e) {  
                            value1 = 0;  
                            value2 = 0;  
                        }  
                        return value2 - value1;  
                    }  
                });  
		
//		int flag=0;
//		for (Entry<String, Integer> entry : wordsList) {
//			System.out.println(entry.getKey()+": "+entry.getValue());
//			flag++;
//			if (flag>4){
//				break;
//			}
//		}
		
		
		
		Iterator<Map.Entry<String, Integer>> iter = wordsList.iterator();  
        int flag=0;
        while (iter.hasNext()&&flag<3) {  
        	Map.Entry<String, Integer> tmpEntry  = iter.next();  
            System.out.println(tmpEntry .getKey()+": "+tmpEntry .getValue());
            flag++;
        }  
     
		
	}
}
