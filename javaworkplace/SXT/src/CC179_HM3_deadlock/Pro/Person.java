package CC179_HM3_deadlock.Pro;

/**
 * Created by Administrator on 2016/6/10.
 *定义标志：ture:有数据，只能消费，false:没有数据，只能生产
 */
public class Person {
    private String name;
    private int age;

    boolean flag;

    public Person(){

    }
    public Person(String name,int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
