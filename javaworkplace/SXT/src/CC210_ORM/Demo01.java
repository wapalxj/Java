package CC210_ORM;

import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2015/12/10.
 * 使用反射读取注解信息，模拟处理注解信息的流程
 */
public class Demo01 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("CC210_ORM.SxStudent");
            Annotation[] annotations=clazz.getAnnotations();
            for (Annotation a:annotations){
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
