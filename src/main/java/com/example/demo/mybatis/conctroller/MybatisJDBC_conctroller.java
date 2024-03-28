package com.example.demo.mybatis.conctroller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/jdbctemp")
public class MybatisJDBC_conctroller {
    @Resource
    @Qualifier("localMysqlDataSource")
    public JdbcTemplate mysqlTemplateLocal;
    //查询
    public String select(){

    }

}
