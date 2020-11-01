package d14_thread;

/**
 * Created by wapal on 2017/6/21.
 * 线程的结束与interrupt
 */
public class Demo15_interruput {


    public static void main(String[] args) {
        Demo d=new Demo();
        Thread t1 =new Thread(d);
        Thread t2 =new Thread(d);
        t1.start();
        t2.start();
        int x=0;

        while (true){
            if (++x==50){
//                d.changeFlag();//处于wait的线程无法通过这里结束
                t1.interrupt();//强制清除中断状态，恢复到运行状态
                t2.interrupt();//强制清除中断状态，恢复到运行状态

                break;
            }
            System.out.println("main------"+x);
        }
        System.out.println("over");
    }

    static class Demo implements Runnable{
        private boolean flag=true;
        @Override
        public synchronized void run() {
            while (flag){
                try{
                    wait();
                }catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+"----"+e.toString());
                    e.printStackTrace();
                    changeFlag();//修改flag
                }
                System.out.println(Thread.currentThread().getName()+"----");
            }
        }

        public void changeFlag(){
            flag=false;
        }
    }
}
