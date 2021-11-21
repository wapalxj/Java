package c1_6_xuliehua.xuliehuademo01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Externalizable 接口的作用
 */
public class demo06 {

    static class User implements Externalizable {
        //必须要一个public的无参构造函数
        public User(){
            System.out.println("Externalizable User()");

        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String name;
        public int age;


        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(name);
            out.writeInt(age);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
          name = (String)in.readObject();
          age = in.readInt();
        }
    }

    public static String basePath = System.getProperty("user.dir") + "\\";
    public static String tmp = "src/c1_6_xuliehua/xuliehuademo01/";

    public static void main(String[] args) {
        ExternalableTest();
    }

    private static void ExternalableTest() {
        User user = new User("zero", 18);
//        System.out.println("1: " + user);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        ObjectOutputStream oos = null;
//        byte[] userData = null;
//        try {
//            oos = new ObjectOutputStream(out);
//            oos.writeObject(user);
//            userData = out.toByteArray();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        ObjectInputStream ois = null;
//        try {
//            ois = new ObjectInputStream(new ByteArrayInputStream(userData));
//            user = (User)ois.readObject();
//            System.out.println("反序列化后 2: " + user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        //和Demo01一样
//        SerializeableUtils.saveObject(user,tmp+"aeee.out");
//        System.out.println("1: " + user);
//
        user = SerializeableUtils.readObject(tmp+"aeee.out");
        System.out.println("反序列化： 2: " + user);
    }

}