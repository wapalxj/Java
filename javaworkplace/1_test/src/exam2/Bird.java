package exam2;

/**
 * Created by Administrator on 2016/5/6.
 */
public class Bird extends Animal{

    public Bird(String name){
        setName(name);
        setDescription("Iam a bird,I am moving through flying");
    }
    @Override
    public void move() {
        System.out.println("i am swimming");
    }
}
