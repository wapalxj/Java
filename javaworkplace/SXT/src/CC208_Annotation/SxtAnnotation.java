package CC208_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2015/12/10.
 * 自定义注解
 */
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtAnnotation {
    //类型String,参数名veroName，默认值""
    String veroName() default "";
    //类型int,参数名age，默认值""
    int age() default 1;
}
