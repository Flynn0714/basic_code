package utils;

//import com.mysql.jdbc.ConnectionFeatureNotAvailableException;

import java.sql.*;
import java.util.ArrayList;

public class JDBCUtils {

    /*
    * 获取连接
    * @return 连接对象
    * */
    public static Connection Conn(String db_path,String db_user,String password){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(db_path,db_user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            return conn;
        }
    }

    /*
     * 建立执行sql语句对象Statement
     * @return stmt
     * */
    public static Statement Stmt(Connection conn){
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            return stmt;
        }
    }

    /*
     * 执行sql
     * @return 返回执行结果--增删改
     * */
    public static int JdbcResult(Statement stmt,String SQL){
        Integer result = null;
        try {
            result =  stmt.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (result > 0) {
                System.out.println("执行成功！");
            }else {
                System.out.println("执行失败!");
            }
            return result;
        }
    }

        /*
         * 执行sql
         * @return 返回执行结果--查
         * */
    public static ArrayList<ResultSet> JdbcResult(Statement stmt,String SQL,int i){
        ArrayList<ResultSet> resultSets = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            resultSet =  stmt.executeQuery(SQL);
            while (resultSet.isLast() == false){
                resultSet.next();
//                System.out.println(resultSet);
                resultSets.add(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            return resultSets;
        }
    }

        /*
         * 关闭连接
         * void
         * */
    public static void Close(Statement stmt , Connection conn){
        if (stmt != null){
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

