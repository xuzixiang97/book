package com.laofuzi.book.service;

import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.entity.response.UserCartResponse;

import java.util.List;

public interface CartService {
    int deleteById(Long id);

    Cart insert(Cart record);

    Cart selectById(Long id);

    UserCartResponse selectDetailById(Long id);

    int updateById(Cart record);

    List<Cart> selectAll();

    List<UserCartResponse> selectByUserId(Cart record);
}