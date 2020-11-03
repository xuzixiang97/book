package com.laofuzi.book.dao;

import com.laofuzi.book.entity.Address;
import com.laofuzi.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Address record);

    Address selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Address record);

    List<Address> selectAll();

}