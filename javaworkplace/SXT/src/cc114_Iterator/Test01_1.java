package cc114_Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 * ʹ�õ���������Set��List
 * @author Administrator
 *
 */

public class Test01_1 {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("aaa");
		list.add("aaad");
		list.add("aaaff");
		
		//set��Ϊ������ģ��޷��������б���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Set set =new HashSet();
		set.add("1111");
		set.add("2222");
		set.add("3333");
		/**
		 * ʹ�õ���������set
		 */
		Iterator iter =set.iterator();
		while (iter.hasNext()) {
			String str =(String)iter.next();
			System.out.println(str);
		}
		
		/*
		 * ���ǿ�����foreach����set:foreachʵ����Iteratorʵ�ֵ�
		 */
		for (Object object : set) {
			String s=(String) object;
			System.out.println(s);
		}
		//ͨ��������Ҳ���Ա���List
		Iterator iter2 =list.iterator();
		while (iter2.hasNext()) {
			String str2 =(String)iter2.next();
			System.out.println(str2);
			iter2.remove();//����ɾ��
		}
		System.out.println(list.size());
		
		
		
	}

	
}
