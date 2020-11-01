package byd;

import java.net.URLEncoder;

/**
 * Created by wapal on 2017/7/19.
 */
public class TestChargeState {
    public static void main(String[] args) {
//        String url = "https://www.powerlife.com.cn/evcs/v1.0/data_province?key=exjwpor4x6opibydii4&condition=%7B%22province%22%3A%22all%22%2C%22operator%22%3A%22all%22%2C%22datatype%22%3A%22all%22%2C%22interface%22%3A%22fast%22%7D";
//        String pre="https://www.powerlife.com.cn/evcs/v1.0/data_province?key=exjwpor4x6opibydii4&condition=";
//        String condition="{\"province\":\"all\",\"operator\":\"all\",\"datatype\":\"all\",\"interface\":\"fast\"}";
//        String s2 = PLHttpsGet.execute(pre+URLEncoder.encode(condition));
//        System.out.println(s2);
//        sendStation("");
//        sendCities();
//        sendOp();
        sendDetail("4ff63847a1");
    }

    /**
     * 桩
     * @param view
     */
    public static void sendStation(final String city){
        String pre="https://www.powerlife.com.cn/evcs/v1.0/pile_data?key=exjwpor4x6opibydii4&city=1&condition=";
        String condition="{\"province\":\"beijing\",\"operator\":\"all\",\"datatype\":\"all\",\"interface\":\"fast\"}";
        String url=pre+""+ URLEncoder.encode(condition);
        String s2 = PLHttpsGet.execute(pre+URLEncoder.encode(condition));
        System.out.println(s2);
    }
    /**
     * 桩
     * @param view
     */
    public static void sendDetail(String code){
        String pre="https://www.powerlife.com.cn/evcs/v1.0/pile_detail?key=exjwpor4x6opibydii4&code="+code;
        String s2 = PLHttpsGet.execute(pre);
        System.out.println(s2);
    }

    /**
     * 桩
     * @param view
     */
    public static void sendCities(){
        String pre="https://www.powerlife.com.cn/evcs/v1.0/data_citylist?key=exjwpor4x6opibydii4";
        String s2 = PLHttpsGet.execute(pre);
        System.out.println(s2);
    }

    /**
     * 运营商
     * @param view
     */
    public static void sendOp(){
        String pre="https://www.powerlife.com.cn/evcs/v1.0/get_update?key=exjwpor4x6opibydii4";
        String s2 = PLHttpsGet.execute(pre);
        System.out.println(s2);
    }
}
