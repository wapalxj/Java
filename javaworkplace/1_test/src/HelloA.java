/**
 * Created by Administrator on 2016/3/13.
 */
public class HelloA {

    public static void main(String[] args) {
//        new HelloA();
        System.out.println("--------------");
        new HelloB();
    }

    public HelloA() {

    }

    {
        System.out.println("static A1");
    }
    static {
        System.out.println("static A2");
    }
}

class HelloB extends HelloA{
    public HelloB() {

    }
    static {
        System.out.println("static B");
    }
}

// class HelloB extends HelloA {
//    public HelloB() {
//
//    }
//
//    {
//        System.out.println("I’m B class");
//    }
//    static {
//        System.out.println("static B");
//    }
//
//    public static void main(String[] args) {
//        new HelloB();
//    }
//}
//
//class HelloA{
//    public HelloA() { }
//    {
//        System.out.println("I’m A class");
//    }
//    static {
//        System.out.println("static A");
//    }
//}