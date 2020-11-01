package android;

import java.util.LinkedList;
import java.util.Queue;

public class CountNums {

    public static void main(String[] args) {
        int[] datas=new int[6];
        for (int i = 0; i < 6; i++) {
            datas[i]=i+1;
        }
        System.out.println(countNums(datas));
    }

    public static int countNums(int[] datas){
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < datas.length; i++) {
            queue.add(datas[i]);
        }

        //数数
        int count=0;//计数器
        int p=-1;
        while (!queue.isEmpty()){
            p=queue.remove();
            count++;
            if (count % 3!=0) {
                //数到3，出队，否则进队
                queue.add(p);
            }else {
                //出队顺序
                System.out.println(p);
            }
        }

        return p;
    }
}
