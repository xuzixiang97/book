package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.*;
import com.laofuzi.book.entity.request.CreateOrderRequest;
import com.laofuzi.book.service.BookService;
import com.laofuzi.book.service.CartService;
import com.laofuzi.book.service.OrderItemsService;
import com.laofuzi.book.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderItemsService orderItemsService;

    @Autowired
    private BookService bookService;

    @Autowired
    private CartService cartService;

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
     * 购物车下单
     * @param createOrderRequest
     * @return
     */
    @RequestMapping(path = "/createOrderByCart", method = RequestMethod.POST)
    @ResponseBody
    public String createOrderByCart(@RequestBody CreateOrderRequest createOrderRequest){

        Order order = new Order();
        order.setUserId(createOrderRequest.getUserId());
        order.setStatus(1);
        order.setAddressId(createOrderRequest.getAddressId());
        int account = 0;
        //计算总金额
        for (Cart cart : createOrderRequest.getCartList()) {
            Book book = bookService.selectById(cart.getBookId());
            account = account + book.getUnitprice() * cart.getNumber();
        }
        order.setAccount(account);
        Order newOrder = orderService.insert(order);

        //生成订单项
        for (Cart cart : createOrderRequest.getCartList()) {
            OrderItems orderItems = new OrderItems();
            Book book = bookService.selectById(cart.getBookId());
            orderItems.setBookId(cart.getBookId());
            orderItems.setBookName(book.getName());
            orderItems.setOrderId(newOrder.getId());
            orderItems.setQuantity(cart.getNumber());
            orderItems.setUnitprice(book.getUnitprice());
            orderItemsService.insert(orderItems);

        }

        //清空购物车
        for (Cart cart : createOrderRequest.getCartList()) {
           cartService.deleteById(cart.getId());
        }

        return JSON.toJSONString(new Result(true));
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
     * @param
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(){
        List<Order> list = orderService.selectAll();
        return JSON.toJSONString(list);
    }

    /**
     * 订单列表（根据userId 查询） 传userId即可
     * @param order
     * @return
     */
    @RequestMapping(path = "/selectByUserId", method = RequestMethod.POST)
    @ResponseBody
    public String selectByUserId(@RequestBody Order order){
        List<Order> list = orderService.selectByUserId(order.getUserId());
        return JSON.toJSONString(list);

    }

}

