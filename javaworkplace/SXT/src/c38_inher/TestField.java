package c38_inher;

/**
 * Created by Administrator on 2016/9/18.
 * 打印出来的值为0
 */
public class TestField {

    public static void main(String[] args) {
        P1 p1=new C1();
    }
}

class P1{

    public P1(){
        print();
    }

    public void print(){
    }
}

class C1 extends P1{
    public int a=100;

    public void print(){
        System.out.println("a=="+a);
    }
}