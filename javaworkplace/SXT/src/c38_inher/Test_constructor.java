package c38_inher;

/**
 * Created by Administrator on 2016/5/6.
 */
public class Test_constructor {
}

class Person{
    public Person(String name){

    }
}

class Student extends Person{
    public Student(){
        super("xxx");//父类没有空构造时，必须显示调用父类构造,注释此行则编译报错
    }
}