package CC161_print_Stream;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/1.
 * �ض���
 */
public class Demo03_re {
    public static void main(String[] args) throws FileNotFoundException {
//        test1();
        test2();
    }
    //������ļ�:�ӿ���̨
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
        //�ٻؿ���̨
        PrintStream ps =new PrintStream(
                        new BufferedOutputStream(
                        new FileOutputStream(new FileDescriptor().out)));
        System.setOut(ps);

        System.out.println("aaaaa");
        ps.close();
    }


}
