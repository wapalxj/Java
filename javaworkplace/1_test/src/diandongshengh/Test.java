package diandongshengh;

import java.net.URLEncoder;

/**
 * Created by mu.guihai on 2018/2/28.
 */
public class Test {
    public static void main(String[] args) {
        String con="{\"province\":\"all\",\"operator\":\"all\",\"datatype\":\"all\",\"interface\":\"all\",\"auto\":\"all\",\"city\":\"all\"}";

        System.out.println(URLEncoder.encode(con));
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.print( RequestUtils.requestAllDataCity(con));
//            }
//        }).start();
    }
}
