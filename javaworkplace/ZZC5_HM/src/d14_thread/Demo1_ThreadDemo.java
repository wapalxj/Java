package d14_thread;

/**
 * Created by wapal on 2017/6/17.
 * 创建线程的第一种方式
 *
 * 异常提示信息包含有线程信息
 */
public class Demo1_ThreadDemo {
    public static void main(String[] args) {
        Demo d1=new Demo("vero");
        Demo d2=new Demo("vnix");
        System.out.println(Thread.currentThread().getName());

        System.out.println(d1.getName());
        System.out.println(d2.getName());
        d1.start();
        d2.run();
    }
}

class Demo extends Thread{
    private String name;
    public Demo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        int []arr=new int[3];
//        arr[4]=1;
        for (int i = 0; i < 20; i++) {
            System.out.println("name="+name+"......");
        }
    }
}
