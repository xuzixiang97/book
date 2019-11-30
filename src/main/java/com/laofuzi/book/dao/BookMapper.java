package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Book record);
}