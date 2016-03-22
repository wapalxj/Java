package C44_encapsulation;

/**
 * Created by Administrator on 2016/3/15.
 */
public class A {
    public static void main(String[] args) {
        A a1=new A();
        a1.sayPri();
        a1.sayPro();
        a1.sayPub();
    }

    private void sayPri(){
        System.out.print("只有当前类中可以访问");
    }

    protected void sayPro(){
        System.out.print("子类和当前包中可以访问");
    }
    public void sayPub(){
        System.out.print("所有类中可以访问");
    }
    void sayDef(){
        System.out.print("当前包中可以访问");
    }
}

class B{
    public static void test(){
        A a2=new A();
//        a2.sayPri();//编译出错
        a2.sayPro();
        a2.sayPub();
        a2.sayDef();
    }
}

class AA extends A{
    public static void test(){
        A a3=new A();
        a3.sayPub();
        a3.sayPro();
        a3.sayDef();
//        a3.sayPri();//编译出错

    }
}
