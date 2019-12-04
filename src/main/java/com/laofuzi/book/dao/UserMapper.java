package com.laofuzi.book.dao;

import com.laofuzi.book.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKey(User record);

    int updateByName(User record);

    User selectByName(String username);

    List<User> selectAll();


}