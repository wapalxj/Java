package C11_innerclass;

/*
 * �ڲ���2����̬�ڲ���
 */
public class StaticInnerClassTest {
	
	public static void main(String[] args) {
		TopClass.NestedClass.visit();
	}
}

class TopClass{
	
	private static void func(){
		System.out.println("TopClass.func");
	}
	private static int topClassValue=100;
	//��̬�ڲ���
	
	static class NestedClass{
	
		public static  void visit(){
			//�����ⲿ��ľ�̬����
			func();
			//��ȡ�ⲿ��ľ�̬�ֶ�
			System.out.println(topClassValue);
		}
	}
}
