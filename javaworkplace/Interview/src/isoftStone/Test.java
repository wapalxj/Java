package isoftStone;

/**
 * Created by Administrator on 2016/3/10.
 */
public class Test {
}

interface IDemo{
    public static final String name="";//final必须要初始化
    void print();
    public void getInfo();
}
abstract class Person implements IDemo{

    public void print(){
    }
}

class P2 extends Person{
    @Override
    public void getInfo() {

    }
}