package C14_class_P323_case;

public class Pet {
	private String name;
	public Pet() {}
	public Pet(String name) {this.name=name;}
}

class Dog extends Pet {
	public Dog() {}
	public Dog(String name) {super(name);}
}

class Mutt extends Dog {
	public Mutt() {}
	public Mutt(String name) {super(name);}
}
class Pug extends Dog {
	public Pug() {}
	public Pug(String name) {super(name);}
}

class Cat extends Pet {
	public Cat() {}
	public Cat(String name) {super(name);}
}
class EgyptianMau extends Cat {
	public EgyptianMau() {}
	public EgyptianMau(String name) {super(name);}
}
class Manx extends Cat {
	public Manx() {}
	public Manx(String name) {super(name);}
}

class Cymric extends Manx {
	public Cymric() {}
	public Cymric(String name) {super(name);}
}

class Rodent extends Pet {
	public Rodent() {}
	public Rodent(String name) {super(name);}
}

class Rat extends Rodent {
	public Rat() {}
	public Rat(String name) {super(name);}
}

class Mouse extends Rodent {
	public Mouse() {}
	public Mouse(String name) {super(name);}
}

class Hamster extends Rodent {
	public Hamster() {}
	public Hamster(String name) {super(name);}
}