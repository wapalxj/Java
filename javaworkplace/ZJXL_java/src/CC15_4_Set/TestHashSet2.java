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
		return "R(value����:" + value + ",hashCode:"+this.hashCode()+")";
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
		//��ӡTreeSet���ϣ�����Ԫ�����������е�
		System.out.println("�����е�ԭʼԪ�أ�"+hs);
		//ȡ����һ��Ԫ��
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//Ϊ��һ��Ԫ�ص�value���Ը�ֵ
		first.value = -3;
		
		//�ٴ����value������TreeSet���Ԫ�ش�������״̬
		System.out.println("����һ��Ԫ��ֵ��Ϊ-3��"+hs);
		hs.remove(new R(-3));

		System.out.println("�Ƴ�-3��Ԫ��֮��"+hs);
		//���false
		System.out.println("hs�Ƿ����valueΪ-3��R����" + hs.contains(new R(-3)));
		//���false
		System.out.println("hs�Ƿ����valueΪ-2��R����" + hs.contains(new R(-2)));

	}
}
