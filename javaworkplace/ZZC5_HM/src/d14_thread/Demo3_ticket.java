package d14_thread;

/**
 * Created by wapal on 2017/6/18.
 * 售票案例
 */
public class Demo3_ticket {
    public static void main(String[] args) {
        Tickets t=new Tickets();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        Thread t4=new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Tickets implements Runnable{
    private int tickets=20;
    private int t=20;
    private Object object=new Object();
    @Override
    public void run() {
        while (true){
            synchronized ((Integer)t){
                if (tickets>0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                System.out.println(Thread.currentThread().getName()+"--"+--tickets);
                    System.out.println(Thread.currentThread().getName()+"=="+tickets--);

//                System.out.print(tickets--);
//                //上面一行相当于下面两行
//                System.out.print(tickets);
//                //当几个线程提示在这里暂停时，出现打印相同的数字
//                --tickets;

                }
            }
        }
    }
}