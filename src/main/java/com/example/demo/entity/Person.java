package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 不可单独使用 会报错没有通过@EnableConfigurationProperties这个注解进行注册或者没有标记为Spring的组件
 * 1.通过@Component这个注解将该类标记为Spring的组件
 * 2.通过@EnableConfigurationProperties这个注解将该类注册为属性配置的类
 */
@Component
@ConfigurationProperties(prefix = "person2")
public class Person {
    private String name;
    private String age;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
