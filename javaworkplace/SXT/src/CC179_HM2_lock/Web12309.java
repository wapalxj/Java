package CC179_HM2_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock
 * Created by Administrator on 2016/6/10.
 */
public class Web12309 implements Runnable{
    private int num=10;
    private boolean flag=true;
    private Lock lock=new ReentrantLock();
    public void run(){
        while (flag) {
			test();
        }
    }

    //线程安全:lock
    public  void  test() {
        lock.lock();
            if (num<=0) {
                this.flag=false;
                return;
            }
            try {
                Thread.sleep(500);//增加延时：会导致结果可能不准确
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"抢到了"+num);
            num--;
        lock.unlock();
    }
}

