package com.laofuzi.book.service;

import com.laofuzi.book.entity.OrderItems;

public interface OrderItemsService {
    int deleteById(Long id);

    OrderItems insert(OrderItems record);

    OrderItems selectById(Long id);

    int updateById(OrderItems record);
}