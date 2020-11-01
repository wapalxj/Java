package d14_thread;

/**
 * Created by wapal on 2017/6/18.
 */
public class Demo2_RunnableDemo {
    public static void main(String[] args) {
        Student run=new Student("ddd");
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        t1.start();
        t2.start();
    }
}


class Student implements Runnable{
    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("name="+Thread.currentThread().getName()
                    +"......"+i);
        }
    }
}