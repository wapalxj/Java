package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Test {
    public static void main(String[] args) {
        SoftReference<Object> soft = new SoftReference<>(new Object());
        WeakReference<Object> weak = new WeakReference<>(new Object());
        WeakReference<String> weakString = new WeakReference<>("abc");
        PhantomReference<Object> phantom = new PhantomReference<>(new Object(), new ReferenceQueue<>());
        System.gc();
        System.out.println(soft.get());
        System.out.println(weak.get());
        System.out.println(weakString.get());
        System.out.println(phantom.get());

        //java.lang.Object@29453f44
        //null
        //abc       ----->没被回收是引用常量池持有对"abc"的引用
        //null
    }
}
