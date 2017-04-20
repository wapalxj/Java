package C15_genericity;

import com.sun.org.apache.regexp.internal.recompile;

public class P354_Holder3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder3<Automobile> h3=new Holder3<>(new Automobile());
//		h3.set("not a automobile");
//		h3.set(1000);
	}

}

class Holder3<T>{
	private T a;
	public Holder3(T a) {
		this.a=a;
	}
	public void set(T a) {
		this.a=a;
	}
	public T get() {
		return this.a;
	}
}