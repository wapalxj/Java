package CC15_2_ListAndQueue;
import java.util.*;
/*
 * 比较ArrayList和LinkedList遍历效率
 */
public class TestPerformance
{
	public static void main(String[] args) 
	{
		//创建一个字符串数组
		String[] tst1 = new String[900000];
		//动态初始化数组元素
		for (int i = 0; i < 900000; i++)
		{
			tst1[i] = String.valueOf(i);
		}
		ArrayList al = new ArrayList();
	
		LinkedList ll = new LinkedList();
		
		//迭代访问ArrayList集合的所有元素，并输出迭代时间
		long start = System.nanoTime();
		//将所有数组元素加入ArrayList集合中
		for (int i = 0; i < 900000 ; i++)
		{
			al.add(tst1[i]);
		}
		for (Iterator it = al.iterator();it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("迭代ArrayList集合元素的时间:" + (System.nanoTime() - start));
		
		//迭代访问LinkedList集合的所有元素，并输出迭代时间
		start = System.nanoTime();
		//将所有数组元素加入LinkedList集合中
		for (int i = 0; i < 900000 ; i++)
		{
			ll.add(tst1[i]);
		}
		for (Iterator it = ll.iterator();it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("迭代LinkedList集合元素的时间:" + (System.nanoTime() - start));
	}
}
