package cc114_Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 * 使用迭代器遍历Set和List
 * @author Administrator
 *
 */

public class Test01 {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("aaa");
		list.add("aaad");
		list.add("aaaff");
		
		//set因为是无序的，无法这样进行遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Set set =new HashSet();
		set.add("1111");
		set.add("2222");
		set.add("3333");
		/**
		 * 使用迭代器遍历
		 */
		Iterator iter =set.iterator();
		while (iter.hasNext()) {
			String str =(String)iter.next();
			System.out.println(str);
		}
		
		//通过迭代器也可以遍历List
		Iterator iter2 =list.iterator();
		while (iter2.hasNext()) {
			String str2 =(String)iter2.next();
			System.out.println(str2);
			iter2.remove();//挨个删除
		}
		System.out.println(list.size());
	}

}
