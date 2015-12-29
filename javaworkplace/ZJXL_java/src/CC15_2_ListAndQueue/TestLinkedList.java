package CC15_2_ListAndQueue;
import java.util.*;
/*
 * ���г��๦�ܵ�LinkedList��
 */
public class TestLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList<String> books = new LinkedList<>();
		//���ַ���Ԫ�ؼ�����е�β��
		books.offer("One book");
		//��һ���ַ���Ԫ����ջ
		books.push("Two book");
		//���ַ���Ԫ����ӵ����е�ͷ��
		books.offerFirst("Three book");
        System.out.println("LinkedList�е�Ԫ�أ�");
		for (int i = 0; i < books.size() ; i++ )
		{
			System.out.println(books.get(i));
		}
        System.out.println("");
		//���ʡ�����ɾ�����еĵ�һ��Ԫ��
		System.out.println("���ʡ�����ɾ�����еĵ�һ��Ԫ��:"+books.peekFirst());
		//���ʡ�����ɾ�����е����һ��Ԫ��
		System.out.println("���ʡ�����ɾ�����е����һ��Ԫ��:"+books.peekLast());
		//���ó�ջ�ķ�ʽ����һ��Ԫ��pop������
		System.out.println("���ó�ջ�ķ�ʽ����һ��Ԫ��pop������:"+books.pop());
		//������������������е�һ��Ԫ�ر�ɾ��
		System.out.println("������һ��Ԫ�غ��LinkedList:"+books);
		//���ʡ���ɾ�����е����һ��Ԫ��
		System.out.println("���ʡ���ɾ�����е����һ��Ԫ��:"+books.pollLast());
		//�������������������ֻʣ���м�һ��Ԫ��
		System.out.println("LinkedList�е�Ԫ�أ�"+books);
		System.out.println();
		
		books.addLast("Book: addLast");
		books.addFirst("Book:addFirst");
		for(String book:books){
			System.out.println(book);
		}
		System.out.println();
		if(!books.isEmpty()){
			books.removeLast();
		}
		 System.out.println("LinkedList�е�Ԫ�ظ����� " + books.size());
		System.out.println("LinkedList�е�Ԫ�أ�"+books);
	}
}
