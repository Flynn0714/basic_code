package Pstmt;

import utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class Pstmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        String password = scanner.next();
        if (login(username,password)){
            System.out.println("登录成功！");
        }else {
            System.out.println("账号或密码错误，登入失败！");
        }
    }

    public static Boolean login(String username, String password){
        Connection conn = null;
        ResultSet userinfo = null;
        PreparedStatement pstmt = null;
        if (username != null && password != null){
            conn = JDBCUtils.Conn("jdbc:mysql:///stu?useSSL=false","root","Aiwo0714");
            try {
                String sql = "select * from user where username = ? and password = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,username);
                pstmt.setString(2,password);
                userinfo = ((PreparedStatement) pstmt).executeQuery();
                return userinfo.next();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }finally {
                try {
                    userinfo.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                JDBCUtils.Close(pstmt,conn);
            }
        }else{
            return false;
        }

    }
}
