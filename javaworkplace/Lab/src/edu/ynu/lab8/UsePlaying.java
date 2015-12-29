package edu.ynu.lab8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsePlaying {

	public static void main(String[] args) {
		
		List<Person> persons =new ArrayList<Person>();
		persons.add(new Child());
		persons.add(new Actor());
		persons.add(new Musician());
		persons.add(new Student());
		
		
		Iterator<Person> it =persons.iterator();
		while (it.hasNext()) {
			Person person =it.next();
			person.say();
			System.out.print(" and ");
			person.play();
			
		}
		System.out.print("#####ÄÂ¹ðº£ 20121120138##########");
	}

}
