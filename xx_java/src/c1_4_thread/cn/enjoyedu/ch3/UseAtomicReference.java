package c1_4_thread.cn.enjoyedu.ch3;

import java.util.concurrent.atomic.AtomicReference;

/**
 *类说明：演示引用类型的原子操作类
 */
public class UseAtomicReference {
    static AtomicReference<UserInfo> sAtomicReference;
    public static void main(String[] args) {
        //要修改的实体的实例
        UserInfo user = new UserInfo("Vero", 15);
        sAtomicReference =new AtomicReference<>(user);
        UserInfo updateUser = new UserInfo("Vnix", 17);
        //更改,这里内部更改了对象的引用
        sAtomicReference.compareAndSet(user,updateUser);

        System.out.println(sAtomicReference.get());
        System.out.println(user);
    }
    
    //定义一个实体类
    static class UserInfo {
        private String name;
        private int age;
        public UserInfo(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
