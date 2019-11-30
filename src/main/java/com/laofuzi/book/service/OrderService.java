package com.laofuzi.book.service;

import com.laofuzi.book.entity.Order;

public interface OrderService {
    int deleteById(Long id);

    Order insert(Order record);

    Order selectById(Long id);

    int updateById(Order record);
}