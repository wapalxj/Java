package c64_boxing_Charp4;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer a =new Integer(10);
		Integer a =10;//after jkd5.0:�Զ�װ�䣬�����������Ľ����룺Integer a =new Integer(10);
		
		Integer b =1000;
		
		
		int c=new Integer(1500);//�Զ����䣺��������Ľ�:Integer(1500).intValue().
		int d=b;//�Զ����䣺��������Ľ�:d=b.intValue()
		
		
		
		System.out.println(d);
		
		Integer q1 =1000;//�Զ�װ���Integer����
		Integer q2 =1000;//�Զ�װ��Integer��
		
		System.out.println(q1==q2);
		System.out.println(q1.equals(q2));
		System.out.println("########################");
		
		Integer d3 =123;//[-128,127]֮���������Ȼ�Զ�װ���ˣ�����Ȼ�����������������ʹ���
		Integer d4 =123;
		
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
	}

}
