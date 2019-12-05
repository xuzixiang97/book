package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.CategoryMapper;
import com.laofuzi.book.entity.Category;
import com.laofuzi.book.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public int deleteById(Long id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Category insert(Category record) {
        categoryMapper.insert(record);
        return record;
    }

    @Override
    public Category selectById(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Category record) {
        return categoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Category> selectAll() {
        return categoryMapper.selectAll();
    }

    @Override
    public List<Category> findByParentId(Long parentId) {
        return categoryMapper.findByParentId(parentId);
    }
}
