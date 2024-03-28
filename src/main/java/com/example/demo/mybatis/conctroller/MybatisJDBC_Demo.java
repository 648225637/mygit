package com.example.demo.mybatis.conctroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class MybatisJDBC_Demo {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/mybatis_demo?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "insert into user(id,name,age)  values('66', '呵呵哒', '999');";
        PreparedStatement pstm = conn.prepareStatement(sql);
        int update = pstm.executeUpdate();
        System.out.println(update);
        pstm.close();
        conn.close();
    }
}

