package javaee_jdbc3_login;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * Created by wapal on 2017/5/29.
 * //参数都写在配置文件中去
 */
public class DBUtils {
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    //静态块加载参数
    static {
        ResourceBundle rb=ResourceBundle.getBundle("dbinfo");
        driverClass=rb.getString("driverClass");
        url=rb.getString("url");
        username=rb.getString("username");
        password=rb.getString("password");
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //得到连接的方法
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection=null;
        connection =DriverManager.getConnection(url,username,password);
        return connection;
    }
    //关闭资源
    public static void closeAll(ResultSet resultSet,
                                Statement statement,Connection connection) {
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
