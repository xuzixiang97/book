package com.laofuzi.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bookstore")
public class BookStoreController {

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
    @RequestMapping("/register")

    //@ResponseBody
    public String test2(){
        return "/register";
    }

    @RequestMapping("/checkout")

    //@ResponseBody
    public String test3(){
        return "/checkout";
    }

    @RequestMapping("/order")

    //@ResponseBody
    public String test4(){
        return "/order";
    }

    @RequestMapping("/single")

    //@ResponseBody
    public String test5(){
        return "/single";
    }

    @RequestMapping("/CategoryList")

    //@ResponseBody
    public String test6(){
        return "/CategoryList";
    }

    @RequestMapping("/pay")

    //@ResponseBody
    public String test7(){
        return "/pay";
    }

    @RequestMapping("/address")

    //@ResponseBody
    public String test8(){
        return "/address";
    }
}
