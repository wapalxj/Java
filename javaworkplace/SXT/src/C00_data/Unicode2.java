package C00_data;

/**
 * Created by Administrator on 2016/8/25.
 * 字符编码
 *
 *
 * 虽然我们的很多系统支持Unicode编码表，
 * 但是这并不意味这我们能显示一些字符。
 * 比如要显示下面那个字符串System.out.println(zz);显示的就是一个'?'，
 * 这主要是因为字符的显示需要有显示字库的支持，否则还是屏幕上什么都看不到。
 */
public class Unicode2 {
    public static void main(String[] args) {
        char ch='A';
        int Ach=Integer.valueOf(ch);
        //A的字符编码数:65----二进制：1000001----16进制：41
        System.out.println(ch+"的字符编码数:"+Ach+"---二进制："+Integer.toBinaryString(Ach)+"----16进制："+Integer.toHexString(Ach));

        int chA='\u0041';
        System.out.println("'\\u0041是'"+Character.valueOf((char)chA)+"，编码:"+chA);

        //增补字符
    //  char zz='\u1d56b';//char固定为2个字节，这里编译错误，需要下面的方式来获取增补字符
        String zz = new String(Character.toChars(0x1D56B));
        System.out.println("zz.charAt(0)："+zz.charAt(0));//第1个代码单元的内容
        System.out.println("zz.charAt(1)："+zz.charAt(1));//第2个代码单元的内容
        System.out.println(zz.charAt(0)+"代码单元数量为："+zz.length());//一个字符（代码点），2个代码单元

    //判断Unicode 代码点是否在附加级别字符范围内。
        int cp=zz.codePointAt(0);
        if(Character.isSupplementaryCodePoint(cp)){
            System.out.println(zz.charAt(0)+"是增补字符");
            System.out.println(zz.charAt(0)+"的代码点数量为"+zz.codePointCount(0,zz.length()));
        }
    }
}
