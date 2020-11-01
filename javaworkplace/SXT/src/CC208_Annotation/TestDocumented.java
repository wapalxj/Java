package CC208_Annotation;

import java.lang.annotation.Documented;

/**
 * 穆桂海 TestDocumented测试类
 */

@MyDocumentedtAnnotation(key = "vero", value = "mu-gui-hai")
public class TestDocumented {
    /**
     *
     * @param name 传入名称name
     * @return 返回字符串结果哦
     */
    public String test(String name){
        return name;
    }
    public String toString() {
        return "hello vero...";
    }
}

@Documented
@interface MyDocumentedtAnnotation {

    public String key() default "yu";

    public String value() default "mgh";

}