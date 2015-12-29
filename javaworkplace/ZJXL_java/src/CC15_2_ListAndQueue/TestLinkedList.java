package CC15_2_ListAndQueue;
import java.util.*;
/*
 * 具有超多功能的LinkedList：
 */
public class TestLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList<String> books = new LinkedList<>();
		//将字符串元素加入队列的尾部
		books.offer("One book");
		//将一个字符串元素入栈
		books.push("Two book");
		//将字符串元素添加到队列的头部
		books.offerFirst("Three book");
        System.out.println("LinkedList中的元素：");
		for (int i = 0; i < books.size() ; i++ )
		{
			System.out.println(books.get(i));
		}
        System.out.println("");
		//访问、并不删除队列的第一个元素
		System.out.println("访问、并不删除队列的第一个元素:"+books.peekFirst());
		//访问、并不删除队列的最后一个元素
		System.out.println("访问、并不删除队列的最后一个元素:"+books.peekLast());
		//采用出栈的方式将第一个元素pop出队列
		System.out.println("采用出栈的方式将第一个元素pop出队列:"+books.pop());
		//下面输出将看到队列中第一个元素被删除
		System.out.println("弹出了一个元素后的LinkedList:"+books);
		//访问、并删除队列的最后一个元素
		System.out.println("访问、并删除队列的最后一个元素:"+books.pollLast());
		//下面输出将看到队列中只剩下中间一个元素
		System.out.println("LinkedList中的元素："+books);
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
		 System.out.println("LinkedList中的元素个数： " + books.size());
		System.out.println("LinkedList中的元素："+books);
	}
}
