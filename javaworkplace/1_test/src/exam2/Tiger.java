package exam2;

/**
 * Created by Administrator on 2016/5/6.
 */
public class Tiger extends Animal {

    public Tiger(String name){
        setName(name);
        setDescription("Iam a tiger,I am moving through running");
    }
    @Override
    public void move() {
        System.out.println("running!!!");
    }
}
