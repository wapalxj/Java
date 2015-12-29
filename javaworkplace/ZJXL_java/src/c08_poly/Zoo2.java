package c08_poly;



public class Zoo2 {

    public static void main(String args[]) {
        Feeder2 f = new Feeder2("С��");
        Animal[] ans = new Animal[16];

        //����ԱС��ι��һֻʨ��
        ans[0] = new Lion2();
        //����ԱС��ι��ʮֻ����
        for (int i = 0; i < 10; i++) {
            ans[1 + i] = new Monkey2();
        }
        //����ԱС��ι��5ֻ����
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
        System.out.println("�Ҳ�����˭�ҳ��⣡");
    }
}

class Monkey2 extends Animal {

    public void eat() {
        System.out.println("��ʲô���ԣ�����ϲ���㽶��");
    }
}

class Pigeon2 extends Animal {

    public void eat() {
        System.out.println("��Ҫ���ʣ�����ÿ��ֻ��һ����ס�");
    }
}

