package javaee_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wapal on 2017/5/25.
 */

public class Demo03_crud {
    /**
     * query数据
     */
    public void testQuery() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接connection,使用java的java.sql.Connection接口
        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                "root",
                "root");
        //3.得到执行sql语句的对象Statement
        Statement statement = connection.createStatement();
        //4.执行sql语句，并返回结果(查询mydb1的emp表)
        ResultSet resultSet=statement.executeQuery("select id,password,email,name,birthday from users");
        List<User> users=new ArrayList<>();
        //处理结果
        while (resultSet.next()){
            User user=new User();
            user.setId(resultSet.getInt("id"));
            user.setPwd(resultSet.getString("password"));
            user.setEmail(resultSet.getString("email"));
            user.setName(resultSet.getString("name"));
            user.setDate(resultSet.getDate("birthday"));
            users.add(user);
        }
        resultSet.close();
        statement.close();
        connection.close();

        for (User user:users) {
            System.out.println(user);
        }
    }
    /**
     * 插入数据
     */
    public void testInsert() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接connection,使用java的java.sql.Connection接口
        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                "root",
                "root");
        //3.得到执行sql语句的对象Statement
        Statement statement = connection.createStatement();
        //4.执行sql语句，并返回结果(查询mydb1的emp表)
        int i=statement.executeUpdate("INSERT INTO users (name, password,email, birthday) " +
                "VALUES ('tom', '123', 'tom@163.com', '2015-09-28')");
        if (i>0){
            System.out.println("success");
        }else {
            //要么成功，要么异常，不存在else的情况
        }
        statement.close();
        connection.close();
    }
    /**
     * 更改数据
     */
    public void testUpdate() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接connection,使用java的java.sql.Connection接口
        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                "root",
                "root");
        //3.得到执行sql语句的对象Statement
        Statement statement = connection.createStatement();
        //4.执行sql语句，并返回结果(查询mydb1的emp表)
        int i=statement.executeUpdate("update users set name='jerry',password='333'," +
                "email='jerry@163.com' where id=5");
        if (i>0){
            System.out.println("update success");
        }else {
            System.out.println("update failed");
        }
        statement.close();
        connection.close();
    }
    /**
     * 删除数据
     */
    public void testDelete() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接connection,使用java的java.sql.Connection接口
        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                "root",
                "root");
        //3.得到执行sql语句的对象Statement
        Statement statement = connection.createStatement();
        //4.执行sql语句，并返回结果(查询mydb1的emp表)
        int i=statement.executeUpdate("delete from users where id=5");
        if (i>0){
            System.out.println("delete success");
        }else {
            System.out.println("delete failed");
        }
        statement.close();
        connection.close();
    }
}
