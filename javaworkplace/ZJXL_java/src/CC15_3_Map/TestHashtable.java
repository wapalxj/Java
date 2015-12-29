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
		ht.put(new MyKey(60000) , "keyֵΪ60000����Ӧ��Value");
		ht.put(new MyKey(87563) , "KeyֵΪ87563����Ӧ��Value");
		ht.put(new MyKey(1232) , new B());
		System.out.println(ht);
		//ֻҪ��������ͨ��equals�ȽϷ���true��Hashtable����Ϊ��������ȵ�value��
		//��ΪHashtable����һ��B���������κζ���ͨ��equals�Ƚ϶���ȣ������������true��
		System.out.println(ht.containsValue("�����ַ���"));
		//ֻҪ����A�����count������ȣ�����ͨ��equals�ȽϷ���true����hashCode���
		//Hashtable����Ϊ��������ͬ��key�������������true��
		System.out.println(ht.containsKey(new MyKey(87563)));
//		System.out.println(ht.containsKey(new MyKey(87543)));
		
		
		
		//����������ɾ�����һ��key-value��
		ht.remove(new MyKey(1232));
		for (Object key : ht.keySet())
		{
			System.out.print(key + "---->");
			System.out.print(ht.get(key) + "\n");
		}
	}
}
