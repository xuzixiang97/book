package com.laofuzi.book.service;

import com.laofuzi.book.entity.Book;

import java.util.List;

public interface BookService {
    int deleteById(Long id);

    Book insert(Book record);

    Book selectById(Long id);

    int updateById(Book record);

    List<Book> selectAll();

    /**
     * 条件查询搜索商品 支持名称 和 作者
     * @param record
     * @return
     */
    List<Book> findByCondition(Book record);

    /**
     * 根据类目id查询
     * @param categoryId
     * @return
     */
    List<Book> selectByCategoryId(Long categoryId);
}
