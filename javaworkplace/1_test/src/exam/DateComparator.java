package exam;

/**
 * Created by Administrator on 2016/5/6.
 */
public class DateComparator {
    public static int compareYear(Date d1,Date d2){
        if (d1.getYear()==d2.getYear()){
            return 0;
        }else if (d1.getYear()<d2.getYear()){
            return -1;
        }else {
            return 1;
        }
    }
}
