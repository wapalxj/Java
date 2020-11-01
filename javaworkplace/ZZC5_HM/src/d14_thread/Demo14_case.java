package d14_thread;

/**
 * Created by wapal on 2017/6/21.
 * 线程安全，人妖的出现
 */
public class Demo14_case {
   private static Object obj=new Object();
   static class Resource{
        String name;
        String sex;
    }

   static class Input implements Runnable{
        private Resource r;

        public Input(Resource resource){
            this.r=resource;
        }
        @Override
        public void run() {
            int x=0;
            while (true){
                synchronized (obj){
                    if (x==0){
                        r.name="张飞";
                        //Input所在线程在这里暂停,Output所在线程执行
                        //出现 张飞--女
                        r.sex="男";
                    }else {
                        r.name="rose";
                        r.sex="女女女女女";
                    }
                }
                x=(x+1)%2;//切换
            }
        }

    }
   static class Output implements Runnable{
        private Resource r;
        public Output(Resource resource){
            this.r=resource;
        }

       @Override
       public void run() {
            while (true){
                synchronized (obj){
                    System.out.println(r.name + "---" + r.sex);
                }
            }

       }
   }

    public static void main(String[] args) {
        Resource r=new Resource();
        Thread t1=new Thread(new Input(r));
        Thread t2=new Thread(new Output(r));
        t1.start();
        t2.start();
    }

}
