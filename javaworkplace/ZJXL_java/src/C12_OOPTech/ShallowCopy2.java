package C12_OOPTech;

/*
 * �����¡��ǳ����2
 */
class A2 {

    public int i = 100;
    public B2 b;        //A����һ��B�Ķ���

    public A2() {
        b = new B2();	//���������ݶ���
    }
}

class B2 {

    public int j = 200;
}

public class ShallowCopy2 {

    public static void main(String[] args) {
        A2 a = new A2();
        A2 other = CloneObject(a);
        System.out.println(a==other);
        System.out.println(a.b==other.b);

    }

    static A2 CloneObject(A2 obj) {
        A2 newObj = new A2();
        newObj.i = obj.i;
        newObj.b = obj.b;
        return newObj;
    }
}
