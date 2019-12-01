package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.entity.User;
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
     * 登录功能
     * @param username
     * @param password
     * @param model
     * @param response
     * @return
     */
    // todo 验证码没加，记住我没加
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login (String username, String password,
                         Model model, HttpServletResponse response) {


        // 检查账号,密码
        Map<String, Object> map = userService.login(username, password);
        if (map.containsKey("ticket")) {
            Cookie cookie = new Cookie("ticket", map.get("ticket").toString());
            cookie.setPath(contextPath);
            StringBuffer stringBuffer = new StringBuffer();

            // todo 设一个常量保存记住我状态
            cookie.setMaxAge(3600 * 12);
            response.addCookie(cookie);
            return "redirect:/index";
        } else {
            model.addAttribute("usernameMsg", map.get("usernameMsg"));
            model.addAttribute("passwordMsg", map.get("passwordMsg"));
            return "/site/login";

        }
    }


    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody User user){
        int i = userService.updateById(user);
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
     * 注册用户
     * @param user
     * @return
     */
    @RequestMapping(path = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody User user){
        Map<String, Object> register = userService.register(user);
        return JSON.toJSONString(register);
    }
}
