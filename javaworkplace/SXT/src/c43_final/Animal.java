package c43_final;

public class Animal {

	public /*final*/ void run()//�����Ա���д
	{
		System.out.println("��ѽ��");
	}
	
}
 class Bird extends Animal{

	public void run()
	{
		super.run();//Ҳ���Ե��ø����run
		System.out.println("��ѽ��");//��д
	}
	
	
}