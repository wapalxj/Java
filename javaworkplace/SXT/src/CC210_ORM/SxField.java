package CC210_ORM;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2015/12/10.
 */
@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SxField {
    String columnName();
    String type();
    int length();
}




@interface Check {
    int value();
}

@Target({ElementType.METHOD,ElementType.FIELD})
@interface Perform  {

}

class Test{

    @Perform()
    @Check(1)
    int a;

    @Perform
    int b;

}

