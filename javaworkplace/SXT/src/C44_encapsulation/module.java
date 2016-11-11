package C44_encapsulation;

/**
 * Created by Administrator on 2016/8/30.
 */
public class module {
    public static void main(String[] args) {
        new Haha();
        new Hehe();
        new Hehe();
        new Hehe();
    }
}

class Haha{
    static Say s=new Say();
    static {
        System.out.println("static module");
    }

    {
        System.out.println("constructor module");
    }
}

class Say{
    public Say(){
        System.out.println("static field");
    }
}

class Hehe extends Haha{

}