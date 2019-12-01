package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.BookMapper;
import com.laofuzi.book.dao.OrderMapper;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.service.OrderService;

import javax.annotation.Resource;

public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public int deleteById(Long id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Order insert(Order record) {
        orderMapper.insert(record);
        return record;
    }

    @Override
    public Order selectById(Long id) {

        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }
}
