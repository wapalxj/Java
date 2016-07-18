package CC179_HM2_lock;

/**
 * Created by Administrator on 2016/6/10.
 */
public class T1_Lock {
    public static void main(String[] args) {
        Web12309 w=new Web12309();

        Thread p1=new Thread(w,"黄牛1");
        Thread p2=new Thread(w,"黄牛2");
        Thread p3=new Thread(w,"黄牛3");

        p1.start();
        p2.start();
        p3.start();
    }
}
