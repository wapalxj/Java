package CC15_4_Set;
import java.util.*;

public class TestSet
{
	public static void main(String[] args) 
	{
		Set books = new HashSet();
		//���һ���ַ�������
		books.add(new String("example string"));
		//�ٴ����һ���ַ�������
		//��Ϊ�����ַ�������ͨ��equals�����Ƚ���ȣ��������ʧ�ܣ�����false
		boolean result = books.add(new String("example string"));
		System.out.println(result);
		//���������������ֻ��һ��Ԫ��
		System.out.println(books);	
	}
}