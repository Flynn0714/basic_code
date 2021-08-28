package Affairs;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class affairs {
    public static void main(String[] args) {
        affair();
    }
    public static void affair(){
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        conn = JDBCUtils.Conn("jdbc:mysql:///stu?useSSL=false","root","Aiwo0714");
        try {
            conn.setAutoCommit(false); //开始事务，参数未false
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql1 = "update account_money set money = money - ? where account = ?";
        String sql2 = "update account_money set money = money + ? where account = ?";
        try {
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);

            pstmt1.setDouble(1,500);
            pstmt1.setString(2,"18317970646");

            pstmt2.setDouble(1,500);
            pstmt2.setString(2,"15070706550");

            //事务更新
            pstmt1.executeUpdate();

//            int i = 1/0; //故意抛出异常

            pstmt2.executeUpdate();

            conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }finally {
                try {
                    pstmt2.close();
                    pstmt1.close();
                    conn.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}

