package c38_inher;

/**
 * Created by Administrator on 2016/3/2.
 */
public class Test2 {
    public static void main(String[] args) {
        Parent p=new Parent("parent",20);
        p.say();
        Child c=new Child("child2",5);
        c.say();
    }

}

class Parent{
      private String name;
      private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println(this.name+"-------->"+this.age);
    }
}

class Child extends Parent{

    public Child(String name, int age) {
        super(name, age);
    }
}