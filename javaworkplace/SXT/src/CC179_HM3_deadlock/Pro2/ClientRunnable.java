package CC179_HM3_deadlock.Pro2;

import java.util.ArrayList;
import java.util.List;

/**
 * 消费者执行目标
 * Created by Administrator on 2016/6/10.
 */
public class ClientRunnable implements Runnable{
    List<Food> foods;

    public ClientRunnable(List<Food> foods){
        this.foods=foods;
    }

    @Override
    public void run() {
        while (true){
            Food food=foods.get(foods.size()-1);
            System.out.println("name:"+food.getName()+"---->price:"+food.getPrice());
        }
    }
}
