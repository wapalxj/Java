package c48_abstract;

/**
 * Created by Administrator on 2016/5/6.
 */
public class Test_super {
    public static void main(String[] args) {
//        new Person();//错误
        new Student();
    }
}

abstract class Person{
    public Person(){
        System.out.println("ppppppp");
    }
}

class Student extends Person{
    public Student(){
//        super();//和普通类一样，抽象类也要被实例化，此行有没有都一样,当父类有带参构造的时候，也需要显示调用
    }
}