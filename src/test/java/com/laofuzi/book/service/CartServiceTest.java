package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.entity.response.UserCartResponse;
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
public class CartServiceTest {
    @Autowired
    private CartService cartService;

    @Test
    public void testCase() {
//        //测试购物车新增
//        Cart cart = new Cart();
//        cart.setBookId(2L);
//        cart.setNumber(1);
//        cart.setUserId(7L);
//        Cart insert = cartService.insert(cart);
//        System.out.println(insert);
//        //测试购物车选择
//        Cart select = cartService.selectById(1L);
//        System.out.println(select);
//        //测试购物车更新
//        cart.setNumber(2);
//        int update = cartService.updateById(cart);
//        System.out.println(update);
//        //测试购物车删除
//        int delete = cartService.deleteById(1L);
//        System.out.println(delete);
        //测试购物车查询全部信息
//        List<Cart> selectall = cartService.selectAll();
//        System.out.println(selectall);
        //测试根据用户id查询购物车
        Cart cart1 = new Cart();
        cart1.setUserId(1L);
        List<UserCartResponse> find = cartService.selectByUserId(cart1);
        System.out.println(find);
    }
}
