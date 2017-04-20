package Test;

/**
 * Created by Administrator on 2016/11/27.
 * 接口default方法
 */
public class Test_default {

}

interface AAA{
    default public void say(){
        System.out.println("default method");
    }
}