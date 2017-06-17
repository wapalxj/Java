package javaee_jdbc;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * Created by wapal on 2017/5/24.
 * 在finally关闭资源
 */
public class Demo04_close {
    public static void main(String[] args) {
        Statement statement=null;
        Connection connection=null;
        ResultSet resultSet=null;
        //注册驱动
        try {
            //不推荐的加载方式
            DriverManager.registerDriver(new Driver());

            //获取连接connection,使用java的java.sql.Connection接口
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                    "root",
                    "root");
            //得到执行sql语句的对象Statement
            statement = connection.createStatement();
            //执行sql语句，并返回结果(查询mydb1的emp表)
            resultSet= statement.executeQuery("select * from users");

            //处理结果
            while (resultSet.next()) {
                System.out.println(resultSet.getObject("id"));
                System.out.println(resultSet.getObject("password"));
                System.out.println(resultSet.getObject("email"));
                System.out.println(resultSet.getObject("name"));
                System.out.println(resultSet.getObject("birthday"));
                System.out.println("----------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭
                try {
                    if (resultSet!=null) {
                        resultSet.close();
                        resultSet=null;
                    }
                    if (statement!=null) {
                        statement.close();
                        statement=null;
                    }
                    if (connection!=null) {
                        connection.close();
                        connection=null;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }

    }
}
