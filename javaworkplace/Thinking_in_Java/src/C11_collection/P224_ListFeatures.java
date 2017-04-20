package C11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class P224_ListFeatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strings=new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			strings.add(i+"strssss");
		}
		System.out.println(strings);
		
		System.out.println("======sub======");
		List<String> sub=strings.subList(1, 4);
		System.out.println(strings);
		System.out.println(sub+"----"+strings.containsAll(sub));
		System.out.println("======reverse  sub======");
		Collections.reverse(sub);
		System.out.println(strings);
		System.out.println(sub+"----"+strings.containsAll(sub));
		
		System.out.println("======shuffle  sub======");
		Collections.shuffle(sub);
		System.out.println(strings);
		System.out.println(sub+"----"+strings.containsAll(sub));
		
		Collections.sort(strings);
		System.out.println(strings);
		System.out.println(sub);
		
	}

}
