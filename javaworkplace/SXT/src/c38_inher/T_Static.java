package c38_inher;

/**
 * Created by Administrator on 2016/8/29.
 * 父类静态属性和方法可以直接被子类调用
 */
public class T_Static {
    public static void main(String[] args) {
        ChildT.canUsedInChild();
        ChildT.staticV++;
    }
}

class ParentT {
    static int staticV=1000;
    static void canUsedInChild(){
        System.out.print("可以在子类中调用吗？");
    }
}

class ChildT  extends ParentT{
    public ChildT() {
        //super.canUsedfInChild();//属于类的方法，当然编译出错，
        canUsedInChild();
    }
}


