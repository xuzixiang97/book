package com.laofuzi.book.service;

import com.laofuzi.book.entity.Book;

public interface BookService {
    int deleteById(Long id);

    Book insert(Book record);

    Book selectById(Long id);

    int updateById(Book record);
}
