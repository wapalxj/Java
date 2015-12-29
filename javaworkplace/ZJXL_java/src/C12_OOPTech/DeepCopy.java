package C12_OOPTech;
/*
 * 对象克隆：深复制1
 */

class A3 {

    public int i = 100;
    public B3 b;        //A包容一个B的对象

    public A3() {
        b = new B3();	//创建被包容对象
    }
}

class B3 {
    public int j = 200;
}

public class DeepCopy {

    public static void main(String[] args) {
        A3 a = new A3();
        A3 other = CloneObject(a);
        System.out.println(a == other);
        System.out.println(a.b == other.b);

    }

    static A3 CloneObject(A3 obj) {
        A3 newObj = new A3();
        newObj.i = obj.i;
        newObj.b = new B3();
        newObj.b.j=obj.b.j;
        return newObj;
    }
}
