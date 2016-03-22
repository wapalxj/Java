package ali;

/**
 * Created by Administrator on 2016/3/16.
 */
public class Test {
    public static void main(String[] args) {
        int [] d=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(bsearch(d,0,8,4));
    }
    public static int bsearch(int[] data, int x, int y, int v) {
        int m;
        while (x < y) { //1 
            m = x + (y - x) / 2; //2 
            if (data[m] == v) return m;//3
            else if(data[m] > v) y = m; //4
            else x = m; //5    

        }
        return -1; //6
    }
}
