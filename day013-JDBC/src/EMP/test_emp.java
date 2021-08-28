package EMP;

import java.sql.*;
import java.util.ArrayList;

public class test_emp {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        ArrayList<emp> emps = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            try {
                conn = DriverManager.getConnection("jdbc:mysql:///mysite","root","Aiwo0714");
                stmt = conn.createStatement();
                resultSet = stmt.executeQuery("select * from app01_userinfo");

                //处理结果
                while (resultSet.isLast() == false){
                    resultSet.next();
                    emps.add(new emp(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5)));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (stmt != null){
                try {
                    resultSet.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
        for(emp emp:emps){
            System.out.println(emp.getNid()+" " + emp.getUsername() + " " + emp.getPassword() + " " + emp.getAge() + " " + emp.getUG_id());
        }
        System.out.println(emps);
    }
}
