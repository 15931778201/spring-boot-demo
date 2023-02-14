package com.example.springbootaction;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootActionApplicationTests {
    private static final Logger log = (Logger) LoggerFactory.getLogger(SpringbootActionApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() throws Exception {
        final int row1 = userMapper.insert(new User("u1", "p1"));
        log.info("[添加结果] - [{}]");
        final int row2 = userMapper.insert(new User("u2","p2"));
        log.info("[添加结果] - [{}]");
        final int row3 = userMapper.insert(new User("u1", "p3"));
        log.info("[添加结果] - [{}]");
        final List<User> u1 = userMapper.findByUsername("u1");
        log.info("[根据用户名查询] - [{}]");
    }

}
