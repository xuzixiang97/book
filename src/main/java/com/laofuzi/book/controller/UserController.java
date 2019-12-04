package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.entity.User;
import com.laofuzi.book.entity.response.UserOrderResponse;
import com.laofuzi.book.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${server.servlet.context-path}")
    private String contextPath;


    /**
     * 登录
     * @param user
     * @return
     */
    // todo 验证码没加，记住我没加
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login (@RequestBody User user) {
        // 检查账号,密码
        Map<String, Object> map = userService.login(user.getUsername(), user.getPassword());
        return JSON.toJSONString(map);
    }


    /**
     * 修改用户信息(id)
     * @param user
     * @return
     */
    @RequestMapping(path = "/updateById", method = RequestMethod.POST)
    @ResponseBody
    public String updateById(@RequestBody User user){
        int i = userService.updateById(user);
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 修改用户信息(username)
     * @param user
     * @return
     */
    @RequestMapping(path = "/updateByName", method = RequestMethod.POST)
    @ResponseBody
    public String updateByName(@RequestBody User user){
        int i = userService.updateByName(user);
        return JSON.toJSONString(new Result(i>0));
    }


    /**
     * 用户列表（全部）
     * @param user
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(@RequestBody User user){
        List<User> list = userService.selectAll();
        return JSON.toJSONString(list);
    }


    /**
     * 用户id查询订单
     * @param user
     * @return
     */
    @RequestMapping(path = "/selectByUserId", method = RequestMethod.POST)
    @ResponseBody
    public String selectByUserId(@RequestBody User user){
        List<UserOrderResponse> list = userService.selectByUserId(user);
        return JSON.toJSONString(list);
    }
}
