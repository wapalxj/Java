package C10_Generatic_method;

import java.util.ArrayList;
import java.util.List;
/**
 * 定义个数可变的参数：T...
 * @author Administrator
 *
 */
public class Lists {
	public static <T> List<T> toList(T... arr) {
		List<T> list =new ArrayList<T>();
		for (T t : arr) {
			list.add(t);
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Integer> ints =Lists.toList(1,2,3);
		List<String> words =Lists.toList("hello","world");
		System.out.println(ints.get(0));
		System.out.println(words.get(0));
	}

}
