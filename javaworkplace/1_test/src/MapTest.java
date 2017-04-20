
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Administrator on 2016/3/11.
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap m=new HashMap<>();
        m.put(null,"asdsa");
        m.put("ssdsad",null);
//        System.out.println(m.get("ssdsad"));

        Hashtable t=new Hashtable();
//        t.put(null,"asdsa");
        t.put("ssdsad",null);
        System.out.println(t.get("ssdsad"));

    }
}
