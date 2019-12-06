package com.laofuzi.book.service.impl;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.dao.BookMapper;
import com.laofuzi.book.dao.CartMapper;
import com.laofuzi.book.dao.OrderItemsMapper;
import com.laofuzi.book.dao.OrderMapper;
import com.laofuzi.book.entity.*;
import com.laofuzi.book.entity.request.CreateOrderRequest;
import com.laofuzi.book.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private BookMapper bookMapper;


    @Autowired
    private OrderItemsMapper orderItemsMapper;


    @Autowired
    private CartMapper cartMapper;


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

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    @Override
    public List<Order> selectByUserId(Order record) {
        return orderMapper.selectByUserId(record);
    }
}
