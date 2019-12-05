package com.laofuzi.book.controller;

import com.laofuzi.book.entity.Book;
import com.laofuzi.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    /**
     * 测试页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/show")
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "xuzi";
    }


    /**
     * 跳转编辑图书页面
     * @param id
     * @return
     */
    @RequestMapping(path = "/findByIdXu", method = RequestMethod.POST)
    public String findByIdXu(Long id, Model model){
        Book book = bookService.selectById(id);
        model.addAttribute("book",book);
        return "/admin/updatebook";
    }

}
