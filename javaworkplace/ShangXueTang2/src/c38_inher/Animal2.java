package c38_inher;

import c37.This;

//�������
public class Animal2 {
	private String eyes="eyes";
	
	
	public void run()
	{
		System.out.println("��ѽ��");
	}
	public void eat()
	{
		System.out.println("�Գԣ�");
	}
	public void sleep()
	{
		System.out.println("zzzzz");
	}
	public void getEyes() {
		System.out.println("I have "+this.eyes);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird2 b2 =new Bird2();
		b2.run();
		b2.animal2.eat();
		b2.getEyes();
	}

}
 class Bird2 extends Animal2{
	 Animal2 animal2=new Animal2();
	 
	public Bird2 () {
		
	} 
	public void getEyes() {
		super.getEyes();
	}
	public void run()
	{
		animal2.run();//Ҳ���Ե��ø����run
		System.out.println("��ѽ��");//��д
	}
	
	public void eggSheng()
	{
		System.out.println("��������");
	}
}