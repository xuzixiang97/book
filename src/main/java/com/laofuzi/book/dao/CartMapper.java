package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cart record);

    Cart selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Cart record);

    List<Cart> selectAll();

    List<Cart> selectByUserId(Cart record);
}