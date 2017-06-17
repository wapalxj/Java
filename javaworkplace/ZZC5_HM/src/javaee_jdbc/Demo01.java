package javaee_jdbc;
import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * Created by wapal on 2017/5/24.
 * JDBC
 */
public class Demo01 {
    /**
     * 不推荐的方式
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        //注册驱动
        DriverManager.registerDriver(new Driver());
        //获取连接connection,使用java的java.sql.Connection接口
        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1",//mydb1数据库
                "root",
                "root");
        //得到执行sql语句的对象Statement
        Statement statement=connection.createStatement();
        //执行sql语句，并返回结果(查询mydb1的emp表)
        ResultSet resultSet=statement.executeQuery("select * from users");

        //处理结果
        while (resultSet.next()){
//            System.out.println(resultSet.getObject(1));
//            System.out.println(resultSet.getObject(2));
//            System.out.println(resultSet.getObject(3));
//            System.out.println(resultSet.getObject(4));
//            System.out.println(resultSet.getObject(5));

            System.out.println(resultSet.getObject("id"));
            System.out.println(resultSet.getObject("password"));
            System.out.println(resultSet.getObject("email"));
            System.out.println(resultSet.getObject("name"));
            System.out.println(resultSet.getObject("birthday"));
            System.out.println("----------------");
        }
        //关闭
        resultSet.close();
        statement.close();
        connection.close();
    }
}
