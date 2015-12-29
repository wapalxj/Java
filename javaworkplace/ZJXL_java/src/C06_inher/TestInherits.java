package C06_inher;

/**
 * 继承：基类与子类间构造方法的调用
 * @author Administrator
 *
 */
class Grandparent {

    public Grandparent() {
        System.out.println("GrandParent Created.");
    }

    public Grandparent(String string) {
        System.out.println("GrandParent Created.String:" + string);
    }
}

class Parent extends Grandparent {

    public Parent() {
        super("Hello.Grandparent.");
        System.out.println("Parent Created");
        //super("Hello.Grandparent.");//通过super调用基类的构造方法，必须是第一句
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("Child Created");
    }
}

public class TestInherits {

    public static void main(String args[]) {
        Child c = new Child();
        
    }
}

