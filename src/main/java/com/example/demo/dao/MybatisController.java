package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {
    @Autowired("/getJsonTest")
    public String getJsonTest(){
        return "1234567890";
    }
}
