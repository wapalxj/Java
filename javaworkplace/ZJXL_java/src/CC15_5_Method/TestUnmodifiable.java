package CC15_5_Method;


import java.util.*;


public class TestUnmodifiable
{
	public static void main(String[] args)
	{
		//����һ���յġ����ɸı��testList����
		List unmodifiableList = Collections.emptyList();
		//����һ��ֻ��һ��Ԫ�أ��Ҳ��ɸı��Set����
		Set unmodifiableSet = Collections.singleton("example string");
		//����һ����ͨMap����
		Map scores = new HashMap();
		scores.put("����" , 80);
		scores.put("Java" , 82);
		//������ͨMap�����Ӧ�Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//��������һ�д��붼������UnsupportedOperationException�쳣
		unmodifiableList.add("����Ԫ��");
		unmodifiableSet.add("����Ԫ��");
		unmodifiableMap.put("����" , 90);
	}
}
