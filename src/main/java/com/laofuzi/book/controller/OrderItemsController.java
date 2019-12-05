package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.entity.response.OrderItemDetailResponse;
import com.laofuzi.book.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/order_items")
@CrossOrigin
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
     * @param
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(){
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

    /**
     * 订单详情列表（一张订单）传orderId
     * @param orderItems
     * @return
     */
    @RequestMapping(path = "/findDetailByOrderId", method = RequestMethod.POST)
    @ResponseBody
    public String findDetailByOrderId(@RequestBody OrderItems orderItems){
        List<OrderItemDetailResponse> orderItemDetailResponses = orderItemsService.selectDetailByOrderId(orderItems);
        return JSON.toJSONString(orderItemDetailResponses);
    }

}

