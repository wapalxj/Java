package c64_boxing_Charp4;

/**
 * Created by wapal on 2017/6/25.
 */
public class Test2 {
    public static void main(String[] args) {
        //自动装箱
        Integer i=4;//原理：i=Integer.valueOf(4);
        System.out.println(i);
        //自动拆箱
        i=i+6;//先将i对象转化成基本数值 i.intValue()+5;运算之后，再装箱
        System.out.println(i);

        //new Integer(200)
        System.out.println("-----new Integer(100)------");
        Integer x=new Integer(100);
        Integer y=new Integer(100);
        System.out.println(x==y);
        System.out.println(x.equals(y));
        //200
        x=200;
        y=200;
        System.out.println("-----200-------------");
        System.out.println(x==y);
        System.out.println(x.equals(y));
        //127
        x=127;
        y=127;
        System.out.println("-----127-------------");
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}
