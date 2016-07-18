package CC157_2_MyBufferedReader;

import java.io.*;

/**
 * 模拟BufferedReader的readLine()
 * Created by Administrator on 2016/6/10.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("F:\\GIT\\Java\\Java\\javaworkplace\\SXT\\src\\CC157_2_MyBufferedReader\\a.txt");
        MyBufferedReader reader=new MyBufferedReader(new FileReader(file));
        String line;
        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }
}
