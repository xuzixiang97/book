package com.laofuzi.book.service;

import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    int deleteById(Long id);

    Category insert(Category record);

    Category selectById(Long id);

    int updateById(Category record);

    List<Category> selectAll();

    List<Category> findByParentId(Long parentId);
}