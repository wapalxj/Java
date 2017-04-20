package C11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P220_AddingGroups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> collection =new ArrayList<>(
				Arrays.asList(1,2,3,4)
				);
		Integer[] moreInts={6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		for (Integer integer : collection) {
			System.out.print(integer+", ");
		}
		
		System.out.println();
		Collections.addAll(collection, 11,12,13);
		for (Integer integer : collection) {
			System.out.print(integer+", ");
		}
		
		
		System.out.println();
		Collections.addAll(collection, moreInts);
		
		for (Integer integer : collection) {
			System.out.print(integer+", ");
		}
		
		List<Integer> list=Arrays.asList(16,17,18,19);
		list.set(1, 99);
		//list.add(222);//运行时异常：底层是数组，不能增加
	}

}
