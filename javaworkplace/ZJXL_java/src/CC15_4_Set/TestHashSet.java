package CC15_4_Set;

import java.util.*;

//��A��equals�������Ƿ���true,��û����д��hashCode()����:HashCodeֵ����ͬ
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}

}
//��B��hashCode()�������Ƿ���1,��û����д��equals()������equalsֵ����ͬ
class B
{
	public int hashCode()
	{
		return 1;
	}
}
//��C��hashCode()�������Ƿ���2������ͬ
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
		//�ֱ���books���������2��A����2��B����2��C����
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		//�����[B@1, B@1, C@2, A@15db9742, A@6d06d69c]
		//Ϊʲô�������������
		System.out.println(books);
	}
}