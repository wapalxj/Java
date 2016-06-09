package CC161_print_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2015/12/1.
 * 封装自己的读入流
 */
public class Demo04_Input {
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        //使用BufferedReader可以使用新增readLine()
        BufferedReader dr=new BufferedReader(new InputStreamReader(in));
        System.out.println("请输出");
        System.out.println(dr.readLine());
    }
}
