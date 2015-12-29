package CC15_4_Set;
import java.util.*;

public class TestSet
{
	public static void main(String[] args) 
	{
		Set books = new HashSet();
		//添加一个字符串对象
		books.add(new String("example string"));
		//再次添加一个字符串对象，
		//因为两个字符串对象通过equals方法比较相等，所以添加失败，返回false
		boolean result = books.add(new String("example string"));
		System.out.println(result);
		//下面输出看到集合只有一个元素
		System.out.println(books);	
	}
}