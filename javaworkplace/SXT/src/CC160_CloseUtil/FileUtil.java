package CC160_CloseUtil;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Administrator on 2015/12/1.
 * tool class for closing Stream
 */
public class FileUtil {
    //ʹ�ÿɱ����
    public static void close(Closeable... io) {
        for (Closeable temp:io){
            if (temp!=null){
                try {
                    temp.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //ʹ�÷���
    public static <T extends Closeable> void closeAll(T... io) {
        for (Closeable temp:io){
            if (temp!=null){
                try {
                    temp.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
