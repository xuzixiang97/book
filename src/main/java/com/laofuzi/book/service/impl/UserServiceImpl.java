package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.UserMapper;
import com.laofuzi.book.entity.User;
import com.laofuzi.book.service.UserService;
import com.laofuzi.book.util.BookUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> login(String username, String password) {
        Map<String, Object> map = new HashMap<>();

        // 空值处理
        if (StringUtils.isBlank(username)) {
            map.put("usernameMsg", "账号不能为空!");
            return map;
        }
        if (StringUtils.isBlank(password)) {
            map.put("passwordMsg", "密码不能为空!");
            return map;
        }

        // 验证账号
        User user = userMapper.selectByName(username);
        if (user == null) {
            map.put("usernameMsg", "该账号不存在!");
            return map;
        }

        // 验证密码
        if (!user.getPassword().equals(password)) {
            map.put("passwordMsg", "密码不正确!");
            return map;
        }

        // 生成登录凭证
        String loginTicket = BookUtil.generateUUID();
        map.put("ticket", loginTicket);

        return map;
    }

    @Override
    public Map<String, Object> register(User user) {
        Map<String, Object> map = new HashMap<>();
        int insert = userMapper.insert(user);
        if(insert > 0 ){
            map.put("Msg", "注册成功!");
            return map;
        }else{
            map.put("Msg", "注册失败!");
            return map;
        }
    }
}
