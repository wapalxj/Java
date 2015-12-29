package C12_OOPTech;

/*
 * 对象比较3
 */
import java.util.Arrays;
import java.util.Comparator;

class Person  {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   
}


class FirstNameComparator implements Comparator<Person> {
	   
	@Override
	public int compare(Person o1, Person o2) {
		 String lastName1 = o1.getLastName().toUpperCase();
	        String firstName1 = o1.getFirstName().toUpperCase();
	        String lastName2 = o2.getLastName().toUpperCase();
	        String firstName2 =o2.getFirstName().toUpperCase();
	        if (firstName1.equals(firstName2)) {
	            return lastName1.compareTo(lastName2);
	        } else {
	            return firstName1.compareTo(firstName2);
	        }
	}
}

class LastNameComparator implements Comparator<Person> {
   	@Override
	public int compare(Person o1, Person o2) {
		 String lastName1 = o1.getLastName().toUpperCase();
	        String firstName1 = o1.getFirstName().toUpperCase();
	        String lastName2 = o2.getLastName().toUpperCase();
	        String firstName2 = o2.getFirstName().toUpperCase();
	        if (lastName1.equals(lastName2)) {
	            return firstName1.compareTo(firstName2);
	        } else {
	            return lastName1.compareTo(lastName2);
	        }
	}
}
public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Person();
        persons[0].setFirstName("Elvis");
        persons[0].setLastName("Goodyear");
        persons[0].setAge(56);

        persons[1] = new Person();
        persons[1].setFirstName("Stanley");
        persons[1].setLastName("Clark");
        persons[1].setAge(8);

        persons[2] = new Person();
        persons[2].setFirstName("Jane");
        persons[2].setLastName("Graff");
        persons[2].setAge(16);

        persons[3] = new Person();
        persons[3].setFirstName("Nancy");
        persons[3].setLastName("Goodyear");
        persons[3].setAge(69);

        System.out.println("Natural Order");
        for (int i = 0; i < 4; i++) {
            Person person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + 
                    ". Age:" + age);
        }

        Arrays.sort(persons, new LastNameComparator());
        System.out.println();
        System.out.println("Sorted by last name");
        for (int i = 0; i < 4; i++) {
            Person person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + 
                    ". Age:" + age);
        }

        Arrays.sort(persons, new FirstNameComparator());
        System.out.println();
        System.out.println("Sorted by first name");
        for (int i = 0; i < 4; i++) {
            Person person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + 
                    ". Age:" + age);
        }

       
        
       
    }
}
