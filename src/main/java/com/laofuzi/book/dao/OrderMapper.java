package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Order record);

    List<Order> selectAll();

    List<Order> selectByUserId(Order record);
}