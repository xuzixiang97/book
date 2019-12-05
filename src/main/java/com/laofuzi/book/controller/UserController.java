package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.entity.User;
import com.laofuzi.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/user")
@CrossOrigin //允许跨域请求
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
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login (@RequestBody User user) {
        // 检查账号,密码
        Map<String, Object> map = userService.login(user.getUsername(), user.getPassword());
        return JSON.toJSONString(map);
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping(path = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String register (@RequestBody User user) {
        Map<String, Object> map = userService.register(user);
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
     * @param
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(){
        List<User> list = userService.selectAll();
        return JSON.toJSONString(list);
    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody User user){
        int i = userService.deleteById(user.getId());
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 查询单个
     * @param user
     * @return
     */
    @RequestMapping(path = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public String findById(@RequestBody User user){
        User record = userService.selectById(user.getId());
        return JSON.toJSONString(record);
    }

}
