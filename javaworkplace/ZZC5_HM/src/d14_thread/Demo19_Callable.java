package d14_thread;

import java.util.concurrent.*;

/**
 * Created by wapal on 2017/6/23.
 * 实现多线程的第三种方式Callable
 */
public class Demo19_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool= Executors.newFixedThreadPool(2);
        Future<String> future=pool.submit(new MyCallable());
        String s=future.get();
        System.out.println(s);
    }
    static class MyCallable implements Callable<String>{
        @Override
        public String call() throws InterruptedException {
            String string="callable--call()";
            Thread.sleep(500);
            return string;
        }
    }
}
