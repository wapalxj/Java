package cc114_Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * map�����������ַ�ʽ��
 * keySet��entrySet
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
		 * keySet:ͨ������keySet��
			�Ż�һ��Set���ϣ�������ϴ�ŵĶ���key,
			Ȼ���set���Ͻ��е����õ�keyֵ��Ȼ����ݵõ���keyֵ��
			�ٷ��ص�map�н��в�ѯ��
		 */
		Set iter =map.keySet();//��map�����е�key����iter��
		Iterator dataIte = iter.iterator();//����iter�ĵ�����������dataIte 
		while (dataIte.hasNext()) {
			Object key = (Object)dataIte.next();
			Object value = map.get(key);
			System.out.println(key + "----->" + value);
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@" );
		/**
		 * )ͨ������entrySet(),
			���ص���һ��װEntry�����Set���ϣ�
			Ȼ���Set���Ͻ��е����õ�entry����
			Ȼ��ͨ��Entry.getKey()��Entry.getValue()
			�õ�key��valueֵ��
		 */
		Set entrySet =map.entrySet();//��map�е�key-value�Է���entrySet��
		Iterator entryIte = entrySet.iterator();//����entrySet�ĵ�����������entryIte
		while (entryIte.hasNext()) {
			Entry entry =(Entry)entryIte.next();
			Object key = entry.getKey();
			Object value =entry.getValue();
			System.out.println(key + "----->" + value);
		}
		
	}

}
