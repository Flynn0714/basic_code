package Druid;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druidDemo01 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        Properties po = new Properties();
        InputStream resourceAsStream = druidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");
        po.load(resourceAsStream);
        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(po);
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
}
