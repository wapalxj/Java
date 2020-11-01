package d14_thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wapal on 2017/6/20.
 * 使用lock改写demo10，但是效率还是低
 */
public class Demo11_lock {
    public static void main(String[] args) {
        //1.创建资源
        Resource resource = new Resource();
        //2.创建线程任务
        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);
        //3.创建线程
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(p);
        Thread t4 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    //1.资源
    //属性：商品名称和编号
    //行为：对商品名称赋值，获取商品
    static class Resource {
        private String name;
        private int count = 1;
        private boolean flag = false;//盘子里面有没有包子
        private Lock lock = new ReentrantLock();
        private Condition condition=lock.newCondition();

        //1.提供设置的方法
        public void set(String name) throws InterruptedException {
            //获取锁
            lock.lock();
            try {
                while (flag) {//等待
                    condition.await();
                }
                this.name = name + count;
                count++;
                System.out.println(Thread.currentThread().getName() + ".......生产者..." + this.name);
                //flag设置true
                flag = true;
                //唤醒消费者
                condition.signalAll();
            } finally {
                //释放锁
                lock.unlock();//一定要执行
            }
        }

        public  void out() throws InterruptedException {
            //获取锁
            lock.lock();
            try {
                while (!flag) {
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName() + ".消费者..." + this.name);
                //flag设置false
                flag = false;
                //唤醒生产者
                condition.signalAll();
            } finally {
                //释放锁
                lock.unlock();//一定要执行
            }
        }
    }

    //2.生产者
    static class Producer implements Runnable {
        Resource r;

        Producer(Resource r) {
            this.r = r;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    r.set("面包");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //3.消费者
    static class Consumer implements Runnable {
        Resource r;

        Consumer(Resource r) {
            this.r = r;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    r.out();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


