package c38_inher;


/**
 * 另外一种形式的你们内部类
 * Created by Administrator on 2016/4/9.
 */
public class Test5 {
    public static void main(String[] args) {
        Ball ball=new Ball(){
            @Override
            public void scroll() {
                super.scroll();
                System.out.println("scrolling222222.....");
            }
        };
        ball.scroll();
    }
}

class Ball{
    public void scroll(){
        System.out.println("scrolling.....");
    }
}
