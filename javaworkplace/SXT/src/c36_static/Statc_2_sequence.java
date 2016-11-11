package c36_static;

/**
 * Created by Administrator on 2016/9/5.
 * 继承关系中的非静态成员，静态成员，非静态块，静态块的初始化顺序
 */
public class Statc_2_sequence {
    public static void main(String[] args) {
        B b=new B();
//        B b2=new B();
    }
}

class A {
    private static int a=sayStatic();
    private  int aa=sayNonStatic();
    static {
        System.out.println("A----Static块()");
    }

    {
        System.out.println("A----块()");
    }

    public static int sayStatic(){
        System.out.println("A----Static属性()");
        return 1;
    }

    public static int sayNonStatic(){
        System.out.println("A----NonStatic属性()");
        return 1;
    }
    public A(){
        System.out.println("A--构造器");
    }

}

class B extends A{
    private static int b=sayStatic();
    private  int bb=sayNonStatic();
    static {
        System.out.println("B----Static块()");
    }

    {
        System.out.println("B----块()");
    }

    public static int sayStatic(){
        System.out.println("B----Static属性()");
        return 2;
    }
    public static int sayNonStatic(){
        System.out.println("B----NonStatic属性()");
        return 1;
    }

    public B(){
        System.out.println("B--构造器");
    }
}
