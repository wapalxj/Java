package CC161_print_Stream;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/1.
 * 重定向
 */
public class Demo03_re {
    public static void main(String[] args) throws FileNotFoundException {
//        test1();
        test2();
    }
    //输出到文件:从控制台
    public static void test1() throws FileNotFoundException {
        Scanner in=new Scanner(System.in);

        PrintStream ps=new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("F:/others/printXXX.txt")), true);
        System.setOut(ps);

        System.out.println(in.nextLine());
        ps.close();
    }
    public static void test2() throws FileNotFoundException {
        //再回控制台
        PrintStream ps =new PrintStream(
                        new BufferedOutputStream(
                        new FileOutputStream(new FileDescriptor().out)));
        System.setOut(ps);

        System.out.println("aaaaa");
        ps.close();
    }


}
