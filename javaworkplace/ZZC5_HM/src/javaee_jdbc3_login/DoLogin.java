package javaee_jdbc3_login;

import java.sql.*;

/**
 * Created by wapal on 2017/5/29.
 */
public class DoLogin {
    public User findUser(String name,String pwd){
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        User user=null;
        try {
            connection=DBUtils.getConnection();
            String sql="select * from users where name = ? and password = ?";
            //预编译sql语句
            statement=connection.prepareStatement(sql);
            //给？赋值
            statement.setString(1,name);
            statement.setString(2,pwd);
            resultSet=statement.executeQuery();
            if (resultSet.next()){
                user=new User();
                user.setId(resultSet.getInt("id"));
                user.setPwd(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                user.setDate(resultSet.getDate("birthday"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(resultSet,statement,connection);
        }
        return user;
    }
}
