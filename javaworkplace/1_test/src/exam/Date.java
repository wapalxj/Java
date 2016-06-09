package exam;

/**
 * Created by Administrator on 2016/5/6.
 */
public class Date {
    private int month;
    private int day;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if ((year%4==0) && (year%100!=0)){
            return true;
        }else if (year%400==0){
            return true;
        }
        return false;
    }
}

