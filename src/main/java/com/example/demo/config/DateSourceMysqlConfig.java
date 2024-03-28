package com.example.demo.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DateSourceMysqlConfig {


    /**
     * //@Primary是一个Spring Framework的注解，
     * 用于标记一个bean（组件）是首选的bean（组件）。当多个相同类型的bean被定义时，
     * 被标记为@Primary的bean会被优先选择
     */
    @Primary
    @Bean(name = "localMysqlDataSource")
    @Qualifier("localMysqlDataSource")
    @ConfigurationProperties(prefix="spring.datasource.localmysql")
    public DataSource localMysqlDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "localOracleDataSource")
    @Qualifier("localOracleDataSource")
    @ConfigurationProperties(prefix="spring.datasource.localoracle")
    public DataSource localOracleDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "localMysqlJdbcTemplate")
    public JdbcTemplate localMysqlJdbcTemplate(@Qualifier("localMysqlDataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "localOracleJdbcTemplate")
    public JdbcTemplate localOracleJdbcTemplate(@Qualifier("localOracleDataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
