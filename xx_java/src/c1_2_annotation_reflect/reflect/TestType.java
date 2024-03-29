package c1_2_annotation_reflect.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 获取方法泛型返回值类型
 */
public class TestType {
    public static void main(String[] args) {
        Method[] methods = TestType.class.getMethods();
        Type returnType0 = methods[0].getGenericReturnType();
        Type returnType1 = methods[1].getGenericReturnType();
        Type returnType2 = methods[2].getGenericReturnType();
        System.out.println(returnType0+"=====");
        System.out.println(returnType1+"====="+((ParameterizedType)returnType1).getActualTypeArguments()[0]);
        System.out.println(returnType2+"====="+((ParameterizedType)returnType2).getActualTypeArguments()[0]);
    }


    public Wrapper<String> getWrapper() {
        return new Wrapper<>();
    }
    public Wrapper<List<String>> getWrapperList() {
        return new Wrapper<>();
    }


    static class SampleClass {
        public Wrapper<Integer> getWrapper() {
            return new Wrapper<>();
        }
        public Wrapper<List<String>> getWrapperList() {
            return new Wrapper<>();
        }
    }

    static class Wrapper<T> {
        T data;
    }
}


