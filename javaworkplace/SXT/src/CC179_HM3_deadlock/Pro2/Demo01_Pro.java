package CC179_HM3_deadlock.Pro2;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者消费者模式
 * Created by Administrator on 2016/6/10.
 */
public class Demo01_Pro {
    public static void main(String[] args) {
        //共享数据对象
        List<Food> foods=new ArrayList<>();
        Thread t1=new Thread(new ProRunnable(foods));
        Thread t2=new Thread(new ClientRunnable(foods));
        t1.start();
        t2.start();
    }
}
