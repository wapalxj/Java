package CC208_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2015/12/10.
 * �Զ���ע��
 */
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtAnnotation {
    //����String,������veroName��Ĭ��ֵ""
    String veroName() default "";
    //����int,������age��Ĭ��ֵ""
    int age() default 1;
}
