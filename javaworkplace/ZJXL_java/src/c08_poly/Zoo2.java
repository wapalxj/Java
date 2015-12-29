package c08_poly;



public class Zoo2 {

    public static void main(String args[]) {
        Feeder2 f = new Feeder2("小李");
        Animal[] ans = new Animal[16];

        //饲养员小李喂养一只狮子
        ans[0] = new Lion2();
        //饲养员小李喂养十只猴子
        for (int i = 0; i < 10; i++) {
            ans[1 + i] = new Monkey2();
        }
        //饲养员小李喂养5只鸽子
        for (int i = 0; i < 5; i++) {
            ans[11 + i] = new Pigeon2();
        }

        f.feedAnimals(ans);
    }
}

class Feeder2 {

    public String name;

    Feeder2(String name) {
        this.name = name;
    }

    public void feedAnimals(Animal[] ans) {
        for (Animal an : ans) {
            an.eat();
        }
    }
}

abstract class Animal {

    public abstract void eat();
}

class Lion2 extends Animal {

    public void eat() {
        System.out.println("我不吃肉谁敢吃肉！");
    }
}

class Monkey2 extends Animal {

    public void eat() {
        System.out.println("我什么都吃，尤其喜欢香蕉。");
    }
}

class Pigeon2 extends Animal {

    public void eat() {
        System.out.println("我要减肥，所以每天只吃一点大米。");
    }
}

