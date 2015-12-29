package C12_OOPTech;
/*
 * ����Ƚ���ҵ
 */
import java.util.Arrays;
import java.util.Comparator;

import javax.print.attribute.standard.Sides;

public class zWorkOfComprare {
	public static void main(String[] args) {
		Student [] students =new Student[4];
		students[0]= new Student("vnix0", 18);
		students[1]= new Student("vnix1", 15);
		students[2]= new Student("vnix2", 19);
		students[3]= new Student("vnix3", 28);
		
		System.out.println(check("vnix2", students));//����
		
		Arrays.sort(students, new upAgeComparator());//����
		
		for (Student student : students) {
			System.out.println(student.getName()+" :"+student.getAge());
		}
		System.out.println("#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Arrays.sort(students, new downAgeComparator());//����
		for (Student student : students) {
			System.out.println(student.getName()+" :"+student.getAge());
		}
		
		System.out.println("#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("#�����ڲ���Ľ���");
		Arrays.sort(students,new Comparator<Student>(){
		   	@Override
			public int compare(Student s1, Student s2) {
				Integer sage1 =s1.getAge();
				Integer sage2 =s2.getAge();
			            return sage2.compareTo(sage1);
			 
			}});//����
		
		for (Student student : students) {
			System.out.println(student.getName()+" :"+student.getAge());
		}
	}
	
	//����
	public static String check(String name,Student...students) {
		Student stu;
		for (int i = 0; i < students.length; i++) {
			if (name==students[i].getName()) {
				stu=students[i];
				return stu.getName()+":"+stu.getAge();
			}
		}
		
		return null;
	}
}

class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
//����
class upAgeComparator implements Comparator<Student> {
   	@Override
	public int compare(Student s1, Student s2) {
		Integer sage1 =s1.getAge();
		Integer sage2 =s2.getAge();
		return sage1.compareTo(sage2);
	    
	}
}
//����
class downAgeComparator implements Comparator<Student> {
   	@Override
	public int compare(Student s1, Student s2) {
		Integer sage1 =s1.getAge();
		Integer sage2 =s2.getAge();
	            return sage2.compareTo(sage1);
	    
	}
}