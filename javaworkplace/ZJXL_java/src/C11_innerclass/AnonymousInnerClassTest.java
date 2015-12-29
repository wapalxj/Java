package C11_innerclass;


public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		AnonymousInnerClassTest obj=new AnonymousInnerClassTest();
		//ʹ�������ڲ����﷨����MyInterface�ӿڶ���
		obj.ShowAnonymousInnerClassUsage(new MyInterface(){
			@Override
			public void func() {
				System.out.println("�����ڲ���ķ���ִ��");
			
			}
		
		});
		//�����ڲ�������ⲿ����ֶ�
		obj.InnerVisitOuterField();
		

	}
	
	public int outerField=100;
	public void ShowAnonymousInnerClassUsage(MyInterface obj){
		obj.func();
	}
	
	/**
	 * ��ʾ�����ڲ�������ⲿ����ֶ�
	 */
	public void InnerVisitOuterField(){
		MyInterface mi=new MyInterface(){

			@Override
			public void func() {
				//�����ⲿ����ֶ�
				AnonymousInnerClassTest.this.outerField++;
				System.out.println(outerField);
			}
			
		};
		mi.func();
	}

}

interface MyInterface{
	void func();
}


