package d14_thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wapal on 2017/6/21.
 *
 */
public class Demo14_case_3_lock {
    static class Resource{
        private String name;
        private String sex;
        boolean flag=false;
        private final Lock lock=new ReentrantLock();
        private Condition condition=lock.newCondition();
        public void set(String name,String sex){
            try {
                lock.lock();
                if (flag){
                    //因为只有一个线程调用此方法
                    //必须要表明wait所属的锁
                    condition.await();
                }
                this.name=name;
                //Input所在线程在这里暂停,Output所在线程执行
                //出现 张飞--女
                this.sex=sex;
                flag=true;
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
        public void out(){
            try {
                lock.lock();
                if (!flag){
                    try {
                        //因为只有一个线程调用此方法
                        //必须要表明wait所属的锁
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name + "---" + sex);
                flag=false;
                condition.signal();
            }finally {
                lock.unlock();
            }

        }
    }

    static class Input implements Runnable{
        private Resource r;
        public Input(Resource resource){
            this.r=resource;
        }
        @Override
        public void run() {
            int x=0;
            while (true){
                if (x==0){
                    r.set("张飞","男");
                }else {
                    r.set("rose","女女女女女");
                }
                x=(x+1)%2;//切换
            }
        }

    }
    static class Output implements Runnable{
        private final Resource r;
        public Output(Resource resource){
            this.r=resource;
        }

        @Override
        public void run() {
            while (true){
                r.out();
            }
        }
    }

    public static void main(String[] args) {
        Resource r=new Resource();
        Thread t1=new Thread(new Input(r));
        Thread t2=new Thread(new Output(r));
        t1.start();
        t2.start();


    }

}

