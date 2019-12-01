package com.laofuzi.book.mapper;


import com.laofuzi.book.BookApplication;
import com.laofuzi.book.dao.UserMapper;
import com.laofuzi.book.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectUser() {
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println(user);

        User user2 =new User();
        user2.setActivationCode("1");
        user2.setEmail("1");
        user2.setHeaderUrl("1");
        user2.setPassword("1");
        user2.setStatus(1);
        user2.setStatus(1);
        user2.setType(1);
        user2.setSalt("1");
        user2.setUsername("1");
        userMapper.insert(user2);
    }






}
