package C11_innerclass;


public class MemberInnerClassTest {
	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		outer.testInnerClass();
		
//		InnerClass ��Ϊprivateʱ
//		OuterClass.InnerClass a =new OuterClass().new InnerClass();
//		a.visit();
	}
}

class OuterClass{
	private int outerValue=100;
	private void printValue(){
		System.out.println(outerValue);
		
	}
	private static void outerStaticMethod(String info){
		System.out.println(info);
	}
	
	public void testInnerClass(){
		//�ⲿ����Է����ڲ����˽�г�Ա
		innerObject.innerClassField++;
		innerObject.innerClassMethod();
		innerObject.visit();

	}
	
	private InnerClass innerObject=new InnerClass();
	/**
	 * ��Ա�ڲ���
	 * @author JinXuLiang
	 *
	 */
	private class InnerClass{
		private int innerClassField=200;
		int a=100;
		public void visit(){
			outerValue=200;  //�����ⲿ���˽���ֶ�
			printValue();//�����ⲿ���˽��ʵ������
			//�����ⲿ���˽�о�̬����
			outerStaticMethod("From InnerClass Object");
		}
		private void innerClassMethod(){
			System.out.println("InnerClass.innerClassMethod");
		}
	}
}
