package com.laofuzi.book.entity;

import lombok.Data;

@Data
public class Address extends BaseDO{
    private Long id;

    private Long userId;

    private String name;

    private String phone;

    private String addressDetail;

}