package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class Demo03_jbdc_resultMap {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        //1.设置驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");

        //2.建立连接
            try {
                connection = DriverManager.getConnection("jdbc:mysql:///stu","root","Aiwo0714");
            //3.游标
                statement = connection.createStatement();

            //4.执行sql
                resultSet = statement.executeQuery("select * from teacher");
                while (resultSet.isLast() == false){
                    resultSet.next();
                    System.out.println(resultSet.getInt(1)+ " " + resultSet.getString("name"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
