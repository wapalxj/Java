package CC15_4_Set;

import java.util.*;

class R
{
	int value;
	public R(int value)
	{
		this.value = value;
	}
	public String toString()
	{
		return "R(value属性:" + value + ",hashCode:"+this.hashCode()+")";
	}
	public boolean equals(Object obj)
	{
		if (obj instanceof R)
		{
			R r = (R)obj;
			if (r.value == this.value)
			{
				return true;
			}
		}
		return false;
	}
	public int hashCode()
	{	return super.hashCode();
//		return this.value;
	}
	
}
public class TestHashSet2
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(new R(5));
//		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//打印TreeSet集合，集合元素是有序排列的
		System.out.println("集合中的原始元素："+hs);
		//取出第一个元素
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//为第一个元素的value属性赋值
		first.value = -3;
		
		//再次输出value将看到TreeSet里的元素处于无序状态
		System.out.println("将第一个元素值改为-3："+hs);
		hs.remove(new R(-3));

		System.out.println("移除-3的元素之后："+hs);
		//输出false
		System.out.println("hs是否包含value为-3的R对象？" + hs.contains(new R(-3)));
		//输出false
		System.out.println("hs是否包含value为-2的R对象？" + hs.contains(new R(-2)));

	}
}
