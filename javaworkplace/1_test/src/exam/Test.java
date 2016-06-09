package exam;

/**
 * Created by Administrator on 2016/5/6.
 */
public class Test {
    public static void main(String[] args) {
        Date d1=new Date();
        Date d2=new Date();
        d1.setYear(2000);
        d2.setYear(2300);
        System.out.println(d1.isLeapYear());
        System.out.println(d2.isLeapYear());
        System.out.println(DateComparator.compareYear(d1,d2));
    }
}
