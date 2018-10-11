package com.niuzj;

import com.niuzj.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/spring-config.xml", "classpath:META-INF/spring/dubbo-consumer.xml"})
public class Test01 {

    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        System.out.println(userService.getUsername());
    }
}
