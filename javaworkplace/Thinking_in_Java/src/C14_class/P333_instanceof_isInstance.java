package C14_class;

import net.mindview.util.Print;

public class P333_instanceof_isInstance {

	/**
	 * @param args
	 * 以instanceof
	 */
	public static void main(String[] args) {
		FamilyVsExtracType.text(new Base());
		FamilyVsExtracType.text(new Derived());
	}

}

class Base {}
class Derived extends Base{}

class FamilyVsExtracType{
	static void text(Object x){
		String name=x.getClass().getSimpleName();
		System.out.println("testing x of type"+x.getClass()+"-------------------------------");
		System.out.println(name+" instanceof Base---->"+(x instanceof Base));
		System.out.println(name+" instanceof Derived---->"+(x instanceof Derived));
		System.out.println("Base.class.isInstance("+name+")---->"+Base.class.isInstance(x));
		System.out.println("Derived.class.isInstance("+name+")---->"+Derived.class.isInstance(x));
		System.out.println(name+".getClass()==Base.class---->"+(x.getClass()==Base.class));
		System.out.println(name+".getClass()==Derived.class---->"+(x.getClass()==Derived.class));
		System.out.println(name+".getClass().equasl(Base.class)---->"+(x.getClass().equals(Base.class)));
		System.out.println(name+".getClass().equasl(Derived.class)---->"+(x.getClass().equals(Derived.class)));
	}
}