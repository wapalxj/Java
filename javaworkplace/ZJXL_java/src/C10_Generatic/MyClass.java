package C10_Generatic;
import java.util.ArrayList;
import java.util.List;

/**
 * ΪʲôҪ���뷺��
 * @author Administrator
 *
 */
public class MyClass {
	public static void main(String[] args) {
		//��ʹ�÷���
		List strL =new ArrayList();//����һ��ֵ�����ַ�����List
		strL.add("aaaa");
		strL.add("aaaa");
		
		strL.add(1);//��С�İ����ִ��ȥ�ˣ������е���String����
		
	
		String s=(String)strL.get(1);//����String����
		System.out.println(s.length());//����ʱ�쳣��java.lang.ClassCastException
		
		//ʹ�÷���
		List<String> strL2 =new ArrayList<String>();//����һ��ֵ�����ַ�����List
		strL2.add("aaaa");//
		//strL2.add(138);//����ͨ����
		
	}
}
