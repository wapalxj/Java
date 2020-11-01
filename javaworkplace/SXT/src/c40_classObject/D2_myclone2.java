package c40_classObject;

import java.io.*;

/**
 * Created by wapal on 2017/7/11.
 * 自定义的clone()
 */
public class D2_myclone2 {
    public static void main(String[] args) {
        Student s1=new Student(5);
        Student s2= (Student) s1.clone();
        System.out.println(s2.age);
        System.out.println(s1+""+s2);
    }

    static class Student extends CloneObj {
        public int age=3;

        public Student(int age) {
            this.age = age;
        }
    }
    static class CloneObj implements Cloneable,Serializable{
        @Override
        protected Object clone() {
            Object obj=null;
            //将对象写到文件
//            try {
//                FileOutputStream fos=new FileOutputStream("data.ser");
//                ObjectOutputStream oos=new ObjectOutputStream(fos);
//                //把当前对象写到文件中
//                oos.writeObject(this);
//                //从文件中读取
//                FileInputStream fis=new FileInputStream("data.ser");
//                ObjectInputStream ois=new ObjectInputStream(fis);
//                obj=ois.readObject();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }

            //更好的做法:将对象写到内存
            try {
                ByteArrayOutputStream os=new ByteArrayOutputStream();
                ObjectOutputStream oos=new ObjectOutputStream(os);
                oos.writeObject(this);
                byte[] byteArray=os.toByteArray();
                ByteArrayInputStream is=new ByteArrayInputStream(byteArray);
                ObjectInputStream ois=new ObjectInputStream(is);
                obj=ois.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return obj;
        }
    }
}


