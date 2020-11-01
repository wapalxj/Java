package d14_thread;

import java.util.concurrent.*;

/**
 * Created by wapal on 2017/6/23.
 * 多线程 异步计算
 * 第1个线程：1加到100
 * 第2个线程：1加到200
 */
public class Demo20_callable2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool= Executors.newFixedThreadPool(2);
        Future<Integer> future1=pool.submit(new GetSumCallable(100));
        Future<Integer> future2=pool.submit(new GetSumCallable(200));
        System.out.println(future1.get());
        System.out.println(future2.get());
    }
    static class GetSumCallable implements Callable<Integer>{
        private int a;
        //call()不能传参，通过构造器传
        public GetSumCallable(int a){
            this.a=a;
        }
        @Override
        public Integer call() {
            int sum=0;
            for (int i = 0; i <= a; i++) {
                sum=sum+i;
            }
            return sum;
        }
    }
}
