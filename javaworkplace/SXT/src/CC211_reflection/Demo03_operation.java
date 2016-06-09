package CC211_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/12/12.
 * ����
 */
public class Demo03_operation {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //��ȡClass����
        String path="CC211_reflection.User";
        Class clazz = Class.forName(path);

        //�������,ʵ���ǵ�����User ���޲ι�����
        User user=(User)clazz.newInstance();

        //�����вι���
        Constructor<User> constructor=clazz.getDeclaredConstructor(int.class, String.class, int.class);
        User user2=constructor.newInstance(20,"vero",10);

        //������ͨ����
        User user3=(User)clazz.newInstance();
        Method method=clazz.getDeclaredMethod("setName",String.class);
        method.invoke(user3,"vnix");//����
        System.out.println("User3--age:"+user3.getName());
        //����ֱ�ӵ���
        user3.setName("vnix-------");
        System.out.println("User3--age:"+user3.getName());


        //��������
        User user4=(User)clazz.newInstance();
        Field f=clazz.getDeclaredField("name");
        f.setAccessible(true);//����Ҫ����ȫ��飬�����ʣ�����˽�з����ᱨ�쳣
        f.set(user4,"vnix---4");//��һ������ָ������
        System.out.println("User4--name:"+user4.getName());
        System.out.println("User4--name:"+f.get(user4));
    }
}
