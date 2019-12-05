package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Cart;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.entity.response.UserCartResponse;
import com.laofuzi.book.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * 新增购物车
     * @param cart
     * @return
     */
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Cart cart){
        Cart insert = cartService.insert(cart);
        return JSON.toJSONString(insert);
    }

    /**
     * 修改购物车信息
     * @param cart
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody Cart cart){
        int i = cartService.updateById(cart);
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 删除购物车
     * @param cart
     * @return
     */
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody Cart cart){
        int i = cartService.deleteById(cart.getId());
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 购物车列表列表（全部）
     * @param
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(){
        List<Cart> list = cartService.selectAll();
        return JSON.toJSONString(list);
    }

    /**
     * 用户购物车列表列表
     * @param cart
     * @return
     */
    @RequestMapping(path = "/findByUserId", method = RequestMethod.POST)
    @ResponseBody
    public String findByUserId(@RequestBody Cart cart){
        List<UserCartResponse> list = cartService.selectByUserId(cart);
        return JSON.toJSONString(list);
    }

}

