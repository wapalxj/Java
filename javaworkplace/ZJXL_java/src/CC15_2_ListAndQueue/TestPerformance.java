package CC15_2_ListAndQueue;
import java.util.*;
/*
 * �Ƚ�ArrayList��LinkedList����Ч��
 */
public class TestPerformance
{
	public static void main(String[] args) 
	{
		//����һ���ַ�������
		String[] tst1 = new String[900000];
		//��̬��ʼ������Ԫ��
		for (int i = 0; i < 900000; i++)
		{
			tst1[i] = String.valueOf(i);
		}
		ArrayList al = new ArrayList();
	
		LinkedList ll = new LinkedList();
		
		//��������ArrayList���ϵ�����Ԫ�أ����������ʱ��
		long start = System.nanoTime();
		//����������Ԫ�ؼ���ArrayList������
		for (int i = 0; i < 900000 ; i++)
		{
			al.add(tst1[i]);
		}
		for (Iterator it = al.iterator();it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("����ArrayList����Ԫ�ص�ʱ��:" + (System.nanoTime() - start));
		
		//��������LinkedList���ϵ�����Ԫ�أ����������ʱ��
		start = System.nanoTime();
		//����������Ԫ�ؼ���LinkedList������
		for (int i = 0; i < 900000 ; i++)
		{
			ll.add(tst1[i]);
		}
		for (Iterator it = ll.iterator();it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("����LinkedList����Ԫ�ص�ʱ��:" + (System.nanoTime() - start));
	}
}
