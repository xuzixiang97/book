package com.laofuzi.book.service;

import com.laofuzi.book.entity.Address;
import com.laofuzi.book.entity.Cart;

import java.util.List;

public interface AddressService {
    int deleteById(Long id);

    Address insert(Address record);

    Address selectById(Long id);

    int updateById(Address record);

    List<Address> selectAll();
}