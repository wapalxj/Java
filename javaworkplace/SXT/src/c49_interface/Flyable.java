package c49_interface;

public interface Flyable {//�ӿ�1
	int MAX_SPEED=10000;
	int MIN_HIGHT=1;
	void fly();//����public abstract
}

interface Attack{//�ӿ�2
	void attack();	
}


class Plane implements Flyable{
	public void fly ()
	{
		System.out.println("�ɻ��з�����");
	}
}

class Man implements Flyable{
	public void fly ()
	{
		System.out.println("����������");
	}
}
class Stone implements Flyable,Attack{
	int weight;
	public void fly ()
	{
		System.out.println("���ӳ�ȥ");
	}
	public void attack () {
		System.out.println("��!!!");
	}
}