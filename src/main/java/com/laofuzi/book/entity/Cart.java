package com.laofuzi.book.entity;

import lombok.Data;

@Data
public class Cart extends BaseDO{
    private Long id;

    private Long userId;

    private Long bookId;

    private Integer number;
}