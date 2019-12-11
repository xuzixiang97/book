package com.laofuzi.book.controller;

import com.laofuzi.book.entity.Book;
import com.laofuzi.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/login")
    public String test1(){
        return "admin/login";
    }


    @RequestMapping("/upbook")
    public String test2(){
        return "admin/upbook";
    }

    @RequestMapping("/order")
    public String order(){
        return "admin/order";
    }

    @RequestMapping("/user-list")
    public String user(){
        return "admin/user-list";
    }

    @RequestMapping("/orderdetail")
    public String orderdetail(){
        return "admin/orderdetail";
    }

    @RequestMapping("/signin")
    public String signin(){
        return "admin/signin";
    }

    /**
     * 后台index
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String findAll(Model model){
        List<Book> list = bookService.selectAll();
        model.addAttribute("books",list);
        return "admin/index";
    }


    @RequestMapping(value = "/show")
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "xuzi";
    }
}
