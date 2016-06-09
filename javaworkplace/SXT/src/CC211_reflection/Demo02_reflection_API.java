package CC211_reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Administrator on 2015/12/12.
 * Ӧ�÷���API����ȡ�����Ϣ�����������ԣ������ȣ�
 */
public class Demo02_reflection_API {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        String path="CC211_reflection.User";
        Class clazz = Class.forName(path);
        //����
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        //����
//        Field[] fields=clazz.getFields();//ֻ�ܻ��public����������
        Field[] fields=clazz.getDeclaredFields();//�����������
        Field field=clazz.getDeclaredField("name");
        System.out.println("fields.length:"+fields.length);
        System.out.println("fields:"+Arrays.toString(fields));
        System.out.println("field:"+field);

        //����
        Method[] methods=clazz.getDeclaredMethods();
        Method method=clazz.getDeclaredMethod("getId");
        Method method_overload=clazz.getDeclaredMethod("setName",String.class);//��������ʱʹ��
        System.out.println("methods:"+Arrays.toString(methods));
        System.out.println("method:"+method);

        //������Ϣ
        Constructor[] constructors=clazz.getDeclaredConstructors();
        Constructor constructor=clazz.getDeclaredConstructor(null);//��ȡ�չ���
        System.out.println("constructors:"+Arrays.toString(constructors));
        System.out.println("constructors-null:"+constructor);
    }
}
