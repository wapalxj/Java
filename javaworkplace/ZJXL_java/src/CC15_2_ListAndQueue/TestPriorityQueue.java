package CC15_2_ListAndQueue;

import java.util.*;

public class TestPriorityQueue
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		//�������������pq�м����ĸ�Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(9);
		pq.offer(0);
		pq.offer(110);
		//���pq���У������ǰ�Ԫ�صļ���˳�����У����ǰ�Ԫ�صĴ�С˳������
		System.out.println(pq);
		//���ʶ��е�һ��Ԫ�أ���ʵ���Ƕ�������С��Ԫ�أ�-3
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println("\n �Ƴ������е�headԪ��֮��");
		System.out.println(pq);
		pq.remove(9);
		System.out.println("\n �Ƴ������е�Ԫ��9֮��");
		System.out.println(pq);
		
	}
}
