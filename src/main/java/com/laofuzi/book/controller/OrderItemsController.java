package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/order_items")
public class OrderItemsController {

    @Autowired
    private OrderItemsService orderItemsService;

    /**
     * 新增订单
     * @param orderItems
     * @return
     */
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody OrderItems orderItems){
        OrderItems insert = orderItemsService.insert(orderItems);
        return JSON.toJSONString(insert);
    }

    /**
     * 修改订单
     * @param orderItems
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody OrderItems orderItems){
        int i = orderItemsService.updateById(orderItems);
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 删除订单
     * @param orderItems
     * @return
     */
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody OrderItems orderItems){
        int i = orderItemsService.deleteById(orderItems.getId());
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 订单详情列表（全部）
     * @param orderItems
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(@RequestBody OrderItems orderItems){
        List<OrderItems> list = orderItemsService.selectAll();
        return JSON.toJSONString(list);
    }

    /**
     * 订单详情列表（一张订单）
     * @param orderItems
     * @return
     */
    @RequestMapping(path = "/findByOrderId", method = RequestMethod.POST)
    @ResponseBody
    public String findByOrderId(@RequestBody OrderItems orderItems){
        List<OrderItems> list = orderItemsService.selectByOrderId(orderItems);
        return JSON.toJSONString(list);
    }

}

