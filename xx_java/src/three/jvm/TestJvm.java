package three.jvm;

import java.util.NoSuchElementException;

public class TestJvm {
    public static void main(String[] args) {
//        String mString = "asdasd";
//        mString.hashCode();
        test01();
    }


    private static void test01() {
        try {
            test02();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("asdsadsadsadsadsad");
        }
    }

    private static void test02() {
        if (true) {
            throw new NoSuchElementException("test02");
        }
    }
}
