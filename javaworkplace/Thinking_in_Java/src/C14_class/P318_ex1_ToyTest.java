package C14_class;

public class P318_ex1_ToyTest {
	public static void main(String[] args) {
		ToyTest.main(args);
	}
}

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy{
//	public Toy() {}
	public Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	public FancyToy() {
		super(1);
	}
}

class ToyTest{
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
			c=Class.forName("C14_class.FancyToy");
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
			obj=up.newInstance();//此方法需要uo对象的类具有默认构造器
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		printInfo(obj.getClass());
	}
}

