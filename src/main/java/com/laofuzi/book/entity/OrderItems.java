package com.laofuzi.book.entity;

import lombok.Data;

@Data
public class OrderItems extends BaseDO{
    private Long id;

    private Long orderId;

    private Long bookId;

    private String bookName;

    private Integer quantity;

    private Integer unitprice;
}