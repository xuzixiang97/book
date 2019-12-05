package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Book;
import com.laofuzi.book.entity.Category;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.service.BookService;
import com.laofuzi.book.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/book")
@CrossOrigin //允许跨域请求
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 新增图书
     * @param book
     * @return
     */
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Book book){
        Book insert = bookService.insert(book);
        return JSON.toJSONString(insert);
    }

    /**
     * 修改图书
     * @param book
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody Book book){
        int i = bookService.updateById(book);
        return JSON.toJSONString(new Result(i>0));
    }
    @RequestMapping(path = "/updateByUsername", method = RequestMethod.POST)
    @ResponseBody
    public String updateByUsername(@RequestBody Book book){
        int i = bookService.updateById(book);
        return JSON.toJSONString(new Result(i>0));
    }
    /**
     * 删除图书
     * @param book
     * @return
     */
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody Book book){
        int i = bookService.deleteById(book.getId());
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 图书列表（全部）
     * @param book
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(@RequestBody Book book){
        List<Book> list = bookService.selectAll();
        return JSON.toJSONString(list);
    }


}

