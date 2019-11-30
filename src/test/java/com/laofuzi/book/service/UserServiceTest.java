package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testCase() {
        User user =new User();
        user.setActivationCode("1");
        user.setEmail("1");
        user.setHeaderUrl("1");
        user.setPassword("1");
        user.setStatus(1);
        user.setStatus(1);
        user.setType(1);
        user.setSalt("1");
        user.setUsername("1");
        Map<String, Object> map = userService.register(user);
        System.out.println(map);
    }
}

