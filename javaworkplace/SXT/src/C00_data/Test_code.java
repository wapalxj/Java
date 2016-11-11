package C00_data;

/**
 * Created by Administrator on 2016/8/30.
 * 进制问题
 *
 * 二进制显示的是补码，计算机接收的直接量也是补码
 */
public class Test_code {
    public static void main(String[] args) {
        /*
            二进制显示的是补码，计算机接收的直接量也是补码
         */
        byte a=-5;
        System.out.println("a:"+a);
        System.out.println("a的二进制:"+Integer.toBinaryString(a));

        byte b=(byte)0xff;
        System.out.println("b:"+b);
        System.out.println("b的二进制:"+Integer.toBinaryString(b));

        byte c=-1;
        System.out.println("c:"+c);
        System.out.println("c的二进制:"+Integer.toBinaryString(c));

        //二进制转换为10进制，字符串第一位可以为-号
        //这种方式字符串中为原码
        String cc="-111";
        int d = Integer.parseInt(cc, 2); // 2进制
        System.out.println("d:"+d);

        /**
            byte short通过算数运算和逻辑运算结果都会是int
         */
        byte b1=1;
        short s1=2;

//        short ss=b1+1;//编译出错
//        short ss=s1+1;//编译出错
//        short ss=b1+s1;//编译出错
        int i=b1+s1;
        /**
         * 移位运算
         */
        byte b2=3;
        b2<<=1;
        System.out.println("b2<<=1-->"+b2);

        /**
         *127+1=-128
         */
        byte b3=127;
        b3++;
        System.out.println("127+1="+b3);

    }
}
