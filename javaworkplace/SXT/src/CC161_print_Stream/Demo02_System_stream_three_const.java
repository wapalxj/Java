package CC161_print_Stream;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/1.
 * System.in/out/err
 */
public class Demo02_System_stream_three_const {

    public static void main(String[] args) throws FileNotFoundException {
//        test1();
        test2("F:/others/print.txt");
    }
    //从文件输入
    public static void test2(String src) throws FileNotFoundException {
        File file=new File(src);
        InputStream is = new BufferedInputStream(new FileInputStream(file));
        Scanner in=new Scanner(is);
        System.out.println("请输入：");
        System.out.println(in.nextLine());
    }
    //从键盘输入
    public static void test1() {
        InputStream is =System.in;
        Scanner in=new Scanner(is);

        System.out.println("请输入：");
        System.out.println(in.nextLine());
    }
    public static void test() {
        System.out.println("test");
        System.err.println("err");
    }
}
