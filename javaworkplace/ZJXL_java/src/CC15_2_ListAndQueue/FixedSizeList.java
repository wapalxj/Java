package CC15_2_ListAndQueue;
import java.util.*;
/*
 * �̶���С��testList:Arrays���ڲ���
 */
public class FixedSizeList
{
	public static void main(String[] args) 
	{
		List fixedList = Arrays.asList("One book" , "Two book");
		//��ȡfixedList��ʵ���࣬�����Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//����fixedList�ļ���Ԫ��
		for (int i = 0; i < fixedList.size() ; i++)
		{
			System.out.println(fixedList.get(i));
		}
		//��ͼ���ӡ�ɾ��Ԫ�ض�������UnsupportedOperationException�쳣
		fixedList.add("Three book");
		fixedList.remove("One book");
	}
}