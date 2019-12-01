package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testCase() {
        Order order =new Order();
        order.setUserId(1L);
        order.setStatus(1);
        order.setAccount(1);
        order.setAddressId(10L);
        order.setDeliverTime(1L);
        order.setReceiveTime(1L);

        orderService.insert(order);
        //System.out.println(insert);
    }
}
