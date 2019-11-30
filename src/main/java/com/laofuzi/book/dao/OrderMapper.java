package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Order record);
}