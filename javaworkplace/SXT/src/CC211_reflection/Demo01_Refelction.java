package CC211_reflection;

/**
 * Created by Administrator on 2015/12/12.
 * java.lang.Class
 * ���Ը������Ͷ�Ӧ��Class����
 */
public class Demo01_Refelction {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String path="CC211_reflection.User";

        Class clazz = Class.forName(path);
        Class clazz2 = Class.forName(path);
        System.out.println(clazz.getName());
        System.out.println(clazz.hashCode());
        //һ����Class����(�������)��Ψһ��,������ʵ�������Ķ���ͬ
        System.out.println(clazz2.hashCode());
        User u1=(User)clazz.newInstance();
        User u2=(User)clazz.newInstance();
        System.out.println("u1==u2:"+(u1==u2));

        //��ȡClass
        Class strClass =String.class;
        Class strClass2 =path.getClass();
        //String��Class����Ҳ��Ψһ��
        System.out.println(strClass==strClass2);

        //�����������͵�Class����,ע���ά�����һά�����ǲ�һ����
        Class intClass=int.class;
        int []a1=new int[21];
        int []a2=new int[30];
        System.out.println("a1.Clss=a2.Class:"+(a1.getClass().hashCode()==a2.getClass().hashCode()));




    }
}
