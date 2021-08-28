package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class Demo01_jdbc {
    public static void main(String[] args) throws Exception{
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //3.获取数据连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wsdm","root","Aiwo0714");

        //4.定义sql语句
        String sql = "select * from sys_user";

        //5.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();

        //6.执行sql
        Boolean count = stmt.execute(sql);

        //7.处理结果
        System.out.println(count);

        //8.释放资源
        stmt.close();
        conn.close();
    }
}
