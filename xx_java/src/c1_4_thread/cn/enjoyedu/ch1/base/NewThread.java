package c1_4_thread.cn.enjoyedu.ch1.base;

import java.util.concurrent.ExecutionException;

/**
 * 类说明：新启线程的方式
 */
public class NewThread {
    /*扩展自Thread类*/
    private static class UseThread extends Thread {
        @Override
        public void run() {
            super.run();
            // do my work;
			System.out.println("I am extendec Thread");
//            try {
//                for (; ; ) {
//                    System.out.println("I am extendec Thread");
//                }
//            } catch (Throwable ex) {
//                System.out.println("Caught in run: " + ex);
//                ex.printStackTrace();
//            }
        }
    }


    /*实现Runnable接口*/
    private static class UseRunnable implements Runnable {

        @Override
        public void run() {
            // do my work;
            System.out.println("I am implements Runnable");
        }
    }


    public static void main(String[] args)
            throws InterruptedException, ExecutionException {
        UseThread useThread = new UseThread();
        useThread.start();
//		useThread.start();

        UseRunnable useRunnable = new UseRunnable();
        new Thread(useRunnable).start();
        Thread.sleep(100);
//        useThread.stop();
    }
}
