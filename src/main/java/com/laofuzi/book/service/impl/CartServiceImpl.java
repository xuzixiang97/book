package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.BookMapper;
import com.laofuzi.book.dao.CartMapper;
import com.laofuzi.book.entity.Book;
import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.entity.response.UserCartResponse;
import com.laofuzi.book.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private BookMapper bookMapper;

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
    public UserCartResponse selectDetailById(Long id) {
        Cart cart = cartMapper.selectByPrimaryKey(id);
        UserCartResponse userCartResponse = new UserCartResponse();
        userCartResponse.setId(cart.getId());
        userCartResponse.setUserId(cart.getUserId());
        userCartResponse.setBookId(cart.getBookId());
        userCartResponse.setNumber(cart.getNumber());
        Book book = bookMapper.selectByPrimaryKey(cart.getBookId());
        userCartResponse.setName(book.getName());
        userCartResponse.setDescribe(book.getDescribe());
        userCartResponse.setAuthor(book.getAuthor());
        userCartResponse.setPublisher(book.getPublisher());
        userCartResponse.setPublishDate(book.getPublishDate());
        userCartResponse.setUnitprice(book.getUnitprice());
        userCartResponse.setQuantity(book.getQuantity());
        userCartResponse.setCategoryId(book.getCategoryId());
        userCartResponse.setImg(book.getImg());
        userCartResponse.setScore(book.getScore());
        return userCartResponse;
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
    public List<UserCartResponse> selectByUserId(Cart record) {
        List<UserCartResponse> userCartResponses =new ArrayList<>();
        List<Cart> carts = cartMapper.selectByUserId(record);
        for (Cart cart : carts) {
            UserCartResponse userCartResponse = new UserCartResponse();
            userCartResponse.setId(cart.getId());
            userCartResponse.setUserId(cart.getUserId());
            userCartResponse.setBookId(cart.getBookId());
            userCartResponse.setNumber(cart.getNumber());
            Book book = bookMapper.selectByPrimaryKey(cart.getBookId());
            userCartResponse.setName(book.getName());
            userCartResponse.setDescribe(book.getDescribe());
            userCartResponse.setAuthor(book.getAuthor());
            userCartResponse.setPublisher(book.getPublisher());
            userCartResponse.setPublishDate(book.getPublishDate());
            userCartResponse.setUnitprice(book.getUnitprice());
            userCartResponse.setQuantity(book.getQuantity());
            userCartResponse.setCategoryId(book.getCategoryId());
            userCartResponse.setImg(book.getImg());
            userCartResponse.setScore(book.getScore());
            userCartResponses.add(userCartResponse);
        }
        return userCartResponses;
    }


}
