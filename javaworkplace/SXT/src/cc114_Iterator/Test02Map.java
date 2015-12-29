package cc114_Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * map迭代器的两种方式：
 * keySet和entrySet
 * @author Administrator
 *
 */
public class Test02Map {
	public static void main(String[] args) {
		Map map =new HashMap();
		map.put("id", 418);
		map.put("name", "vnix");
		map.put("salary", 3500);
		map.put("hireDate", "2015-0418");
		map.put(11111, "22222");
		
		/**
		 * keySet:通过调用keySet，
			放回一个Set集合，这个集合存放的都是key,
			然后对set集合进行迭代得到key值，然后根据得到的key值，
			再返回到map中进行查询。
		 */
		Set iter =map.keySet();//将map中所有的key放入iter中
		Iterator dataIte = iter.iterator();//调用iter的迭代器，赋给dataIte 
		while (dataIte.hasNext()) {
			Object key = (Object)dataIte.next();
			Object value = map.get(key);
			System.out.println(key + "----->" + value);
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@" );
		/**
		 * )通过调用entrySet(),
			返回的是一个装Entry对象的Set集合，
			然后对Set集合进行迭代得到entry对象，
			然后通过Entry.getKey()和Entry.getValue()
			得到key和value值。
		 */
		Set entrySet =map.entrySet();//将map中的key-value对放入entrySet中
		Iterator entryIte = entrySet.iterator();//调用entrySet的迭代器，赋给entryIte
		while (entryIte.hasNext()) {
			Entry entry =(Entry)entryIte.next();
			Object key = entry.getKey();
			Object value =entry.getValue();
			System.out.println(key + "----->" + value);
		}
		
	}

}
