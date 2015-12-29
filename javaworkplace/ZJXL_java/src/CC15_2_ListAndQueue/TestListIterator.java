package CC15_2_ListAndQueue;


import java.util.*;

/*
 * 反向迭代
 */
public class TestListIterator
{
	public static void main(String[] args) 
	{
		String[] books = {
			"One book",
			"Two book"
		};
		
		List bookList = new ArrayList();
		for (int i = 0; i < books.length ; i++ )
		{
			bookList.add(books[i]);
		}
		
		ListIterator lit = bookList.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("-------分隔符-------");
		}
		
		System.out.println("==========下面开始反向迭代===========");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
