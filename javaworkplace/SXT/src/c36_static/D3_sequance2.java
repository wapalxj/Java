package c36_static;

/**
 * Created by wapal on 2017/7/10.
 * 执行顺序2
 */
public class D3_sequance2 {
    public static void main(String[] args) throws InterruptedException {
//        new AA();
        BB b=new BB();
        b=null;
        System.gc();
        Thread.sleep(1000*5);
    }
}

class AA{
    int a=8;
    {
        printA();
    }

    public AA(){
        printA();
    }
    public void printA(){
        System.out.println(a);
    }
}

class BB extends AA{
    int a=6;
    {
        printA();
    }
    public BB(){
        printA();
    }
    public void printA(){
        System.out.println(a);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("被回收了");
        super.finalize();
    }
}