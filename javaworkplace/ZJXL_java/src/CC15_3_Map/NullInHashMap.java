package CC15_3_Map;


import java.util.*;


public class NullInHashMap
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		//��ͼ��2��keyΪnull��key-value�Է���HashMap�С��������߾���
		hm.put(null , "null value1");
		hm.put(null , "null value2");
		//��һ��valueΪnull��key-value�Է���HashMap��
		hm.put("string key" , null);
		//���Map����
		System.out.println(hm);
	}
}
