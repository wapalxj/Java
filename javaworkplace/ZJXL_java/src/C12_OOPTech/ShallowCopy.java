package C12_OOPTech;

/*
 * �����¡��ǳ����1
 */
class A {
    public int i = 100;
}

public class ShallowCopy {

    public static void main(String[] args) {
        A a = new A();
        //��ʼ��¡
        A other = CloneObject(a);
        System.out.println(a == other);

    }

     static A CloneObject(A obj) {
        A newObj = new A();
        newObj.i = obj.i;
        return newObj;
    }
}

