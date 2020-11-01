package android.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //单线程池
//        ExecutorService es = Executors.newSingleThreadExecutor();

        //固定数量线程池
//        ExecutorService es = Executors.newFixedThreadPool(2);

        //
//        ExecutorService es = Executors.newCachedThreadPool();

        ExecutorService es = Executors.newScheduledThreadPool(2);


        for (int i = 0; i < 100; i++) {
            MyThread task = new MyThread();
            es.execute(task);
        }
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("thread--task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}