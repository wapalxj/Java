package CC13_DS;


import java.util.ArrayList;
import java.util.List;


public class ArrayList0 {
	public static void main(String[] args) {
		List<Student> students =new ArrayList<>();
		students.add(new Student("vero", "790631", "ÄÐ", 18, "½¡¿µ"));
		students.add(new Student("vnix", "790632", "Å®", 20, "½¡¿µ"));
		students.add(new Student("wnix", "790632", "Å®", 22, "½¡¿µ"));
		students.remove(1);
		students.set(1, new Student("vvvvv", "790633", "ÄÐ", 21, "½¡¿µ"));
		System.out.println(students.get(1).getName());
		
	}
}
class Student{
	String name;
	String ID;
	String gender;
	int age;
	String healt;
	
	public Student(String name, String iD, String gender, int age, String healt) {
		super();
		this.name = name;
		ID = iD;
		this.gender = gender;
		this.age = age;
		this.healt = healt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHealt() {
		return healt;
	}
	public void setHealt(String healt) {
		this.healt = healt;
	}
	
}