package C11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class P228_Ex12 {

	/**listIterator
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		List<Integer> reverse = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			integers.add(i);
		}

//		reverser1(integers,reverse);
//		reverser2(integers, reverse);
		reverser3(integers, reverse);
		System.out.println(reverse);

	}

	public static void reverser1(List<Integer> integers, List<Integer> reverse) {
		for (Integer integer : integers) {
			reverse.add(integer);
		}
		Collections.reverse(reverse);
	}

	public static void reverser2(List<Integer> integers, List<Integer> reverse) {
		ListIterator<Integer> lIt = integers.listIterator(integers.size());
		while (lIt.hasPrevious()) {
			reverse.add(lIt.previous());
		}
	}

	/**
	 * ²Î¿¼´ğ°¸
	 * 
	 * @param integers
	 * @param reverse
	 */
	public static void reverser3(List<Integer> integers, List<Integer> reverse) {
		for (Integer integer : integers) {
			reverse.add(integer);
		}
		ListIterator<Integer> fwd = reverse.listIterator();
		ListIterator<Integer> rev = reverse.listIterator(integers.size());
		int mid = reverse.size() >> 1;
		for (int i = 0; i < mid; i++) {
			Integer tmp = fwd.next();
			fwd.set(rev.previous());
			rev.set(tmp);
		}
	}
}
