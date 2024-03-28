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
     * @Primary //@Primary是一个Spring Framework的注解，
     * 用于标记一个bean（组件）是首选的bean（组件）。当多个相同类型的bean被定义时，
     * 被标记为@Primary的bean会被优先选择
     * @return
     */
    @Primary
    @Bean(name = "localDataSource")
    @Qualifier("localDataSource")
    @ConfigurationProperties(prefix="spring.datasource.localmysql")
    public DataSource localDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "fwskDataSource")
    @Qualifier("fwskDataSource")
    @ConfigurationProperties(prefix="spring.datasource.fwsk")
    public DataSource fwskDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "localJdbcTemplate")
    public JdbcTemplate localJdbcTemplate(@Qualifier("localDataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "fwskJdbcTemplate")
    public JdbcTemplate fwskJdbcTemplate(@Qualifier("fwskDataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
