package edu.ynu.lab6;

public class MakePerson {

	public static void main(String[] args) {
		Person p1=new Person("Mr.", "guihai", "Mu", "vero", 18, true);
		Person p2=new Person();
		
		p2.setTitle("Mr.");
		p2.setFirstname("guihai");
		p2.setLastname("Mu");
		p2.setAge(18);
		p2.setSex(true);
		
		System.out.println("#######ÄÂ¹ðº£  20121120138######");
		System.out.println("p1:");
		System.out.println("Firstname: "+p1.getFirstname());
		System.out.println("Lastname: "+p1.getLastname());
		System.out.println("Nickname: "+p1.getNickname());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Sex: "+p1.isSex());
		System.out.println("standardName: "+p1.standardName());
		System.out.println("formalName: "+p1.formalName());
		System.out.println("casualName: "+p1.casualName());

		System.out.println("#######ÄÂ¹ðº£ 20121120138######");
		System.out.println("p2:");
		System.out.println("Firstname: "+p2.getFirstname());
		System.out.println("Lastname: "+p2.getLastname());
		System.out.println("Nickname: "+p2.getNickname());
		System.out.println("Age: "+p2.getAge());
		System.out.println("Sex: "+p2.isSex());
		System.out.println("standardName: "+p2.standardName());
		System.out.println("formalName: "+p2.formalName());
		System.out.println("casualName: "+p2.casualName());
	}

}
