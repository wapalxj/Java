package c52_array;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/5/24.
 * web中数据传输通过字节数组，这里随便写一个字节数组，转化为字符串
 */
public class ByteArray {
    public static void main(String[] args) {
        byte[] arr={110,10,12,24,38,42};
        try {
            System.out.println( new String(arr,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
