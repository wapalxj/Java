package CC158_Serializable;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Administrator on 2015/12/1.
 */
public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        seri("F:/others/seri.txt");
            read("F:/others/seri.txt");
    }
    //反序列化
    public static void read(String destPath) throws IOException, ClassNotFoundException {
        //创建源
        File src =new File(destPath);
        //选择流：ObjectInputStream
        ObjectInputStream dis =new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(src))
        );
        //操作:读取的顺序必须与写出一致（并且必须存在）,不一致可能会出现问题

        Object obj=dis.readObject();
        if (obj instanceof Employee){
            Employee em=(Employee)obj;
            System.out.println("name: " +em.getName() + " " + "salary: " +em.getSalary());
        }

        int arr[]=(int [])dis.readObject();
        System.out.println("arr: "+ Arrays.toString(arr));
         dis.close();


    }
    //序列化
    public static void seri(String destPath) throws IOException {
        Employee employee=new Employee("vero",10000);
        int a[]={1,2,5};//数组可以序列化
        //创建源
        File dest =new File(destPath);
        //选择流：DataOutputStream
        ObjectOutputStream dos =new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dest))
        );
        //操作
        dos.writeObject(employee);
        dos.writeObject(a);
        dos.flush();
        dos.close();
    }
}

