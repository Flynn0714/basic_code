package Login;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
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
        Statement stmt = null;
        if (username != null && password != null){
            conn = JDBCUtils.Conn("jdbc:mysql:///stu?useSSL=false","root","Aiwo0714");
            try {
                stmt = conn.createStatement();
                userinfo = stmt.executeQuery("select * from user where username = '"+username+"' and password = '"+password+"'");
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
                JDBCUtils.Close(stmt,conn);
            }
        }else{
            return false;
        }

    }
}
