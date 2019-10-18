package com.laofuzi.book;


import com.laofuzi.book.dao.UserMapper;
import com.laofuzi.book.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }




}
