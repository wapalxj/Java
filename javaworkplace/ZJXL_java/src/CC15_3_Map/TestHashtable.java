package CC15_3_Map;


import java.util.*;


class MyKey
{
	int value;
	public MyKey(int count)
	{
		this.value = count;
	}
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		if (obj != null && 	obj.getClass() == MyKey.class)
		{
			MyKey a = (MyKey)obj;
			if (this.value == a.value)
			{
				return true;
			}
		}
		return false;
	}
	public int hashCode()
	{
		return this.value;
	}
	public String toString(){
		return "MyKey:"+this.value;
	}
}
class B
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class TestHashtable
{
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
		ht.put(new MyKey(60000) , "key值为60000所对应的Value");
		ht.put(new MyKey(87563) , "Key值为87563所对应的Value");
		ht.put(new MyKey(1232) , new B());
		System.out.println(ht);
		//只要两个对象通过equals比较返回true，Hashtable就认为它们是相等的value。
		//因为Hashtable中有一个B对象，它与任何对象通过equals比较都相等，所以下面输出true。
		System.out.println(ht.containsValue("测试字符串"));
		//只要两个A对象的count属性相等，它们通过equals比较返回true，且hashCode相等
		//Hashtable即认为它们是相同的key，所以下面输出true。
		System.out.println(ht.containsKey(new MyKey(87563)));
//		System.out.println(ht.containsKey(new MyKey(87543)));
		
		
		
		//下面语句可以删除最后一个key-value对
		ht.remove(new MyKey(1232));
		for (Object key : ht.keySet())
		{
			System.out.print(key + "---->");
			System.out.print(ht.get(key) + "\n");
		}
	}
}
