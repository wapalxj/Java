package c1_2_annotation_reflect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//元注解
@Retention(RetentionPolicy.SOURCE)
public @interface Vero {
    int value() default 0;
}
