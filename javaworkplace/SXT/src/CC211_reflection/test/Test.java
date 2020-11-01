package CC211_reflection.test;

import java.lang.reflect.Field;

/**
 * 反射改变属性的值
 */
public class Test {
    public static void main(String[] args) {
        Bean bean=new Bean("vero",false);
        System.out.println(bean);

        try {
            Field field=Bean.class.getDeclaredField("isGood");
            field.setAccessible(true);
            field.set(bean,true);
            System.out.println(bean);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
