package diandongshengh;


import java.net.URLEncoder;

/**
 * Created by mu.guihai on 2017/7/21.
 */

public class RequestUtils {
    /**
     * 4. 获得全国汇总数据查询
     */

    public static String requestAllDataProvince(String condition){
        String url= Constant.rootUrl+"data_province?key=exjwpor4x6opibydii4&condition=";
        //构建condition
        String res = PLHttpsGet.execute(url+ URLEncoder.encode(condition));
        return res;
    }

    public static String requestAllDataCity(String condition){
        //构建condition
        String url= Constant.rootUrl+"data_city?key=exjwpor4x6opibydii4&condition=";
        //构建condition
        String res = PLHttpsGet.execute(url+ URLEncoder.encode(condition));
        return res;
    }
}
