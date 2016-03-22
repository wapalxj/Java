package C44_encapsulation2;

import C44_encapsulation.A;

/**
 * Created by Administrator on 2016/3/15.
 * 测试上一个包的protected方法
 */
public class Test2 {

    public static void main(String[] args) {
        A a3=new A();
        a3.sayPub();
//        a3.sayPri();//编译出错
//        a3.sayPro();//编译出错
//        a3.sayDef();//编译出错
    }
}

class AA extends A{
    public static void test(){
        A a3=new A();
        a3.sayPub();
//        a3.sayPro();//编译出错:不能通过实例一个父类对象来调用
//        a3.sayPri();//编译出错
//        a3.sayDef();//编译出错

        AA aa=new AA();
        aa.sayPro();//子类对象可以调用
//        aa.sayDef();//编译出错
    }

    //子类可以从写
    @Override
    protected void sayPro() {
        super.sayPro();
    }
}
