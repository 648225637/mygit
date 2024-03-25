package com.example.demo.conctroller;

import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注解测试类
 */
@RestController
@RequestMapping("/zhujie")
public class TestZhuJie {
    @Autowired
    private Person person;
    @RequestMapping("/getApplicationConfig")
    public String getApplicationConfig(){
        Person person = new Person();
        System.out.println(person.getAge());
        return "success";
    }
}
