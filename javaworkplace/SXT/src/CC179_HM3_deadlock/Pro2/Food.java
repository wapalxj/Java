package CC179_HM3_deadlock.Pro2;

/**
 * Created by Administrator on 2016/6/10.
 */
public class Food {
    private String name;
    private int price;

    public Food(){

    }
    public Food(String name,int price){
       setName(name);
       setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
