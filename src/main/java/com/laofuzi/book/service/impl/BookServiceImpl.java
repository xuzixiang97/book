package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.BookMapper;
import com.laofuzi.book.entity.Book;
import com.laofuzi.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
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

    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }

    @Override
    public List<Book> findByCondition(Book record) {
        return bookMapper.findByCondition(record);
    }

    @Override
    public List<Book> selectByCategoryId(Long categoryId) {
        return bookMapper.selectByCategoryId(categoryId);
    }
}
