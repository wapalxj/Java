package byd;

import java.net.URLEncoder;

/**
 * Created by mu.guihai on 2017/7/21.
 */

public class RequestUtils {
    //    public static String send(String url){
//        String s = PLHttpsGet.execute(url);
////        String res=formatJsonStr(s);
////        return res;
//    }
    public static void main(String[] args) {
        Condition condition=new Condition();
        condition.setProvince("all");
//        String res = requestSimplePile("28", condition);
//        String res = requestAllDataProvince(condition);
        String res = requestAllDataCity(condition);
        System.out.println(res);
    }

    /**
     * 4. 获得全国汇总数据查询
     */

    public static String requestAllDataProvince(Condition condition) {
        String url = Constant.rootUrl + "data_province?key=exjwpor4x6opibydii4&condition=";
        //构建condition
        String res = PLHttpsGet.execute(url + URLEncoder.encode(condition.toString()));
//        res=formatJsonStr(res);
        return res;
    }

    /**
     * 5. 获得省汇总数据查询
     */
    public static String requestAllDataCity(Condition condition) {
        String url = Constant.rootUrl + "data_city?key=exjwpor4x6opibydii4&condition=";
        String res = PLHttpsGet.execute(url + URLEncoder.encode(condition.toString()));
        return res;
    }


    //6.2请求桩简单数据，带属性
    public static String requestSimplePile(String city, Condition condition) {
        String url = Constant.rootUrl + "pile_data2?key=exjwpor4x6opibydii4&city=" + city + "&condition=";
        String res = PLHttpsGet.execute(url + URLEncoder.encode(condition.toString()));
//        res=formatJsonStr(res);
        return res;
    }

    //7.2按关键字搜索
    public static String searchPile(String key, String city, String province) {
        String url = Constant.rootUrl + "pile_search2?s=" + key + "&key=exjwpor4x6opibydii4&city=" + city + "&condition=";
        String condition = "{\"province\":\"" + province + "\",\"operator\":\"all\",\"datatype\":\"all\",\"interface\":\"fast\"}";
        String res = PLHttpsGet.execute(url + URLEncoder.encode(condition));
//        res=formatJsonStr(res);
        return res;
    }
    //7.4获取xx公里以内电桩
//    public static String searchPileInDistance(LatLng latLng, String province,int distance){
//        String center=latLng.longitude+","+latLng.latitude;
//        String url= Constant.rootUrl+"pile_pick2?key=exjwpor4x6opibydii4&center="+center+"&distance="+distance+"&condition=";
//        String condition="{\"province\":\""+province+"\",\"operator\":\"all\",\"datatype\":\"all\",\"interface\":\"fast\"}";
//        String res = PLHttpsGet.execute(url+ URLEncoder.encode(condition));
////        res=formatJsonStr(res);
//
////        String url="https://www.powerlife.com.cn/evcs/v1.0/pile_pick2?s=shenzhen&key=exjwpor4x6opibydii4&center=116.522015,39.88339&distance=10&condition=";
////        String condition="{\"province\":\"1\",\"operator\":\"all\",\"datatype\":\"all\",\"interface\":\"fast\"}";
////        String res=PLHttpsGet.execute(url+URLEncoder.encode(condition));
//        return res;
//    }


//    public static String formatJsonStr(String jsonStr) {
//        try {
//            StringBuffer sb=new StringBuffer("");
//            JSONObject jsonObject=new JSONObject(jsonStr);
//            JSONArray jsonArray=jsonObject.getJSONArray("list");
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject object=jsonArray.getJSONObject(i);
//                sb.append(object.toString()+"\n");
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return jsonStr;
//    }
}


