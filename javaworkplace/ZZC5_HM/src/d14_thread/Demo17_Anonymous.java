package d14_thread;

import java.util.concurrent.ExecutorService;

/**
 * Created by wapal on 2017/6/22.
 * 哪个被打印出来
 */
public class Demo17_Anonymous {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable.run");
            }
        }){
            @Override
            public void run() {
//                super.run();
                System.out.println("Thread.run");
            }
        }.start();


    }
}
