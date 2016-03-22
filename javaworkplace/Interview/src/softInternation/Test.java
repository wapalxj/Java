package softInternation;

/**
 * Created by Administrator on 2016/3/14.
 */
public class Test {
    static int arr[]=new int[10];

    public static void main(String[] args) throws Exception {
        //声明题
//        char c='a';
//        boolean bo=null;
//        float f=1.3;
//        byte b=253;

        //数组题
//        System.out.println(arr[2]);
        //对象题1
//        new B();


        //循环题1
//        for (int i=0;i<=3;i++){
//            for (int j=3;j>=0;j--){
//                if (i==j) continue;
//                System.out.println("i="+i+",j="+j);
//            }
//        }
        //循环题2
//        int j=0;
//        for (int k=0;j+k!=10;j++,k++){
//                System.out.println("j="+j+",k="+k);
//        }
//        do{
//            System.out.println("j="+j++);
//            if (j==3){continue  loop;}//loop不是JAVA关键字
//        }while (j<10);

        //循环题3
//        int total=0;
//        for (int i=0;i<=3;i++){
//            if (i==1) continue;
//            if (i==2) break;
//            total+=i;
//        }
//        System.out.println(total);

        //异常题1
//        throw new Exception ("sssssssssss");

        //字符串题
//        String s1="ab";
//        String s2=new String (s1);
//        System.out.println(s1.equals(s2)+"------>"+(s1==s2));

        //对象题
        test2 t1=new test2();
        t1.method();
        test2 t2=new test2();
        t2.method();
        System.out.println(t1.method());
    }
}

class C{
    C(){
        System.out.println("C");
    }
}

class A{
    C c=new C();
    public void A(){
//        this("A");
        System.out.println("A");
    }
    A(String s){
        System.out.println(s);
    }
}

class B extends A{
    B(){
        super("B");
        System.out.println("B");
    }
}

class test2{
    static int i=0;
    public int method(){
        i++;
        return i;
    }
}