package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Book;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.service.BookService;
import com.laofuzi.book.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Order order){
        Order insert = orderService.insert(order);
        return JSON.toJSONString(insert);
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody Order order){
        int i = orderService.updateById(order);
        return JSON.toJSONString(new Result(i>0));
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody Order order){
        Order insert = orderService.insert(order);
        return JSON.toJSONString(insert);
    }

}

