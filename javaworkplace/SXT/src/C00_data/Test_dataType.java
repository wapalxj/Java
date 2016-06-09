package C00_data;

import java.util.Objects;

/**
 * Created by Administrator on 2016/5/27.
 * 基本数据类型
 */
public class Test_dataType {

    private static int yy;
    public static void main(String[] args) {
        byte b1=127;
//        byte b2=128;//编译错误
        short s1=32767;
//        short s2=32768;//编译错误
        int c=500;

//        b1=c;//编译错误
//        b1=s1;//编译错误
//        s1=c;//编译错误
        c=b1;
        s1=b1;
        c=s1;

        int gg;
//        System.out.println(gg);//编译错误,gg没有初始化
//        int y=null;//编译错误
        Object o=null;

        System.out.println(yy);//成员变量自动初始化为0


        //null本身不是对象，也不是Objcet的实例
        //判断一个引用类型数据是否null。 用==来判断
        if (null instanceof java.lang.Object) {
            System.out.println("null属于java.lang.Object类型");
        } else {
            System.out.println("null不属于java.lang.Object类型");
        }

    }
}
