package com.laofuzi.book.service;

import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.User;
import com.laofuzi.book.entity.response.UserOrderResponse;

import java.util.List;
import java.util.Map;

public interface UserService {

    //用户登录
    Map<String, Object> login(String username, String password);

    //用户注册
    Map<String, Object> register(User user);

    //查询全部用户
    List<User> selectAll();


    int deleteById(Long id);

    User insert(User record);

    User selectById(Long id);

    List<UserOrderResponse> selectByUserId(User record);

    int updateById(User record);

    int updateByName(User record);

}
