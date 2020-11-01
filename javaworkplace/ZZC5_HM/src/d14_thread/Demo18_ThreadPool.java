package d14_thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wapal on 2017/6/23.
 */
public class Demo18_ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool=Executors.newFixedThreadPool(2);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"-----"+i);
                }
            }
        };
        pool.submit(runnable);
        pool.submit(runnable);
        pool.submit(runnable);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
//        pool.shutdown();

    }
}
