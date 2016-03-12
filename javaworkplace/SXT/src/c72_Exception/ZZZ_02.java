package c72_Exception;

import java.io.IOException;

/**
 * Created by Administrator on 2016/3/12.
 */
public class ZZZ_02 {
    public static void main(String[] args){

            throw new MyEC2("xxxxxxxx");

    }
}

class MyEC2 extends RuntimeException {
    public MyEC2() {
    }

    public MyEC2(String msg) {
        super(msg);
    }
}
