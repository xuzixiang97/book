package com.laofuzi.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")

    //@ResponseBody
    public String test(){
        return "/index";
    }

    @RequestMapping("/login")

    //@ResponseBody
    public String test1(){
        return "/login";
    }
}
