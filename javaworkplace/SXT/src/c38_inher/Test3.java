package c38_inher;

/**
 * Created by Administrator on 2016/3/25.
 * 测试继承中成员变量的隐藏
 */
public class Test3 {
    public static void main(String[] args) {
        BB b=new BB();
        System.out.println(b.a);
        System.out.println(b.sayA());
    }
}

class AA{
    String a="aa";

    public String  sayA(){
        return a;
    }
}

class BB extends AA{
    String a="bb";
//    int a="bb";
//    public String  sayA(){
//        return a;
//    }
}

