package CC127_1TreeSet;
/*
 * 实现Comparator接口的测试
 */
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/*
 * 实现Comparator接口的测试
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		Person p1 =new Person("vero",100);
		Person p2 =new Person("vnix",1000);
		Person p3 =new Person("Alicc",1200);
		Person p4 =new Person("me",50);
		
		Set<Person> person =new TreeSet<Person>(
				new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						// TODO Auto-generated method stub
						return o1.getHandsome()-o2.getHandsome();
					}
					
				}
				);
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);

		System.out.println(person);
	}

}
