package c1_4_thread.cn.enjoyedu.ch1.threadlocal;

import c1_4_thread.cn.enjoyedu.tools.SleepTools;

/**
 * 类说明：ThreadLocal的线程不安全演示
 */
public class ThreadLocalUnsafe implements Runnable {

    public static ThreadLocal<Number> sThreadLocal = new ThreadLocal<Number>();
    //static : number成共享变量了
    public static Number number = new Number(0);

    //解决：方式1：这里去掉static
    //解决：方式2：使用initialValue()

//    public static ThreadLocal<Number> sThreadLocal = new ThreadLocal<Number>(){
//        @Override
//        protected Number initialValue() {
//            return new Number(0);
//        }
//    };

    public void run() {
        //每个线程计数加一
        number.setNum(number.getNum()+1);
      //将其存储到ThreadLocal中
        sThreadLocal.set(number);
        SleepTools.ms(2);
        //输出num值
        System.out.println(Thread.currentThread().getName()+"="+ sThreadLocal.get().getNum());
    }


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new ThreadLocalUnsafe()).start();
        }
    }

    private static class Number {
        public Number(int num) {
            this.num = num;
        }

        private int num;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Number [num=" + num + "]";
        }
    }

}
