package d14_thread;

/**
 * Created by wapal on 2017/6/20.
 */
public class Demo7_deadlock  {
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
        private  int tickets=90;
        private Object obj=new Object();
        boolean flag=true;
        @Override
        public void run() {
            if (flag){
                //让线程1一直在同步块执行
                while (true){
                    synchronized (obj){//obj锁中有this锁
                        sale();
                    }
                }
            }else {
                //让线程2一直在同步函数执行
                while (true){
                    this.sale();
                }
            }

        }
        private  synchronized void sale(){//this锁中有obj锁
            synchronized (obj){
                if (tickets>0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"=sale()="+tickets--);
                }
            }


            synchronized (obj){
                //线程1在这个地方,拿到obj锁
                synchronized (this){

                }
            }

            synchronized (this){
                //线程2在这个地方,拿到this锁
                synchronized (obj){

                }
            }

        }





    }
}


