package C11_innerclass;


public class LocalInnerClassTest {
	public static void main(String[] args) {
		TestLocalInnerClass();
	}
	//һ��ʹ���˱����ڲ���ľ�̬����
	private static void TestLocalInnerClass(){
		 // �����ڷ������ڲ����ڲ���
		class MyLocalInnerClass{
			private int field=100;
			private void printValue(){
				System.out.println(field);
			}
		};    //ע��Ҫ����һ���ֺ�
		//�����ڲ���Ҫʵ����֮�����ʹ��
		MyLocalInnerClass localObj=new MyLocalInnerClass();
		localObj.printValue();
	}
}
