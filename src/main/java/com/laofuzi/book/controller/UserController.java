package com.laofuzi.book.controller;

import com.laofuzi.book.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
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
    //
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
}
