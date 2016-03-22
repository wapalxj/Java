package softInternation;

/**
 * Created by Administrator on 2016/3/22.
 * 判断是不是数字
 */
public class TestDigit {
    public static void main(String[] args) {
        String str="s1s2s3sw";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            boolean d=Character.isDigit(c);
            System.out.println(c+"是数字："+d);
        }
    }

}
