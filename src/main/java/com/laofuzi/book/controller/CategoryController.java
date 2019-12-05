package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Category;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 新增类目
     * @param category
     * @return
     */
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Category category){
        Category insert = categoryService.insert(category);
        return JSON.toJSONString(insert);
    }

    /**
     * 修改类目
     * @param category
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody Category category){
        int i = categoryService.updateById(category);
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 删除类目
     * @param category
     * @return
     */
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody Category category){
        int i = categoryService.deleteById(category.getId());
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 类目列表（全部）
     * @param
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(){
        List<Category> list = categoryService.selectAll();
        return JSON.toJSONString(list);
    }


}

