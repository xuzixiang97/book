package com.laofuzi.book.service;

import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class OrderServiceTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void testCase() {
        Order order =new Order();
        order.setId(1000L);
        order.setUserId(1000L);
        order.setStatus(1);
        order.setAccount(1);
        order.setAddressId(10L);
        order.setDeliverTime(1);
        order.setReceiveTime(1);
        Order insert = orderService.insert(order);
        System.out.println(insert);
    }
}
