package CC211_reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/13.
 * 反射操作泛型
 */
public class Demo05_Generic {
    public static void main(String[] args) throws NoSuchMethodException {
    //获得指定方法的参数泛型信息
        System.out.println("--------------参数泛型--------------");

        Method m=Demo05_Generic.class.getMethod("test01", Map.class, List.class);
        //数组放置多个参数
        Type[] t=m.getGenericParameterTypes();

        for (Type parameType :t){
            System.out.println("#"+parameType);
            if (parameType instanceof ParameterizedType){
                Type[] genericTypes=((ParameterizedType)parameType).getActualTypeArguments();
                for (Type genericType:genericTypes){
                    System.out.println("参数泛型类型："+genericType);
                }
            }
        }
    //获得返回泛型类型
        System.out.println("--------------返回泛型--------------");

        Method m2=Demo05_Generic.class.getMethod("test02", null);
        //返回类型
        Type returnType=m2.getGenericReturnType();
        System.out.println("#"+returnType);
        if (returnType instanceof ParameterizedType){
            Type[] genericTypes=((ParameterizedType)returnType).getActualTypeArguments();
            for (Type genericType:genericTypes){
                System.out.println("返回泛型类型："+genericType);
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
