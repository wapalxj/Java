package CC162_Decor_pattern;

/**
 * Created by Administrator on 2015/12/1.
 * decor_װ�����ģʽ
 */
public class App {
    public static void main(String[] args) {
        Voice v1=new Voice(100);
        v1.say();

        Amplifier v2=new Amplifier(v1);
        v2.say();
    }
}
