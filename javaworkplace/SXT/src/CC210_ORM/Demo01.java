package CC210_ORM;

import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2015/12/10.
 * ʹ�÷����ȡע����Ϣ��ģ�⴦��ע����Ϣ������
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