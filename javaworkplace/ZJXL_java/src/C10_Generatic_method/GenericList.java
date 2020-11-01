package C10_Generatic_method;


import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class GenericList
{
	public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException 
	{
		//����һ��ֻ�뱣���ַ�����testList����
		List<String> strList = new ArrayList<String>();
		strList.add("One string");
		strList.add("Two string");
		strList.add("Three string");
		//������뽫����������
		//strList.add(5);
		//��ʹ�÷�������ƿ����������﷨���
		//strList.getClass().getMethod("add", Object.class).invoke(strList, 5);
		for (int i = 0; i < strList.size() ; i++ )
		{
			//�����������ǿ������ת��
			String str = strList.get(i);
			System.out.println(strList.get(i));
		}
		
	}
}