package three;

import java.lang.reflect.Field;

public class Reflect {

    public final int age=1;

    public int getAge() {
        //内联：编译优化：这里在class文件中，直接是  return 1;
        return age;
    }


    public static void main(String[] args) throws Exception {
        Reflect reflectTest=new Reflect();
        Field fi=Reflect.class.getDeclaredField("age");
        fi.setAccessible(true);
        fi.set(reflectTest,222);
        //1
        System.out.println(reflectTest.getAge());
        //1
        System.out.println(reflectTest.age);

    }
}
