package CC211_reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/13.
 * �����������
 */
public class Demo05_Generic {
    public static void main(String[] args) throws NoSuchMethodException {
    //���ָ�������Ĳ���������Ϣ
        System.out.println("--------------��������--------------");

        Method m=Demo05_Generic.class.getMethod("test01", Map.class, List.class);
        //������ö������
        Type[] t=m.getGenericParameterTypes();

        for (Type parameType :t){
            System.out.println("#"+parameType);
            if (parameType instanceof ParameterizedType){
                Type[] genericTypes=((ParameterizedType)parameType).getActualTypeArguments();
                for (Type genericType:genericTypes){
                    System.out.println("�����������ͣ�"+genericType);
                }
            }
        }
    //��÷��ط�������
        System.out.println("--------------���ط���--------------");

        Method m2=Demo05_Generic.class.getMethod("test02", null);
        //��������
        Type returnType=m2.getGenericReturnType();
        System.out.println("#"+returnType);
        if (returnType instanceof ParameterizedType){
            Type[] genericTypes=((ParameterizedType)returnType).getActualTypeArguments();
            for (Type genericType:genericTypes){
                System.out.println("���ط������ͣ�"+genericType);
            }
        }

    }

    public void test01( Map<String,User> map,List<User> list){
        System.out.println("Demo05.test01()");
    }

    public Map<Integer,User> test02(){
        System.out.println("Demo05.test02()");
        return null;
    }
}
