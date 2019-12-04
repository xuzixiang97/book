package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.User;
import com.laofuzi.book.entity.response.UserOrderResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Order record);

    List<Order> selectAll();

    List<UserOrderResponse> selectByUserId(User record);
}