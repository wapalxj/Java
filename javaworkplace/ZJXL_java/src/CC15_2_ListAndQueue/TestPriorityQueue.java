package CC15_2_ListAndQueue;

import java.util.*;

public class TestPriorityQueue
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		//下面代码依次向pq中加入四个元素
		pq.offer(6);
		pq.offer(-3);
		pq.offer(9);
		pq.offer(0);
		pq.offer(110);
		//输出pq队列，并不是按元素的加入顺序排列，而是按元素的大小顺序排列
		System.out.println(pq);
		//访问队列第一个元素，其实就是队列中最小的元素：-3
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println("\n 移除队列中的head元素之后");
		System.out.println(pq);
		pq.remove(9);
		System.out.println("\n 移除队列中的元素9之后");
		System.out.println(pq);
		
	}
}
