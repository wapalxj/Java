package C11_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class P237_priorityQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> integers =new PriorityQueue<>();
		for (int i = 10; i > 0; i--) {
			integers.offer(i);
		}
		for (int i = 0; integers.peek()!=null; i++) {
			System.out.print(integers.poll()+" ");
		}
	}

}
