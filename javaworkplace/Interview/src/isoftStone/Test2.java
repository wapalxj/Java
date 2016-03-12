package isoftStone;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/3/10.
 */
public class Test2 {
}


class TestA extends Father{
    private String name="test";
//    public String getName() {
//        return this.name;
//    }
    public static void main(String[] args){
        TestA test = new TestA();
        System.out.println(test.getName());
    }
}
class Father{
    private String name="father";
    public String getName() {
        return this.name;
    }


}