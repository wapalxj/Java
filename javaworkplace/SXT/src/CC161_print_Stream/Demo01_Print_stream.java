package CC161_print_Stream;

import java.io.*;

/**
 * Created by Administrator on 2015/12/1.
 */
public class Demo01_Print_stream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("test");

        PrintStream ps=System.out;
        ps.println("包装的打印流");
        ps.println("#######################################################");

        //输出到文件
        File file=new File("F:/others/print.txt");
        PrintStream p=new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)
                )
        );

        p.println("io is so easy lalala");
        p.close();
    }
}
