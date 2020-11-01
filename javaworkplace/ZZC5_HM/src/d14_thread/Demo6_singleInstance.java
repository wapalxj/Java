package d14_thread;

/**
 * Created by wapal on 2017/6/19.
 */
public class Demo6_singleInstance {

    static class Demo implements Runnable{

        @Override
        public void run() {
            Single.getInstance();
            Single2.getInstance();
        }
    }
}


//饿汉式--->多线程并发没有问题
class Single{
    private static final Single s=new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }
}

//懒汉式--->多线程并发会出现问题
class Single2{
    private static Single2 s;
    private Single2(){}
    public static Single2 getInstance(){
        if (s==null){
            //多线程暂停在这里，出现问题
            s=new Single2();
        }
        return s;
    }
}
//懒汉式--->解决：低效率做法：public static synchronized Single3 getInstance()
//懒汉式--->解决：高效率做法:
class Single3{
    private static Single3 s;
    private Single3(){}
    public static Single3 getInstance(){
        if (s==null){
            synchronized(Single3.class){
                if (s==null){
                    s=new Single3();
                }
            }
        }
        return s;
    }
}

//这样子干相当于单线程了
class MyRun implements Runnable{
    @Override
    public synchronized void run() {
        while (true){

        }
    }
}