package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void testCase() {
        //测试书籍类别新增
        Category category = new Category();
        category.setAncestorId(1L);
        category.setLevel(1);
        category.setName("文学类");
        category.setParentId(1L);
        Category insert = categoryService.insert(category);
        System.out.println(insert);
        //测试类别选择
        Category select = categoryService.selectById(1L);
        System.out.println(select);
        //测试类别更新
        category.setName("艺术类");
        int update = categoryService.updateById(category);
        System.out.println(update);
        //测试类别删除
        int delete = categoryService.deleteById(1L);
        System.out.println(delete);
        //测试类别查询全部信息
        List<Category> selectall = categoryService.selectAll();
        System.out.println(selectall);
    }
}
