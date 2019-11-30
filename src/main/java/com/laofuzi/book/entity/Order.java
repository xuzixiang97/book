package com.laofuzi.book.entity;

import lombok.Data;

@Data
public class Order extends BaseDO{
    private Long id;

    private Long userId;

    private Long addressId;

    private Integer account;

    private Integer status;

    private Integer deliverTime;

    private Integer receiveTime;

}