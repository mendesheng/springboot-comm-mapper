package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommMapperApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println(userMapper.selectAll());
    }

    @Test
    public void t1() {
        User u = new User(null, "haha");
        System.out.println(userMapper.select(u));
    }

    @Test
    public void t2() {
    }

    @Test
    public void t3() {
        System.out.println(userMapper.selectAll());
    }



}

