package com.laofuzi.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bookstore")
public class BookStoreController {

    @RequestMapping("/index")
    public String test(){
        return "/index1";
    }

    @RequestMapping("/login")
    public String test1(){
        return "/login";
    }

    @RequestMapping("/register")
    public String test2(){
        return "/register";
    }


    @RequestMapping("/checkout")
    public String test3(){
        return "/checkout";
    }


    @RequestMapping("/order")
    public String test4(){
        return "/order";
    }


    @RequestMapping("/single")
    public String test5(){
        return "/single";
    }
}
