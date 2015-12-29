package CC127_1TreeSet;

import java.util.Set;
import java.util.TreeSet;

/*
 * 实现Comparable接口的测试
 */
public class TreeSetDemo2 {

	public static void main(String[] args) {
		Worker w1 =new Worker("垃圾回收站",12000);
		Worker w2 =new Worker("农民工",8000);
		Worker w3 =new Worker("程序猿",5000);
		
		Set<Worker> employee =new TreeSet<>();
		employee.add(w1);
		employee.add(w2);
		employee.add(w3);
		
		System.out.println(employee);

	}

}
