package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.BookMapper;
import com.laofuzi.book.dao.OrderItemsMapper;
import com.laofuzi.book.entity.Book;
import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.entity.response.OrderItemDetailResponse;
import com.laofuzi.book.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderItemsServiceImpl implements OrderItemsService {
    @Autowired
    private OrderItemsMapper orderItemsMapper;

    @Autowired
    private BookMapper bookMapper;
    @Override
    public int deleteById(Long id) {
        return orderItemsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OrderItems insert(OrderItems record) {
        orderItemsMapper.insert(record);
        return record;
    }

    @Override
    public OrderItems selectById(Long id) {

        return orderItemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(OrderItems record) {
        return orderItemsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<OrderItems> selectAll() {
        return orderItemsMapper.selectAll();
    }

    @Override
    public List<OrderItems> selectByOrderId(OrderItems record) {
        return orderItemsMapper.selectByOrderId(record);
    }

    @Override
    public List<OrderItemDetailResponse> selectDetailByOrderId(OrderItems record) {
        List<OrderItemDetailResponse> orderItemDetailResponses = new ArrayList<>();
        List<OrderItems> itemsList = orderItemsMapper.selectByOrderId(record);
        for (OrderItems orderItems : itemsList) {
            OrderItemDetailResponse orderItemDetailResponse =new OrderItemDetailResponse();
            orderItemDetailResponse.setId(orderItems.getId());
            orderItemDetailResponse.setOrderId(orderItems.getOrderId());
            orderItemDetailResponse.setBookId(orderItems.getBookId());
            orderItemDetailResponse.setBookName(orderItems.getBookName());
            orderItemDetailResponse.setQuantity(orderItems.getQuantity());
            orderItemDetailResponse.setUnitprice(orderItems.getUnitprice());
            Book book = bookMapper.selectByPrimaryKey(orderItems.getBookId());
            orderItemDetailResponse.setAuthor(book.getAuthor());
            orderItemDetailResponse.setImg(book.getImg());
            orderItemDetailResponses.add(orderItemDetailResponse);
        }
        return orderItemDetailResponses;
    }
}
