package CC127_2TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import CC127_1TreeSet.Person;

public class TreeMapDemo {

	public static void main(String[] args) {
		Person p1 =new Person("vero",100);
		Person p2 =new Person("vnix",1000);
		Person p3 =new Person("Alicc",1200);
		Person p4 =new Person("me",50);

		Map<Person,String> map =new TreeMap<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getHandsome()-o2.getHandsome();
			}
			
		});
		map.put(p1, "vvv");
		map.put(p2, "vvv");
		map.put(p3, "vvv");
		map.put(p4, "vvv");
		
		Set<Person> persons=map.keySet();
		System.out.println(persons);
	}

}
