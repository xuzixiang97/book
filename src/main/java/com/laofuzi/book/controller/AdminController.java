package com.laofuzi.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/index")
    public String test(){
        return "admin/index";
    }


    @RequestMapping("/login")
    public String test1(){
        return "admin/login";
    }
}
