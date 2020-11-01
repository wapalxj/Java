package c72_Exception;

/**
 * Created by wapal on 2017/6/14.
 */
public class ZZZ_04_ {
    public static void main(String[] args) {
        int a[]={1,2,3};

        try {
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[3]);
            System.out.println("xxxx");
        }catch (Exception e){
            System.out.println("xxxx");
        }
        System.out.println("end");

    }
}
