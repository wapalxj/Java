package d14_thread;

/**
 * Created by wapal on 2017/6/20.
 *问题产生
 */
public class Demo8_producer_consumer {
    public static void main(String[] args) {
        //1.创建资源
        Resource resource=new Resource();
        //2.创建线程任务
        Producer p=new Producer(resource);
        Consumer c=new Consumer(resource);
        //3.创建线程
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
    }

    //1.资源
    //属性：商品名称和编号
    //行为：对商品名称赋值，获取商品
    static class Resource {
        private String name;
        private int count=1;

        //1.提供设置的方法
        public void set(String name){
            this.name=name+count;
            count++;
            System.out.println(Thread.currentThread().getName()+".......生产者..."+this.name);
        }

        public void out(){
            System.out.println(Thread.currentThread().getName()+".消费者..."+this.name);
        }


    }

    //2.生产者
    static class Producer implements Runnable{
        Resource r;
        Producer(Resource r){
            this.r=r;
        }

        @Override
        public void run() {
            while (true){
                r.set("面包");
            }

        }
    }
    //3.消费者
    static class Consumer implements Runnable{
        Resource r;
        Consumer(Resource r){
            this.r=r;
        }

        @Override
        public void run() {
            while (true){
                r.out();
            }
        }
    }
}

