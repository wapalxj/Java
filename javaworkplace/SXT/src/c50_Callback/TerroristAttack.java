package c50_Callback;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 接口回调的嫉妒拉风的例子
 * Created by Administrator on 2016/4/8.
 */

//相当于class A
class At$911 implements TerroristAttack.BoomWTC {//相当于【背景1】
    private boolean decide;
    private TerroristAttack ta;//相当于【背景2】

    public At$911(){
        this.ta=new TerroristAttack();
        Date now=new Date();
        SimpleDateFormat myFmt1=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        System.out.println(myFmt1.format(now));
        this.decide= myFmt1.format(now).equals("2016/04/12 12:28");
    }

    public void attt(){
        System.out.println(this.decide);
        ta.attack(new At$911());//class A调用class B的方法传入自己的对象，相当于【you call me】
    }
    //获得拉登的决定
    public boolean benLaDengDecide(){
        return decide;
    }

    // 执行轰炸世贸
    public void boom(){
        System.out.print("boom_boom_boom");
    }
}

//相当于class B
public class TerroristAttack{
    public TerroristAttack(){
    }

    public void attack(BoomWTC bmw){//这相当于【背景3】
        if(bmw.benLaDengDecide()){//class B在方法中回调class A的方法，相当于【i call you back】
            bmw.boom();
        }
    }

    //相当于接口InA
    interface BoomWTC{
        //获得拉登的决定
        boolean benLaDengDecide();

        // 执行轰炸世贸
        void boom();
    }
}


class Test2{
    public static void main(String[] args) {
        At$911 v1= new At$911();
        v1.attt();
    }
}

