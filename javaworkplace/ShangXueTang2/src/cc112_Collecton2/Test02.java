package cc112_Collecton2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ʵ�����ݴ洢�ı�������MAP�ļ�Ӧ�ã�һ��MAP��Ӧ����һ�м�¼��key�����ֶ���
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		Map map =new HashMap();
		map.put("id", 418);
		map.put("name", "vnix");
		map.put("salary", 3500);
		map.put("hireDate", "2015-0418");
		
		Map map2 =new HashMap();
		map2.put("id", 419);
		map2.put("name", "vero");
		map2.put("salary", 3000);
		map2.put("hireDate", "2015-0418");
		
		List<Map> list =new ArrayList<Map>();
		list.add(map);
		list.add(map2);
		
		printEmName(list);
		
	}
	
	public static void printEmName(List<Map> list) {
		for (int i = 0; i < list.size(); i++) {
			Map tempMap =list.get(i);
			System.out.println(tempMap.get("id")+"--"+tempMap.get("name")+"--"+tempMap.get("salary"));
		}
	}

}