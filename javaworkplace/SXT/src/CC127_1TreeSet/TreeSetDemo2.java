package CC127_1TreeSet;

import java.util.Set;
import java.util.TreeSet;

/*
 * ʵ��Comparable�ӿڵĲ���
 */
public class TreeSetDemo2 {

	public static void main(String[] args) {
		Worker w1 =new Worker("��������վ",12000);
		Worker w2 =new Worker("ũ��",8000);
		Worker w3 =new Worker("����Գ",5000);
		
		Set<Worker> employee =new TreeSet<>();
		employee.add(w1);
		employee.add(w2);
		employee.add(w3);
		
		System.out.println(employee);

	}

}
