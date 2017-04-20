package C14_class;

public class P318_ex2_ToyTest {
	public static void main(String[] args) {
		ToyTest2.main(args);
	}
}

interface HasBatteries2 {}
interface Waterproof2 {}
interface Shoots2 {}
interface newInterface {}

class Toy2{
	public Toy2() {}
	public Toy2(int i) {}
}

class FancyToy2 extends Toy2 implements HasBatteries2,Waterproof2,Shoots2,newInterface{
	public FancyToy2() {
		super(1);
	}
}

class ToyTest2{
	static void printInfo(Class cc){
		System.out.println(" Class name:"+cc.getName()+" is interface? ["+cc.isInterface()+"]");
		System.out.println(" Simple name:"+cc.getSimpleName());
		System.out.println(" Class name:"+cc.getName());
		System.out.println(" ----------------------");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class c=null;
		try {
			c=Class.forName("C14_class.FancyToy2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		printInfo(c);
		
		for (Class face:c.getInterfaces()) {
			printInfo(face);
		}
		
		Class up=c.getSuperclass();
		Object obj=null;
		try {
			obj=up.newInstance();//此方法需要up对象的类具有默认构造器
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		printInfo(obj.getClass());
	}
}

