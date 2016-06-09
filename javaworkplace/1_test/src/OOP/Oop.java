package OOP;


import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 2016/6/5.
 */
public class Oop {

}

class Animal {
    public static void main(String[] args) {
        Animal a=new Person();
        a.eat();
    }
    public Animal(){
    }
    public Animal(String name){
        System.out.println("Animal");
    }

    public void run(){
        System.out.println("Animal");
    }
    private void eat(){
        System.out.println("Animal-eat");
    }
}

class Person extends Animal{
    public Person(){
    }
    public void eat(){
        System.out.println("Person-eat");
    }
}
