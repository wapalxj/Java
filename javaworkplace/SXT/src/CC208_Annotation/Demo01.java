package CC208_Annotation;

import java.util.Date;

/**
 * Created by Administrator on 2015/12/9.
 */
public class Demo01 {

    @Override//注解:说明这个方法重写自父类
    public String toString() {
        return super.toString();
    }
//    @Override //不是重写的方法---报错
//    public String tostring() {
//        return super.toString();
//    }
    public static void main(String[] args) {
        Date date=new Date();
        //@Deprecated注解：不建议使用的
        date.parse("dd");
        myAnno();
    }
    @SuppressWarnings("all")
    @Deprecated//自己的不建议使用方法
    public static void myAnno(){
        System.out.println("声明为@Deprecated：不建议使用");
    }
}
