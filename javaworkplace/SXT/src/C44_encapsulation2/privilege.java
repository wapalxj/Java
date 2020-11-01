package C44_encapsulation2;

import sun.util.resources.cldr.yo.CurrencyNames_yo;

/**
 * Created by wapal on 2017/7/10.
 * 子类可以更改父类的访问权限
 */
public class privilege {
    public static void main(String[] args) {
        new SmallTop().say("xxxxx");
    }
}

class Top{
    protected void say(String s){
        System.out.println(s);
    }
}

class SmallTop extends Top{
    //将父类方法更改访问权限
    @Override
    public void say(String s) {
        super.say(s);
    }
}