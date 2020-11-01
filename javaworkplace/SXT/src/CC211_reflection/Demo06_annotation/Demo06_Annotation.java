package CC211_reflection.Demo06_annotation;


import javax.annotation.processing.AbstractProcessor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/12/13.
 * 反射读取注解:和注解CC210的demo01一样
 */
public class Demo06_Annotation {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("CC211_reflection.Demo06_annotation.SxStudent");


            //获取类的所有注解
            Annotation[] annotations=clazz.getAnnotations();
            for (Annotation a:annotations){
                System.out.println(a);
            }


            //获取类的指定注解的值
            SxTable st= (SxTable) clazz.getAnnotation(SxTable.class);
            System.out.println(st.value());

            //获得类的属性的注解
            Field field=clazz.getDeclaredField("studentName");
            SxField sxField=field.getAnnotation(SxField.class);
            System.out.println(sxField.columnName()+"--"+sxField.type()+"--"+sxField.length());

            //获得类的方法的注解
            Method method=clazz.getDeclaredMethod("getId");
            SxTable sxMethod=method.getAnnotation(SxTable.class);
            System.out.println(sxMethod.value());

            //可以根据获得的表名，字段等信息，通过JDBC执行SQL语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
