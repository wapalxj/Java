package CC15_3_Map;


import java.util.*;


public class NullInHashMap
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		//试图将2个key为null的key-value对放入HashMap中——后来者居上
		hm.put(null , "null value1");
		hm.put(null , "null value2");
		//将一个value为null的key-value对放入HashMap中
		hm.put("string key" , null);
		//输出Map对象
		System.out.println(hm);
	}
}
