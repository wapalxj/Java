package c1_4_thread.cn.enjoyedu.ch3.answer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *类说明：有一个残缺AtomicInteger的类实现了线程安全的：
 *get方法和compareAndSet()方法
 *自行实现它的递增方法
 */
public class HalfAtomicInt {
    private AtomicInteger atomicI = new AtomicInteger(0);

    public void increament() {
        for (;;) {
            int i = atomicI.get();
            boolean suc = atomicI.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }
    
    public int getCount() {
    	return atomicI.get();
    }

}
