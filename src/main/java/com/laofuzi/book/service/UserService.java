package com.laofuzi.book.service;

import com.laofuzi.book.entity.User;

import java.util.Map;

public interface UserService {

    //用户登录
    Map<String, Object> login(String username, String password);

    //用户注册
    Map<String, Object> register(User user);


}
