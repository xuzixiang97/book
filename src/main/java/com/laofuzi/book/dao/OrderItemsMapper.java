package com.laofuzi.book.dao;

import com.laofuzi.book.entity.OrderItems;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderItems record);

    OrderItems selectByPrimaryKey(Long id);

    int updateByPrimaryKey(OrderItems record);

    List<OrderItems> selectAll();

    List<OrderItems> selectByOrderId(OrderItems record);
}