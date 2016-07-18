package CC179_HM3_deadlock;

/**
 * 死锁
 * Created by Administrator on 2016/6/10.
 */
public class MyDeadLock extends Thread{
    boolean flag;

    public MyDeadLock(boolean flag){
        this.flag=flag;
    }

    @Override
    public void run() {
       try {



           if (flag){
               synchronized(D01_Dead.LOCK1){
                   System.out.println("if---拿到锁1--->我在等待锁2");
                   Thread.sleep(500);
                   synchronized(D01_Dead.LOCK2){
                       System.out.println("if---锁2");
                   }
               }
           }else {
               synchronized(D01_Dead.LOCK2){
                   System.out.println("else---拿到锁2--->我在等待锁1");
                   Thread.sleep(500);
                   synchronized(D01_Dead.LOCK1){
                       System.out.println("else---锁1");
                   }
               }
           }



       }catch (Throwable ex){

       }
    }
}
