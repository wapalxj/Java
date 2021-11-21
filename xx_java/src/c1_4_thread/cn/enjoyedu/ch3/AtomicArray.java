package c1_4_thread.cn.enjoyedu.ch3;

import java.util.concurrent.atomic.AtomicIntegerArray;


/**
 * 类说明：
 */

public class AtomicArray {
    static int[] value = new int[]{1, 2};
    //内部：原数组的拷贝
    static AtomicIntegerArray ai = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        ai.getAndSet(0, 3);
        System.out.println(ai.get(0));
        //原数组不会变化
        System.out.println(value[0]);
    }
}
