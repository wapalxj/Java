/**
 * Created by Administrator on 2016/3/13.
 * 特殊情况。当父类show()为private时
 */
public class OOP {
}
class TV{
    private void show(){
        System.out.println("TV");
    }
    public static void main(String[] args) {
        TV tv = new LeTV();
        ((LeTV)tv).show();
        tv.show();//TV类中有private的方法时，优先使用
    }
}
class LeTV extends TV{
    public void show(){
        System.out.println("LeTV");
    }
}


