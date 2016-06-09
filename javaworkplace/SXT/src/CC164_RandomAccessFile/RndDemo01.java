package CC164_RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2015/12/2.
 * 1.RandomAccessFile:随机读取
 *
 *
 */
public class RndDemo01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rnd=new RandomAccessFile(new File("F:/others/a.txt"),"r");
        rnd.seek(10);//从第10个字节开始读
        //定义缓冲大小
        byte[] flush=new byte[1024];

        int length=0;
        while (-1!=(length=rnd.read(flush))){
            //读20个
            if (length>20){
                System.out.println(new String(flush,0,20));
            }else {
                //不满20读length
                System.out.println(new String(flush,0,length));
            }

        }

        rnd.close();
    }
}
