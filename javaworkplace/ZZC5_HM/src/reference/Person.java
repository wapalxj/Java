package reference;

import java.lang.ref.*;
import java.lang.reflect.Field;

public class Person {

    public static void main(String[] args) throws InterruptedException {
        //强引用
//        Person person=new Person();
        //弱引用
//        WeakReference<Person> wp=new WeakReference<>(new Person());
        //软引用
//        SoftReference<Person> wp=new SoftReference<>(new Person());
//        wp.get().say();

        //虚引用

        testPhantomReference();

        PhantomReference<Person> wp = new PhantomReference<>(new Person(), new ReferenceQueue<>());

//        wp.get().say();//虚引用get()总是返回null

        //调起垃圾回收
        System.gc();
        Thread.sleep(5000);
    }

    public static boolean isRun = true;

    private static void testPhantomReference() throws InterruptedException {
        String abc = new String("abc");
        System.out.println(abc.getClass() + "@" + abc.hashCode());
        final ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        new Thread() {
            public void run() {
                while (isRun) {
                    //通过判断queue里面是不是有对象来判断你的对象是不是要被回收了

                    //必须要从引用队列移除虚引用，不然不会被回收
                    Object obj = referenceQueue.poll();

                    if (obj != null) {
                        //通过反射验证是不是我们的对象
                        try {
                            System.out.println("obj："+obj.getClass().getSimpleName());
                            Field rereferent = Reference.class
                                    .getDeclaredField("referent");
                            rereferent.setAccessible(true);
                            Object result = rereferent.get(obj);
                            System.out.println("gc will collect："
                                    + result.getClass() + "@"
                                    + result.hashCode() + "\t"
                                    + (String) result);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        // 测试情况1:对象是虚可达的,会加入到引用队列
//        PhantomReference<String> abcWeakRef = new PhantomReference<>(abc, referenceQueue);

        // 测试情况2:对象是不可达的,直接就被回收了,不会加入到引用队列
        new PhantomReference<>(abc, referenceQueue);
        abc = null;
        Thread.sleep(3000);
        System.gc();
        Thread.sleep(3000);
        isRun = false;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("被回收了");
        super.finalize();
    }

    public void say() {
        System.out.println("别睡觉");
    }
}
