package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Book;
import com.laofuzi.book.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Category record);

    List<Category> selectAll();

    List<Category> findByParentId(Long parentId);
}