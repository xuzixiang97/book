package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testCase() {
        //测试订单新增方法
        Order order =new Order();
        //order.setUserId(1L);
        order.setStatus(0);
//        order.setAccount(1);
//        order.setAddressId(10L);
//        order.setDeliverTime(1L);
//        order.setReceiveTime(1L);
//        Order insert = orderService.insert(order);
//        System.out.println(insert);
//        //测试订单更新方法
//        order.setAccount(2);
//        int update = orderService.updateById(order);
//        System.out.println(update);
//        //测试订单选择方法
//        Order order1 = orderService.selectById(2L);
//        System.out.println(order1);
//        //测试订单删除方法
//        int delete = orderService.deleteById(order1.getId());
//        System.out.println(delete);
        //测试订单选择全部方法
//        List<Order> selectall = orderService.selectAll();
//        System.out.println(selectall);
        //根据用户id或订单状态查询订单列表
        List<Order> selectbyuser = orderService.selectByUserId(order);
        System.out.println(selectbyuser);
    }
}
