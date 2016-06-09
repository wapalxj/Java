package CC164_RandomAccessFile;

import java.io.*;
import java.util.Arrays;
import java.util.Vector;

/**
 * Created by Administrator on 2015/12/2.
 * SequenceInputStream:将各种流封装在一起
 */
public class CC167_SequenceInputStream {
    public static void main(String[] args) throws IOException {
        File file=new File("F:/others/split.txt");
        Vector<InputStream> vi=new Vector<>();
        vi.add(new BufferedInputStream(new FileInputStream(file)));

        SequenceInputStream sis=new SequenceInputStream(vi.elements());
        int len=0;
        byte [] flush=new byte[1024];
        while (-1!=(len=sis.read(flush))){
            String s=new String(flush,0,len);
            System.out.println(s);
        }
        sis.close();
    }
}
