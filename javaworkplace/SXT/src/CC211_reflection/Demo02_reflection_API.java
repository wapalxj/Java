package CC211_reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Administrator on 2015/12/12.
 * 应用反射API，获取类的信息（类名，属性，方法等）
 */
public class Demo02_reflection_API {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        String path="CC211_reflection.User";
        Class clazz = Class.forName(path);
        //类名
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        //属性
//        Field[] fields=clazz.getFields();//只能获得public的所有属性
        Field[] fields=clazz.getDeclaredFields();//获得所有属性
        Field field=clazz.getDeclaredField("name");
        System.out.println("fields.length:"+fields.length);
        System.out.println("fields:"+Arrays.toString(fields));
        System.out.println("field:"+field);

        //方法
        Method[] methods=clazz.getDeclaredMethods();
        Method method=clazz.getDeclaredMethod("getId");
        Method method_overload=clazz.getDeclaredMethod("setName",String.class);//方法重载时使用
        System.out.println("methods:"+Arrays.toString(methods));
        System.out.println("method:"+method);

        //构造信息
        Constructor[] constructors=clazz.getDeclaredConstructors();
        Constructor constructor=clazz.getDeclaredConstructor(null);//获取空构造
        System.out.println("constructors:"+Arrays.toString(constructors));
        System.out.println("constructors-null:"+constructor);
    }
}
