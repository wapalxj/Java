package CC127_1TreeSet;
/*
 * Person在测试时实现Comparator接口
 */
public class Person {
	private final String name;
	private final int handsome;//帅气指数

	
	public Person() {
		name =null;
		handsome=0;
	}
	public Person(String name, int handson) {
		super();
		this.name = name;
		this.handsome = handson;
	}
	public String getName() {
		return name;
	}
	
	public int getHandsome() {
		return handsome;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", handsome=" + handsome + "]\n";
	}
	
	
}
