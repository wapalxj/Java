package C00_data;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/8/24.
 *	Unicode（UTF-8）---->变长
 *
 * getBytes("gbk")---->指定编码集也会有不同的结果
 *
 * IDEA中不支持main(String\u005B\u005D args)-----eclipse可以支持
 */
public class Unicode {
    public static void main(String[] args) {
        String eng="a";
        String alabo="Ô";
        String cn="学";
        String other="౸";

        System.out.println("字母占字节:"+eng.getBytes().length);
        System.out.println("阿拉伯占字节:"+alabo.getBytes().length);
        System.out.println("汉字占字节:"+cn.getBytes().length);
        System.out.println("特殊字符占字节:"+other.getBytes().length);
        System.out.println(other.charAt(0));

        int cp=other.codePointAt(0);
        if (Character.isSupplementaryCodePoint(cp)){
            System.out.println(other.charAt(0));
        }


    }
}
