package com.laofuzi.book.mapper;

import com.laofuzi.book.dao.OrderMapper;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class OrderMapperTest {
    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testCase() {
        Order order =new Order();
        order.setUserId(1000L);
        order.setStatus(1);
        order.setAccount(1);
        order.setAddressId(10L);
        order.setDeliverTime(1L);
        order.setReceiveTime(1L);

        orderMapper.insert(order);
        //System.out.println(insert);
    }
}
