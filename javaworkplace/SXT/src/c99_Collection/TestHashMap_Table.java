package c99_Collection;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/27.
 */
public class TestHashMap_Table {
    public static void main(String[] args) {
        Map<String,String> hashMap=new HashMap<>();
        Map<String,String> hashtable=new Hashtable<>();

        hashMap.put("v1","v1111");
        hashMap.put(null,null);

        hashtable.put("v2","v2222");
//        hashtable.put(null,null);//运行出错
//        hashtable.put("v3",null);//运行出错
        hashtable.put("","");

        System.out.println(hashMap.get("v1")+"----"+hashMap.get(null));
        System.out.println(hashtable.get("v2")+"----"+hashtable.get(""));
    }
}
