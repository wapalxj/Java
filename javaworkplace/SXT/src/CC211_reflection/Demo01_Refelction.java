package CC211_reflection;

/**
 * Created by Administrator on 2015/12/12.
 * java.lang.Class
 * 测试各种类型对应的Class对象
 */
public class Demo01_Refelction {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String path="CC211_reflection.User";

        Class clazz = Class.forName(path);
        Class clazz2 = Class.forName(path);
        System.out.println(clazz.getName());
        System.out.println(clazz.hashCode());
        //一个类Class对象(反射对象)是唯一的,但是再实例出来的对象不同
        System.out.println(clazz2.hashCode());
        User u1=(User)clazz.newInstance();
        User u2=(User)clazz.newInstance();
        System.out.println("u1==u2:"+(u1==u2));

        //获取Class
        Class strClass =String.class;
        Class strClass2 =path.getClass();
        //String的Class对象也是唯一的
        System.out.println(strClass==strClass2);

        //基本数据类型的Class对象,注意二维数组和一维素组是不一样的
        Class intClass=int.class;
        int []a1=new int[21];
        int []a2=new int[30];
        System.out.println("a1.Clss=a2.Class:"+(a1.getClass().hashCode()==a2.getClass().hashCode()));




    }
}
