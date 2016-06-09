package exam2;

/**
 * Created by Administrator on 2016/5/6.
 */
public class Test {
    public static void main(String[] args) {
        Animal bird=new Bird("小鸟");
        Animal tiger=new Tiger("大老虎");
        System.out.println(bird.getName()+":"+bird.getDescription());
        System.out.println(tiger.getName()+":"+tiger.getDescription());
        bird.move();
        tiger.move();
    }
}
