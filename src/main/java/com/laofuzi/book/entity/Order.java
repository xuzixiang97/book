package com.laofuzi.book.entity;

import lombok.Data;

@Data
public class Order extends BaseDO{
    private Long id;

    private Long userId;

    private Long addressId;

    private Integer account;

    private Integer status;

    private Long createTime;

    private Long deliverTime;

    private Long receiveTime;

}