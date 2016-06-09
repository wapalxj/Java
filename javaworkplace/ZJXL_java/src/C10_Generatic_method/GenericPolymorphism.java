package C10_Generatic_method;
/**
 * 泛型：类似多态
 */
import java.util.ArrayList;
import java.util.List;

public class GenericPolymorphism {
	public static void main(String[] args) {
		//类似多态
		List<Number> nums=new ArrayList<Number>();
		nums.add(2);//Number是一个抽象类，所以这里添加的实际上是Number子类Integer的对象,可在本程序结果中看到
		nums.add(3.14);//Number是一个抽象类，所以这里添加的实际上是Number子类Double的对象,可在本程序结果中看到
		for (Number number : nums) {
			System.out.println(number.getClass().getName());
		}
		
		//实际不能形成多态
		List<Integer> ints =new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
//		List<Number> nums2 =ints;//错误，课件实际意义上的多态是不可行的
//		nums2.add(3.14);
	}
}
