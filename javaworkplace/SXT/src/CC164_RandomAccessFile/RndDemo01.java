package CC164_RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2015/12/2.
 * 1.RandomAccessFile:�����ȡ
 *
 *
 */
public class RndDemo01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rnd=new RandomAccessFile(new File("F:/others/a.txt"),"r");
        rnd.seek(10);//�ӵ�10���ֽڿ�ʼ��
        //���建���С
        byte[] flush=new byte[1024];

        int length=0;
        while (-1!=(length=rnd.read(flush))){
            //��20��
            if (length>20){
                System.out.println(new String(flush,0,20));
            }else {
                //����20��length
                System.out.println(new String(flush,0,length));
            }

        }

        rnd.close();
    }
}
