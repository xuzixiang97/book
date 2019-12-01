package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.BookMapper;
import com.laofuzi.book.entity.Book;
import com.laofuzi.book.service.BookService;

import javax.annotation.Resource;

public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public int deleteById(Long id) {

        return bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Book insert(Book record) {
        bookMapper.insert(record);
        return record;
    }

    @Override
    public Book selectById(Long id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }
}
