package c38_inher;


import c37.C37;

/**
 * Created by Administrator on 2016/8/31.
 * 1.对象可以调用static
 * 2.包外可以访问包内的static成员
 * 3.可以访问其他类的main方法
 */
public class TestPrivate {
    public static void main(String[] args) {
        System.out.println(C37.a);
        C37.main(null);
        C c=new C();
        c.say();
        c.sttt();
    }
}

class P {
    static void sttt(){
        System.out.println("static");
    }
    public void say(){
        System.out.println("P---say()");
    }
}

class C extends P{

    @Override
    public void say() {
        super.say();
//        System.out.println("C---say()");
    }
}

