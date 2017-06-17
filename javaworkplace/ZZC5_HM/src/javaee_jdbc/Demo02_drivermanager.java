package javaee_jdbc;

import java.sql.*;
import java.util.Properties;

/**
 * Created by wapal on 2017/5/25.
 */
public class Demo02_drivermanager {
    public void test() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接connection,使用java的java.sql.Connection接口
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                "root",
                "root");
        //3.得到执行sql语句的对象Statement
        Statement statement = connection.createStatement();
        //4.执行sql语句，并返回结果(查询mydb1的emp表)
        ResultSet resultSet = statement.executeQuery("select * from emp");

        //处理结果
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
            System.out.println(resultSet.getObject(4));
            System.out.println(resultSet.getObject(5));
            System.out.println("----------------");
        }
        //关闭
        resultSet.close();
        statement.close();
        connection.close();
    }

    /**
     * 连接重载2-getConnection变化
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void test2() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        Properties info = new Properties();
        info.put("root","root");
        info.setProperty("user","root");
        info.setProperty("password","root");

        //2.获取连接connection,使用java的java.sql.Connection接口
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                info);
        //3.得到执行sql语句的对象Statement
        Statement statement = connection.createStatement();
        //4.执行sql语句，并返回结果(查询mydb1的emp表)
        ResultSet resultSet = statement.executeQuery("select * from emp");

        //处理结果
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
            System.out.println(resultSet.getObject(4));
            System.out.println(resultSet.getObject(5));
            System.out.println("----------------");
        }
        //关闭
        resultSet.close();
        statement.close();
        connection.close();
    }
    /**
     * 连接重载3-getConnection变化
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void test3() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接connection,使用java的java.sql.Connection接口
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1?user=root&password=root"
                );
        //3.得到执行sql语句的对象Statement
        Statement statement = connection.createStatement();
        //4.执行sql语句，并返回结果(查询mydb1的emp表)
        ResultSet resultSet = statement.executeQuery("select * from emp");
        //处理结果
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
            System.out.println(resultSet.getObject(4));
            System.out.println(resultSet.getObject(5));
            System.out.println("----------------");
        }
        //关闭
        resultSet.close();
        statement.close();
        connection.close();
    }
}
