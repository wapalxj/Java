package c08_poly;

import java.util.Vector;

public class Zoo3 {

    public static void main(String args[]) {
        Feeder3 f = new Feeder3("小李");
        Vector<Animal3> ans = new Vector<Animal3>();

        //饲养员小李喂养一只狮子
        ans.add(new Lion3());
        //饲养员小李喂养十只猴子
        for (int i = 0; i < 10; i++) {
            ans.add(new Monkey3());
        }
        //饲养员小李喂养5只鸽子
        for (int i = 0; i < 5; i++) {
            ans.add(new Pigeon3());
        }
        f.feedAnimals(ans);
    }
}

class Feeder3 {

    public String name;

    Feeder3(String name) {
        this.name = name;
    }

    public void feedAnimals(Vector<Animal3> ans) {
        for (Animal3 an : ans) {
            an.eat();
        }
    }
}

abstract class Animal3 {

    public abstract void eat();
}

class Lion3 extends Animal3 {

    public void eat() {
        System.out.println("我不吃肉谁敢吃肉！");
    }
}

class Monkey3 extends Animal3 {

    public void eat() {
        System.out.println("我什么都吃，尤其喜欢香蕉。");
    }
}

class Pigeon3 extends Animal3 {

    public void eat() {
        System.out.println("我要减肥，所以每天只吃一点大米。");
    }
}
