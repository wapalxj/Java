package CC127_2TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import CC127_1TreeSet.Worker;

public class TreeMapDemo02 {

	public static void main(String[] args) {
		Worker w1 =new Worker("��������վ",12000);
		Worker w2 =new Worker("ũ��",8000);
		Worker w3 =new Worker("����Գ",5000);
		
		Map<Worker,String> employee =new TreeMap<>();
		employee.put(w1,"vvv");
		employee.put(w2,"vvv");
		employee.put(w3,"vvv");
		
		System.out.println(employee.keySet());

	}

}
