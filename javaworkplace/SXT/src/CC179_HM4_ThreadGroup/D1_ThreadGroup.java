package CC179_HM4_ThreadGroup;

/**
 * Created by Administrator on 2016/6/21.
 * 线程组
 */
public class D1_ThreadGroup {
    public static void main(String[] args) {
        ThreadGroup group1=new ThreadGroup("组1");
        //默认属于main线程组
        Thread thread1=new Thread("v1111");
        System.out.println(thread1);

        //将线程放入线程组
        Thread thread2=new Thread(group1,"v2222");
        System.out.println(thread2);

        System.out.println("thread2所在的组："+thread2.getThreadGroup().getName());
        System.out.println("thread2所在的组的父亲："+thread2.getThreadGroup().getParent().getName());
    }
}
