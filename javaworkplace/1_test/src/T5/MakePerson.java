package T5;

public class MakePerson {

	public static void main(String[] args) {
		Person p1=new Person("Ms.","jie","Peng  ","Meng",21,false);
		Person p2=new Person();
		
		p2.setTitle("Ms.");
		p2.setFirstname("jie");
		p2.setLastname("Peng     ");
		p2.setAge(21);
		p2.setSex(false);
		
		System.out.println("******p1:");
		System.out.println("Firstname: "+p1.getFirstname());
		System.out.println("Lastname: "+p1.getLastname());
		System.out.println("Nickname: "+p1.getNickname());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Sex: "+p1.getSex());
		System.out.println("standardName: "+p1.standardName());
		System.out.println("formalName: "+p1.formalName());
		System.out.println("casualName: "+p1.casualName()+"\n");
		
		System.out.println("******p2:");
		System.out.println("Firstname: "+p2.getFirstname());
		System.out.println("Lastname: "+p2.getLastname());
		System.out.println("Nickname: "+p2.getNickname());
		System.out.println("Age: "+p2.getAge());
		System.out.println("Sex: "+p2.getSex());
		System.out.println("standardName: "+p2.standardName());
		System.out.println("formalName: "+p2.formalName());
		System.out.println("casualName: "+p2.casualName()+"\n");
		System.out.println("20121120114 彭洁");

	}

}
