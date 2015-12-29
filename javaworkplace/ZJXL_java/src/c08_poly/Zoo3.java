package c08_poly;

import java.util.Vector;

public class Zoo3 {

    public static void main(String args[]) {
        Feeder3 f = new Feeder3("С��");
        Vector<Animal3> ans = new Vector<Animal3>();

        //����ԱС��ι��һֻʨ��
        ans.add(new Lion3());
        //����ԱС��ι��ʮֻ����
        for (int i = 0; i < 10; i++) {
            ans.add(new Monkey3());
        }
        //����ԱС��ι��5ֻ����
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
        System.out.println("�Ҳ�����˭�ҳ��⣡");
    }
}

class Monkey3 extends Animal3 {

    public void eat() {
        System.out.println("��ʲô���ԣ�����ϲ���㽶��");
    }
}

class Pigeon3 extends Animal3 {

    public void eat() {
        System.out.println("��Ҫ���ʣ�����ÿ��ֻ��һ����ס�");
    }
}
