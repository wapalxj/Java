package c1_1_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public <T> T genericMethod(T... a) {
        return a[a.length / 2];
    }

    public static void main(String[] args) {
//        ArrayList<Fruit> fruits = new ArrayList<Apple>();
//        ArrayList<Fruit> fruits2 = new ArrayList<>();
//        fruits2.add(new Apple());


        Wrapper<Fruit> fruitWrapper=new Wrapper<>();
        fruitWrapper.set(new Fruit());
        fruitWrapper.set(new Apple());
        //错误,不能设置任何类型
//        Wrapper<? extends Fruit> fruitWrapper2=new Wrapper<>();
//        fruitWrapper2.set(new Fruit());
//        fruitWrapper2.set(new Apple());


        testUp(new Wrapper<Apple>());
        testUp(new Wrapper<Banana>());
        Wrapper<? extends Fruit> f1=new Wrapper<Apple>();
        Wrapper<? extends Fruit> f2=new Wrapper<Banana>();


        //离谱???
        Wrapper<? super Apple> appleWrapper=new Wrapper<>();
        appleWrapper.set(new Apple());
        appleWrapper.set(new HongFuShi());
        //错误？？？
//        appleWrapper.set(new Fruit());
    }

    /**
     * 通配符用来解决泛型没有多态的问题
     */

    static Wrapper<? extends Fruit> testUp(Wrapper<? extends Fruit> wrapper) {
        return new Wrapper<Apple>();
    }
    static Wrapper<? super Apple> testDown() {
        return new Wrapper<Fruit>();
    }

    /**
     * 不能extend 泛型类
     *
     * @param <T>
     */
//    static class Problem<T> extends Exception{
//
//    }

    /**
     * 方法入参和返回值没有多态
     */
//    static Wrapper<Fruit> test(Wrapper<Fruit> fruitWrapper) {
//        return (Wrapper<(Wrapper)>)(new Wrapper<Apple>());
//    }


    static class Apple extends Fruit {

    }
    static class HongFuShi extends Apple {

    }

    static class Banana extends Fruit {

    }

    static class Wrapper<T> {
        public void set(T t){

        }
    }

    //JVM会将泛型擦除为extends后的第一个类型,即ArrayList
    static class GenType<T extends ArrayList & Comparable> {
        public void set(T t){

        }
    }

    static class Fruit {

    }
}
