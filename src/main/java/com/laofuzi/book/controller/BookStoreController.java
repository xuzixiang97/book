package com.laofuzi.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bookstore")
public class BookStoreController {

    @RequestMapping("/index1")

    //@ResponseBody
    public String test(){
        return "/index1";
    }

    @RequestMapping("/login")

    //@ResponseBody
    public String test1(){
        return "/login";
    }
    @RequestMapping("/register")

    //@ResponseBody
    public String test2(){
        return "/register";
    }
}
