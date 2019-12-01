package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.OrderItems;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class OrderItemsServiceTest {
    @Autowired
    private OrderItemsService orderItemsService;

    @Test
    public void testCase() {
        OrderItems orderitems = new OrderItems();
        orderitems.setId(1L);
        orderitems.setBookId(1L);
        orderitems.setBookName("百年孤独");
        orderitems.setId(1L);
        orderitems.setQuantity(1);
        orderitems.setUnitprice(30);
        orderitems.insert();
        orderitems.
        System.out.println(insert);
    }
}

