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

import java.util.List;

@Controller
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 新增订单
     * @param order
     * @return
     */
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Order order){
        Order insert = orderService.insert(order);
        return JSON.toJSONString(insert);
    }

    /**
     * 修改订单
     * @param order
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody Order order){
        int i = orderService.updateById(order);
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 删除订单
     * @param order
     * @return
     */
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody Order order){
        int i = orderService.deleteById(order.getId());
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 订单列表（全部）
     * @param order
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(@RequestBody Order order){
        List<Order> list = orderService.selectAll();
        return JSON.toJSONString(list);
    }

}

