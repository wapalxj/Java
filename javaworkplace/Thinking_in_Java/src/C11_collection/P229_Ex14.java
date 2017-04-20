package C11_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class P229_Ex14 {

	/**
	 * 从中间插入数值
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integers = new LinkedList<>();
		for (int i = 0; i <= 11; i++) {
			ListIterator<Integer> iterator = integers.listIterator(integers
					.size() >> 1);
			if (i >= 1 && i % 2 != 0) {
				iterator.next();
			}
			iterator.add(i);
		}
		System.out.println(integers);
	}

}
