package c38_inher;

public class Bird extends Animal{

	public void run()
	{
		super.run();//Ҳ���Ե��ø����run
		System.out.println("��ѽ��");//��д
	}
	
	public void eggSheng()
	{
		System.out.println("��������");
	}
}
