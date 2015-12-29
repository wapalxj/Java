package C06_inher;

public class ExplorationJDKSource {

	public static void main(String[] args) {
		//通过进行反编译以及查看println源码，可知println实际调用的是Object
		System.out.println(new A());

	}

}
class A{}