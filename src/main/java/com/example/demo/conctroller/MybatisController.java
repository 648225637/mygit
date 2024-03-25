package com.example.demo.conctroller;

import com.example.demo.entity.AppYmlBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller和@RestController注解的区别。@Controller控制器，处理http请求。
 * @RestController注解相当于@ResponseBody+@Controller合在一起的作用,
 * RestController使用的效果是将方法返回的对象直接在浏览器上展示成json格式.
 *
 */
@RestController
public class MybatisController {
    // 引入配置文件中变量
    //@Autowired
    private Environment env;

    @Value("${name}")
    public String name;
    @Value("${person.name}")
    public String perName;


    @RequestMapping("/getJsonTest")
    public String getJsonTest(){
        //本地变量赋值ctrl+alt+v  == eclipse ctrl+2
        AppYmlBean appYmlBean = new AppYmlBean();
        //String name = appYmlBean.getEnv().getProperty("name");
        // 引入配置文件中变量
        System.out.println(env.getProperty("name"));
        System.out.println(appYmlBean.getName());
        System.out.println(appYmlBean.getPerName());
        System.out.println(name);
        System.out.println(perName);

        return "1234567890";
    }
}
