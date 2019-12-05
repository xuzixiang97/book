package com.laofuzi.book.entity;

import lombok.Data;

@Data
public class Book extends BaseDO{
    private Long id;

    private String name;

    private String describe;

    private String author;

    private String publisher;

    private String publishDate;

    private Integer unitprice;

    private Integer quantity;

    private Long categoryId;

    private String img;

    private Integer score;

    private Integer status;

    private String extendField;
}