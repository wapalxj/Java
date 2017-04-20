package C11_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class P227_Ex11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();
		List<Pig> pigs = new LinkedList<>();
		Set<Cat> cats = new HashSet<>();

		for (int i = 0; i < 2; i++) {
			dogs.add(new Dog("dog" + (i + 1)));
			pigs.add(new Pig("pig" + (i + 1)));
			cats.add(new Cat("cat" + (i + 1)));
		}

		travel(dogs);
		travel(pigs);
		travel(cats);
	}

	//具有抽象意义的
	public static <T> void travel(Collection<T> collection) {
		Iterator<T> it = collection.iterator();
		while (it.hasNext()) {
			T t = it.next();
			System.out.println(t.toString());
		}
	}
}

class Animal {
	public String type;
	public String name;

	public Animal(String name) {
		type = "animal";
		this.name = name;
	}

	@Override
	public String toString() {
		return type + "---->" + name;
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
		this.type = "dog";
	}

	@Override
	public String toString() {
		return type + "---->" + name;
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
		this.type = "dog";
	}

	@Override
	public String toString() {
		return type + "---->" + name;
	}
}

class Pig extends Animal {
	public Pig(String name) {
		super(name);
		this.type = "pig";
	}

	@Override
	public String toString() {
		return type + "---->" + name;
	}
}