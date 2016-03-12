/**
 * Created by Administrator on 2016/3/12.
 */
public class ObjectTest {
    public static void main(String[] args) {
        OOB o=new OOB();
        o.say();
    }
}

class OOB{
    private String name;

    public void say(){
        System.out.println("object");
    }
}