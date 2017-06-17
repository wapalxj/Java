package javaee_jdbc3_login;


import java.util.Scanner;

/**
 * Created by wapal on 2017/5/29.
 */
public class Login {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name=in.nextLine().trim();
        System.out.println("请输入密码：");
        String pwd=in.nextLine().trim();
        User user=new DoLogin().findUser(name,pwd);
        if (user!=null){
            System.out.println("欢迎！"+user.getName());
        }else {
            System.out.println("用户名或密码错误！");
        }
    }
}
