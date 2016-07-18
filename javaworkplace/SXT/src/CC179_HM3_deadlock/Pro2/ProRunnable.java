package CC179_HM3_deadlock.Pro2;

import java.util.List;

/**
 * 生产者执行目标
 * Created by Administrator on 2016/6/10.
 */
public class ProRunnable implements Runnable {
    private List<Food> foods;
    private Food food=new Food();
    public ProRunnable(List<Food> foods){
        this.foods=foods;
    }
    //定义标量，每次标记不同的人
    int x=0;
    @Override
    public void run() {
        while (true){
            if (x%2==0){
                food.setName("包子2");
                food.setPrice(2);
                foods.add(food);
            }else {
                food.setName("馒头1");
                food.setPrice(1);
                foods.add(food);
            }
            x++;
        }
    }
}
