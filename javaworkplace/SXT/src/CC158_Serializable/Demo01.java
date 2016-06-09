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
    //�����л�
    public static void read(String destPath) throws IOException, ClassNotFoundException {
        //����Դ
        File src =new File(destPath);
        //ѡ������ObjectInputStream
        ObjectInputStream dis =new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(src))
        );
        //����:��ȡ��˳�������д��һ�£����ұ�����ڣ�,��һ�¿��ܻ��������

        Object obj=dis.readObject();
        if (obj instanceof Employee){
            Employee em=(Employee)obj;
            System.out.println("name: " +em.getName() + " " + "salary: " +em.getSalary());
        }

        int arr[]=(int [])dis.readObject();
        System.out.println("arr: "+ Arrays.toString(arr));
         dis.close();


    }
    //���л�
    public static void seri(String destPath) throws IOException {
        Employee employee=new Employee("vero",10000);
        int a[]={1,2,5};//����������л�
        //����Դ
        File dest =new File(destPath);
        //ѡ������DataOutputStream
        ObjectOutputStream dos =new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dest))
        );
        //����
        dos.writeObject(employee);
        dos.writeObject(a);
        dos.flush();
        dos.close();
    }
}

