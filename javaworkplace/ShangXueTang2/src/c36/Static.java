package c36;

import c31.Computer;
//static:��������෽��
public class Static {
	String name;
	int id;
	static int age;
	
	public static void prints() {
		System.out.println(age);
//		this.id=2;��̬�ķ����ı�����״̬��
//		study();���󣬾�̬�ķ����в��ܵ��÷Ǿ�̬�������ֶ�
//		����˵����static��������ģ�������Ըı�static��״̬��
//		����static�����Ըı����״̬
	}

	public void sayHello(String sname) {
		prints();
		study();
		System.out.println(sname+": hello!");
	}
	
	public void study() {
		System.out.println("studying!");
	}
	

}
