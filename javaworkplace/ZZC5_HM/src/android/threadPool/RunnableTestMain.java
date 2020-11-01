package android.threadPool;

import java.util.concurrent.*;

//submit

public class RunnableTestMain {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
//        pool.execute(new RunnableTest("Task1"));

        Future future = pool.submit(new RunnableTest("Task2"));
        try {
            if (future.get() == null) {
                System.out.println("任务完成");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


class RunnableTest implements Runnable {
    private String taskBame;

    public RunnableTest(String taskBame) {
        this.taskBame = taskBame;
    }

    @Override
    public void run() {
        System.out.println("inside---" + taskBame);
        throw new RuntimeException("RuntimeException from inside" + taskBame);
    }
}

