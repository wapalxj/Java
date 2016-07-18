package CC179_HM1_Dae;

/**
 * 守护线程
 * Created by Administrator on 2016/6/9.
 */
public class Daemon {


    public static void main(String[] args) throws InterruptedException {
        Thread t1=new MyThread("t11");
        Thread t2=new MyThread("t22");
        Thread t3=new MyThread("t33");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"------------------->"+i);
        }
    }

}

class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=0;;i++){
            System.out.println(Thread.currentThread().getName()+"------>"+i);
        }
    }
}
