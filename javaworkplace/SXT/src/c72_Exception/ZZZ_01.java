package c72_Exception;

/**
 * Created by Administrator on 2016/3/12.
 */
public class ZZZ_01 {
    public static void main(String[] args){
        try {
            throw new MyEC("xxxxxxxx");
        } catch (MyEC myEC) {
            myEC.printStackTrace();
        }
    }
}

class MyEC extends Exception{
    public MyEC() {
    }
    public MyEC(String msg) {
        super(msg);
    }
}
