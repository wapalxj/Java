package c38_inher;


import java.sql.SQLSyntaxErrorException;

/**
 * Created by Administrator on 2016/3/26.
 * instanceof 多态
 */
public class Test4 {
    public static void main(String[] args) {
//        System.out.println(test(new Object()));
//        System.out.println(test(new Wanju()));

        String [] ssss={"qwe","rtu","fd","fdf"};
        String str="fd";
        boolean isFound=false;//初始设置为false,因为还没开始找
        for (int i=0;i< ssss.length;i++){
            if (ssss[i].equals(str)){
                isFound=true;//找到设置为true
                break;
            }
        }
        if (isFound){//不是true就是没有找到
            System.out.println("The name"+str+"was found.");

        }else {
            System.out.println("The name"+str+"was not found.");
        }




    }
    public static boolean test(Object o){
        return (o instanceof Wanju);
    }
}

class Wanju{

}