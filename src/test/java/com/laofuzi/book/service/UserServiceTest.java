package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testCase() {
//        //用户注册测试
//        User user =new User();
//        user.setActivationCode("1");
//        user.setEmail("1");
//        user.setHeaderUrl("1");
//        user.setPassword("1");
//        user.setStatus(1);
//        user.setStatus(1);
//        user.setType(1);
//        user.setSalt("1");
//        user.setUsername("2");
//        Map<String, Object> map = userService.register(user);
//        System.out.println(map);
//        //用户登录测试
//         Map<String, Object> login = userService.login("1","1");
//        System.out.println(login);
        //用户删除测试
//        int delete = userService.deleteById(1L);
//        System.out.println(delete);
//        //用户更新测试
//        user.setEmail("2");
//        int update = userService.updateById(user);
//        System.out.println(update);
        //用户选择全部测试
        List<User> selectall = userService.selectAll();
        System.out.println(selectall);
    }
}

