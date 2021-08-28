package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class test_JDBCUtils {
    public static void main(String[] args) {
        Connection conn = JDBCUtils.Conn("jdbc:mysql:///stu","root","Aiwo0714");
        Statement stmt = JDBCUtils.Stmt(conn);
        ArrayList<ResultSet> result = JDBCUtils.JdbcResult(stmt,"select * from teacher",1);
        for(ResultSet resultSet:result){
            try {
                System.out.println(resultSet.getInt(1)+ " " +resultSet.getString(2));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JDBCUtils.Close(stmt,conn);
    }
}
