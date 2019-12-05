package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Book record);

    List<Book> selectAll();

    List<Book> findByCondition(Book record);

    List<Book> selectByCategoryId(Long categoryId);
}