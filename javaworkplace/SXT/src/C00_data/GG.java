package C00_data;

/**
 * Created by Administrator on 2016/5/27.
 * 成员变量自动初始化
 */
public class GG {
    private int i;
    private double d;
    private boolean b;
    private int [] arr;//null
    public static void main(String[] args) {
        new GG();
    }

    public GG(){
        System.out.println(this.i);
        System.out.println(this.d);
        System.out.println(this.b);
        System.out.println(arr[1]);//运行出错
    }
}
