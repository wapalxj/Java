package CC161_print_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2015/12/1.
 * ��װ�Լ��Ķ�����
 */
public class Demo04_Input {
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        //ʹ��BufferedReader����ʹ������readLine()
        BufferedReader dr=new BufferedReader(new InputStreamReader(in));
        System.out.println("�����");
        System.out.println(dr.readLine());
    }
}
