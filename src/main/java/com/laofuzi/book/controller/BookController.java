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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/book")
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
     * 查询单个图书
     * @param book
     * @return
     */
    @RequestMapping(path = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public String findById(@RequestBody Book book){
        Book record = bookService.selectById(book.getId());
        return JSON.toJSONString(record);
    }


    /**
     * 模糊查询
     * @param book  只支持作者和书名模糊查询
     * @return
     */
    @RequestMapping(path = "/findByCondition", method = RequestMethod.POST)
    @ResponseBody
    public String findByCondition(@RequestBody Book book){
        List<Book> byCondition = bookService.findByCondition(book);
        return JSON.toJSONString(byCondition);
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
     * @param
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(){
        List<Book> list = bookService.selectAll();
        return JSON.toJSONString(list);
    }

    /**
     * 图书列表（根据类目id查询）
     * @param
     * @return
     */
    @RequestMapping(path = "/findByCategoryId", method = RequestMethod.POST)
    @ResponseBody
    public String findByCategoryId(@RequestBody Book book){
        List<Book> list = bookService.selectByCategoryId(book.getCategoryId());
        return JSON.toJSONString(list);
    }






}

