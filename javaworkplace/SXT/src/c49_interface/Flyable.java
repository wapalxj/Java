package c49_interface;

public interface Flyable {//接口1
	int MAX_SPEED=10000;
	int MIN_HIGHT=1;
	void fly();//总是public abstract
}

interface Attack{//接口2
	void attack();	
}


class Plane implements Flyable{
	public void fly ()
	{
		System.out.println("飞机有发动机");
	}
}

class Man implements Flyable{
	public void fly ()
	{
		System.out.println("跳起来，飞");
	}
}
class Stone implements Flyable,Attack{
	int weight;
	public void fly ()
	{
		System.out.println("被扔出去");
	}
	public void attack () {
		System.out.println("扔!!!");
	}
}