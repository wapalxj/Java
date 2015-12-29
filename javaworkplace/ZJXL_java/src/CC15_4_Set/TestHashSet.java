package CC15_4_Set;

import java.util.*;

//类A的equals方法总是返回true,但没有重写其hashCode()方法:HashCode值不相同
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}

}
//类B的hashCode()方法总是返回1,但没有重写其equals()方法：equals值不相同
class B
{
	public int hashCode()
	{
		return 1;
	}
}
//类C的hashCode()方法总是返回2：都相同
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class TestHashSet
{
	public static void main(String[] args) 
	{
		HashSet books = new HashSet();
		//分别向books集合中添加2个A对象，2个B对象，2个C对象
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		//输出：[B@1, B@1, C@2, A@15db9742, A@6d06d69c]
		//为什么会有上述输出？
		System.out.println(books);
	}
}