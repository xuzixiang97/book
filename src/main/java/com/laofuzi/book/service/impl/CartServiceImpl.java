package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.CartMapper;
import com.laofuzi.book.dao.CategoryMapper;
import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public int deleteById(Long id) {
        return cartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Cart insert(Cart record) {
        cartMapper.insert(record);
        return record;
    }

    @Override
    public Cart selectById(Long id) {
        return cartMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Cart record) {
        return cartMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Cart> selectAll() {
        return cartMapper.selectAll();
    }

    @Override
    public List<Cart> selectByUserId(Cart record) {
        return cartMapper.selectByUserId(record);
    }


}
