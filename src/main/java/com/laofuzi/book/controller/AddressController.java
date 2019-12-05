package com.laofuzi.book.controller;

import com.alibaba.fastjson.JSON;
import com.laofuzi.book.entity.Address;
import com.laofuzi.book.entity.Order;
import com.laofuzi.book.entity.Result;
import com.laofuzi.book.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    /**
     * 新增地址
     * @param address
     * @return
     */
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Address address){
        Address insert = addressService.insert(address);
        return JSON.toJSONString(insert);
    }

    /**
     * 修改地址
     * @param address
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody Address address){
        int i = addressService.updateById(address);
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 删除地址
     * @param address
     * @return
     */
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody Address address){
        int i = addressService.deleteById(address.getId());
        return JSON.toJSONString(new Result(i>0));
    }

    /**
     * 地址列表（全部）
     * @param
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public String findAll(){
        List<Address> list = addressService.selectAll();
        return JSON.toJSONString(list);
    }

}

