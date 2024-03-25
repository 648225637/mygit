package com.example.demo.testUser;


import com.example.demo.DemoApplication;
import com.example.demo.services.UsertServicesTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//junit5 之后可以不引入此注解
//当测试包和启动类在同一包下，下面的注解是不需要指定的
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceJuint {
    @Autowired
    private UsertServicesTest userService;
    //注意，要对测试方法加上@Test注解
    @Test
    public void testAdd() {
        userService.insert();
    }


}
