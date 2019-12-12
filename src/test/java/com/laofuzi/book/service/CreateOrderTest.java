package com.laofuzi.book.service;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.entity.request.CreateOrderRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class CreateOrderTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void testCase() {
        //测试下单，生成订单表和订单明细表，清空购物车
        com.laofuzi.book.entity.request.CreateOrderRequest CreateOrderRequest = new CreateOrderRequest();
        CreateOrderRequest.setAddressId(2l);
        CreateOrderRequest.setUserId(10l);
        List<Cart> Carts = new ArrayList<>();
        Cart cart = new Cart();
        cart.setId(4l);
        cart.setUserId(10l);
        cart.setNumber(1);
        cart.setBookId(2l);
        Carts.add(cart);
        //CreateOrderRequest.setCartList(Carts);
        System.out.println(JSON.toJSONString(CreateOrderRequest));
    }
}
