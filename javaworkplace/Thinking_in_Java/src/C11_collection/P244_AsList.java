package C11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

public class P244_AsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] ia={1,2,3,4,5,6,7};
		List<Integer> list1 =new ArrayList<>(Arrays.asList(ia));
//		System.out.println(list1);
//		System.out.println(Arrays.toString(ia));
		Collections.shuffle(list1);
		System.out.println(list1);
		System.out.println(Arrays.toString(ia));
		System.out.println("------------------------------------");
		
		List<Integer> list2 =Arrays.asList(ia);
		//list2.add(1000); ÔËÐÐ³ö´í
		Collections.shuffle(list2);
		System.out.println(list2);
		System.out.println(Arrays.toString(ia));
		

		
	}

}
