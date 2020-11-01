package testPkg;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TestPkg {
    private static final String HI_LOG_PACKAGE;

    static {
        String className = TestPkg.class.getName();
        HI_LOG_PACKAGE = className.substring(0, className.lastIndexOf('.'));
    }

    public static void main(String[] args) {
            System.out.println(TestPkg.class.getName());
            System.out.println(HI_LOG_PACKAGE);
    }
}
