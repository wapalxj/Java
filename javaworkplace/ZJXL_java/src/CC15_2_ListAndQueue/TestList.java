package CC15_2_ListAndQueue;

import java.util.*;

public class TestList
{
	public static void main(String[] args) 
	{
		List books = new ArrayList();
		//��books�������������Ԫ��
		books.add(new String("One book"));
		books.add(new String("Two book"));
		books.add(new String("Three book"));
		System.out.println(books);
		//�����ַ�����������ڵڶ���λ��
		books.add(1 , new String("new book"));
		for (int i = 0 ; i < books.size() ; i++ )
		{
			System.out.println(books.get(i));
		}
		//ɾ��������Ԫ��
		books.remove(2);
		System.out.println(books);
		//�ж�ָ��Ԫ����testList������λ�ã����1������λ�ڵڶ�λ
		System.out.println(books.indexOf(new String("new book")));
		//���ڶ���Ԫ���滻���µ��ַ�������
		books.set(1, new String("new book2"));
		System.out.println(books);
		//��books���ϵĵڶ���Ԫ�أ���������������Ԫ�أ�����������ȡ�Ӽ���
		System.out.println(books.subList(1 , 2));

	}
}

