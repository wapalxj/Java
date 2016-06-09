package T16_04_05;

/**
 * Created by Administrator on 2016/4/5.
 * 随机生成100个整数1--9，统计每个数字出现概率
 */
    public class Test1 {
    public static void main(String[] args) {
        int num[] =new int[10];

        for (int i=0;i<100;i++){
            int temp=(int)(Math.random()*9)+1;//1--9
            num[temp]++;
        }
        for (int i=1;i<10;i++){
            System.out.println(i+"出现的概率是："+num[i]+"%");
        }

    }
}
