package CC15_2_ListAndQueue;
import java.util.*;
/*
 * 固定大小的List:Arrays的内部类 
 */
public class FixedSizeList
{
	public static void main(String[] args) 
	{
		List fixedList = Arrays.asList("One book" , "Two book");
		//获取fixedList的实现类，将输出Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//遍历fixedList的集合元素
		for (int i = 0; i < fixedList.size() ; i++)
		{
			System.out.println(fixedList.get(i));
		}
		//试图增加、删除元素都将引发UnsupportedOperationException异常
		fixedList.add("Three book");
		fixedList.remove("One book");
	}
}