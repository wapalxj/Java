package android.HM62_day68.url_encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 	get地址栏不允许传中文和一些特殊字符
 *  post的ket-value也不行
 */
public class TestUrlEncoder {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String url="http://www.baidu.com?search=云大树莓贾老师";
//        String encoderUrl=URLEncoder.encode(url);
        String encoderUrl=URLEncoder.encode(url,"UTF-8");
        System.out.println(encoderUrl);

        String decoderUrl=URLDecoder.decode(url,"UTF-8");
        System.out.println(decoderUrl);


        //decoder一个没有encoder的字符串
        String decoderUrl2=URLDecoder.decode("哈哈哈哈","UTF-8");
        System.out.println(decoderUrl2);
    }
}
