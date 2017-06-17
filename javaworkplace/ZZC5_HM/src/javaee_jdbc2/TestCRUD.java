package javaee_jdbc2;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wapal on 2017/5/29.
 *
 */

public class TestCRUD {
    @Test
    public void testQuery(){
        Statement statement=null;
        Connection connection=null;
        ResultSet resultSet=null;
        try {
            connection=DBUtils.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from users");
            List<User> users=new ArrayList<>();
            while (resultSet.next()){
                User user=new User();
                user.setId(resultSet.getInt("id"));
                user.setPwd(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                user.setDate(resultSet.getDate("birthday"));
                users.add(user);
            }
            for (User user:users) {
                System.out.println(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(resultSet,statement,connection);
        }
    }
    @Test
    public void testInsert(){
        PreparedStatement statement=null;
        Connection connection=null;
        try {
            connection=DBUtils.getConnection();
            statement=connection.prepareStatement("INSERT INTO users " +
                    "VALUES (?,?, ?, ?, ?)");

//            int i=statement.executeUpdate("INSERT INTO users " +
//                    "VALUES (4,'tom', '123', 'tom@163.com', '2015-09-28')");
            statement.setInt(1,4);
            statement.setString(2,"tom");
            statement.setString(3,"123");
            statement.setString(4,"tom@163.com");
            statement.setDate(5, new Date(System.currentTimeMillis()));
            int i=statement.executeUpdate();
            if (i>0){
                System.out.println("success");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(null,statement,connection);
        }
    }

    @Test
    public void testUpdate() throws ClassNotFoundException, SQLException {
        PreparedStatement statement=null;
        statement=null;
        Connection connection=null;
        try {
            connection=DBUtils.getConnection();
            statement=connection.prepareStatement("update users set name=?,password=?,email=? where id=?");
            statement.setString(1,"jerry");
            statement.setString(2,"3333");
            statement.setString(3,"jerry@163.com");
            statement.setInt(4,4);
            int i=statement.executeUpdate();
            if (i>0){
                System.out.println("success");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(null,statement,connection);
        }
    }

    @Test
    public void testDelete() throws ClassNotFoundException, SQLException {
        Statement statement=null;
        Connection connection=null;
        try {
            connection=DBUtils.getConnection();
            statement=connection.createStatement();
            int i=statement.executeUpdate("delete from users where id=4");
            if (i>0){
                System.out.println("success");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(null,statement,connection);
        }
    }
}
