package com.laofuzi.book.entity;

import lombok.Data;

@Data
public class Category {
    private Long id;

    private String name;

    private Integer level;

    private Long parentId;

    private Long ancestorId;

}