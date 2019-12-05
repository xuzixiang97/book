package com.laofuzi.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/index")

    //@ResponseBody
    public String test(){
        return "/admin/index";
    }

    @RequestMapping("/login")

    //@ResponseBody
    public String test1(){
        return "/admin/login";
    }
}
