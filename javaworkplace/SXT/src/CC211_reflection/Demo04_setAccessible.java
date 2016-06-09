package CC211_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/12/13.
 */
public class Demo04_setAccessible {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }

    /**
     * ��ͨ��������
     */
    public static void test01(){
        User u=new User();
        long startTime =System.currentTimeMillis();

        for (int i=0;i<1000000000;i++){
            u.getName();
        }
        long endTime =System.currentTimeMillis();

        System.out.println("��ͨ�������ã�ִ��10�ڴΣ���ʱ��"+(endTime-startTime)+"ms");

    }

    /**
     * ���䶯̬��������
     * @throws NoSuchMethodException
     */
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User u=new User();
        Class clazz= u.getClass();
        Method m=clazz.getDeclaredMethod("getName",null);
        long startTime =System.currentTimeMillis();

        for (int i=0;i<1000000000;i++){
           m.invoke(u,null);
        }
        long endTime =System.currentTimeMillis();

        System.out.println("���䶯̬�������ã�ִ��10�ڴΣ���ʱ��"+(endTime-startTime)+"ms");

    }

    /**
     *���䶯̬��������+setAccessible
     */
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User u=new User();
        Class clazz= u.getClass();
        Method m=clazz.getDeclaredMethod("getName",null);
        m.setAccessible(true);//��ִ�а�ȫ���
        long startTime =System.currentTimeMillis();

        for (int i=0;i<1000000000;i++){
            m.invoke(u, null);
        }
        long endTime =System.currentTimeMillis();

        System.out.println("���䶯̬��������+setAccessible��ִ��10�ڴΣ���ʱ��"+(endTime-startTime)+"ms");

    }
}
