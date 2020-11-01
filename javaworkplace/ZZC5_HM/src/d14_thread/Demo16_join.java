package d14_thread;

/**
 * Created by wapal on 2017/6/22.
 */
public class Demo16_join {
    public static void main(String[] args) throws InterruptedException {
        Demo d=new Demo();
        Thread t1=new Thread(d);
        Thread t2=new Thread(d);
        t1.start();
//        t1.join();//t1 执行，直到t1执行完才继续往下走
        t2.start();
        t1.join();//t1 t2交替执行，直到t1执行完才继续往下走
        for (int i = 0; i <=50; i++) {
            System.out.println("main---->"+i);
        }
        System.out.println("over");
    }

    static class Demo implements Runnable{

        @Override
        public void run() {
            for (int x = 0; x <=40; x++) {
                System.out.println(Thread.currentThread().getName()+"---->"+x);
                Thread.yield();//临时暂停
            }
        }
    }
}
