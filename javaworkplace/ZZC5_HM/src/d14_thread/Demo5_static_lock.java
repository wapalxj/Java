package d14_thread;

/**
 * Created by wapal on 2017/6/19.
 */
public class Demo5_static_lock {
    public static void main(String[] args) throws InterruptedException {
        Tickets t=new Tickets();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.start();
        Thread.sleep(10);
        t.flag=false;//切换标记
        t2.start();
    }

    static class Tickets implements Runnable{
        private static int tickets=30;
        private Object obj=new Object();
        boolean flag=true;
        @Override
        public void run() {
            if (flag){
                //让线程1一直在同步块执行
                while (true){
                    synchronized (Tickets.class){
                        if (tickets>0){
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread().getName()+"=obj="+tickets--);
                        }
                    }
                }
            }else {
                //让线程2一直在同步函数执行
                while (true){
                    this.sale();
                }
            }

        }
        private static synchronized void sale(){
            if (tickets>0){
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"=sale()="+tickets--);
            }
        }
    }
}


