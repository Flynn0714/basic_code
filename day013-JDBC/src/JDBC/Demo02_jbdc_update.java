package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02_jbdc_update {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;

        //1.注册驱动
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            String sql = "insert into teacher values(1023,'哈士奇')";
//            String sql = "update teacher set name = '阿拉斯加' where id = 1023";
            String sql = "delete from teacher where id = 1023";
            conn = DriverManager.getConnection("jdbc:mysql:///stu?useUnicode=true&characterEncoding=UTF-8", "root", "Aiwo0714");
            stmt = conn.createStatement();
            int Count = stmt.executeUpdate(sql);
            if (Count>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (stmt != null){
                try{
                    stmt.close();
                    conn.close();
                }catch (Exception e){
                    System.out.println(e);
                }

            }
        }
    }
}
