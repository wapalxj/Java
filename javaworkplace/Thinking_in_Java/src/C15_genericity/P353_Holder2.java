package C15_genericity;

import net.mindview.util.MapData;

public class P353_Holder2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder2 h2=new Holder2(new Automobile());
		Automobile a=(Automobile) h2.get();
		
		h2.set("not a automobile");
		String s=(String) h2.get();
		
		h2.set(1000);
		Integer x=(Integer) h2.get();
	}

	
}

class Holder2{
	private Object o;

	public Holder2(Object o) {
		super();
		this.o = o;
	}

	public Object get() {
		return o;
	}

	public void set(Object o) {
		this.o = o;
	}
	
}

class Automobile{}
