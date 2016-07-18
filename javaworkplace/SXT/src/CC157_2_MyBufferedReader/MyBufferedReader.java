package CC157_2_MyBufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 模拟BufferedReader的readLine()
 *
 * Created by Administrator on 2016/6/10.
 */
public class MyBufferedReader {
    private Reader mReader;
    public MyBufferedReader(Reader reader){
        this.mReader=reader;
    }
    public  String readLine() throws IOException {
        StringBuilder line=new StringBuilder();
        int c;
        //一个字符一个字符的读，返回的是字符本身，而不是读取长度
        while ((c=mReader.read())!=-1){

            if ('\r'==c){
                continue;
            }
            if ('\n'==c){
                return line.toString();
            }
            line.append((char)c);
        }

        //将最后一行也加上返回
        if (line.length()>0){
            return line.toString();
        }
        return null;
    }
    public void close() throws IOException {
        mReader.close();
    }
}
