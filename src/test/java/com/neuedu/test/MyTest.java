package com.neuedu.test;

/**
 * Created by guojiacheng on 2019/4/1.
 */
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import com.neuedu.util.DESUTIL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {
    @Resource
    UserService userService;
    @Test
    public void method(){
        User user = new User();
        user.setName("郭嘉诚");
        user.setPassword(DESUTIL.encode("123456"));
        user.setLoginId("admin");
        user.setPhone("13935637109");
        user.setSex(1);
        user.setCreateDate(new Date());
        user.setEmail("m13935637109@163.com");
        System.out.println(userService.add(user));
    }
}
