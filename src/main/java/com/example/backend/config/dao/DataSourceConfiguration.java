package com.example.backend.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
@MapperScan("com.example.backend.main.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUser;
    @Value("${jdbc.password}")
    private String jdbcPassword;


    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //设置驱动
        dataSource.setDriverClass(jdbcDriver);
        //设置url
        dataSource.setJdbcUrl(jdbcUrl);
        //设置用户名
        dataSource.setUser(jdbcUser);
        //设置密码
        dataSource.setPassword(jdbcPassword);
        //设置连接池关闭后是否自动提交,否
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}