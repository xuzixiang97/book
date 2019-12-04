package com.laofuzi.book.service;

import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.entity.response.OrderItemDetailResponse;

import java.util.List;

public interface OrderItemsService {
    int deleteById(Long id);

    OrderItems insert(OrderItems record);

    OrderItems selectById(Long id);

    int updateById(OrderItems record);

    List<OrderItems> selectAll();

    /**
     * 根据订单号查询订单详情 orderId
     * @return
     */
    List<OrderItems> selectByOrderId(OrderItems record);

    /**
     * 根据订单号查询订单详情 orderId(超详细信息)
     * @return
     */
    List<OrderItemDetailResponse> selectDetailByOrderId(OrderItems record);
}