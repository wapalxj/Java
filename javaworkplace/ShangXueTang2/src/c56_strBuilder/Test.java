package c56_strBuilder;

public class Test {

	/**
	 * �ɱ��ַ�����:strBuilder��strBuffer
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();//�ַ���ʼ����Ϊ16
		StringBuilder sb1 =new StringBuilder(32);//�ַ���ʼ����Ϊ32
		StringBuilder sb2 =new StringBuilder("abcd");//�ַ���ʼ����Ϊ32,value[]={'a','b','c','d','\u0000','\u0000','\u0000'����}
		sb2.append("efg");
		sb2.append(true);
		sb2.append(123).append(456);//append�������γ�һ������������Ϊ���ķ���ֵ��this
		System.out.println(sb2);
	}

}
