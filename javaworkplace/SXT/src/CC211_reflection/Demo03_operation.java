package CC211_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/12/12.
 * 操作
 */
public class Demo03_operation {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取Class对象
        String path="CC211_reflection.User";
        Class clazz = Class.forName(path);

        //构造对象,实际是调用了User 的无参构造器
        User user=(User)clazz.newInstance();

        //调用有参构造
        Constructor<User> constructor=clazz.getDeclaredConstructor(int.class, String.class, int.class);
        User user2=constructor.newInstance(20,"vero",10);

        //调用普通方法
        User user3=(User)clazz.newInstance();
        Method method=clazz.getDeclaredMethod("setName",String.class);
        method.invoke(user3,"vnix");//激活
        System.out.println("User3--age:"+user3.getName());
        //或者直接调用
        user3.setName("vnix-------");
        System.out.println("User3--age:"+user3.getName());


        //操作属性
        User user4=(User)clazz.newInstance();
        Field f=clazz.getDeclaredField("name");
        f.setAccessible(true);//不需要做安全检查，检查访问，否则私有方法会报异常
        f.set(user4,"vnix---4");//第一个参数指定对象
        System.out.println("User4--name:"+user4.getName());
        System.out.println("User4--name:"+f.get(user4));
    }
}
