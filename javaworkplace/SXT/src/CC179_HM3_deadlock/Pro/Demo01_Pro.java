package CC179_HM3_deadlock.Pro;

/**
 * 生产者消费者模式
 * Created by Administrator on 2016/6/10.
 */
public class Demo01_Pro {
    public static void main(String[] args) {
        //共享数据对象
        Person person=new Person("vero",20);
        Thread t1=new Thread(new ProRunnable(person));
        Thread t2=new Thread(new ClientRunnable(person));
        t1.start();
        t2.start();
    }
}
