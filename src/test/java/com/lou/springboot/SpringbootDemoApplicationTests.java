package com.lou.springboot;

import com.mysql.cj.conf.ConnectionPropertiesTransform;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringbootDemoApplicationTests {
    @Autowired
    private DataSource dataSource;
    @Test
    public void datasourceTest()throws SQLException{
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection != null);
//        connection.close();
        System.out.println("默认数据源为:"+dataSource.getClass());
    }
//    @Test
//    void contextLoads() {
//    }


}
