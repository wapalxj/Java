package CC179_HM3_deadlock;

/**
 * Created by Administrator on 2016/6/10.
 */
public class D01_Dead {
    public static final Object LOCK1=new Object();
    public static final Object LOCK2=new Object();

    public static void main(String[] args) {
        MyDeadLock d1=new MyDeadLock(true);
        MyDeadLock d2=new MyDeadLock(false);
        d1.start();
        d2.start();
    }
}
