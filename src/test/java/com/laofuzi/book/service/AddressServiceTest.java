package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Address;
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
public class AddressServiceTest {
    @Autowired
    private AddressService addressService;

    @Test
    public void testCase() {
        //测试地址新增
        Address address = new Address();
        address.setAddressDetail("浙江省杭州市");
        address.setName("张三");
        address.setPhone("1833439");
        address.setUserId(1L);
        Address insert = addressService.insert(address);
        System.out.println(insert);
        //测试地址选择
        Address select = addressService.selectById(1L);
        System.out.println(select);
        //测试地址更新
        address.setPhone("11111");
        int update = addressService.updateById(address);
        System.out.println(update);
        //测试地址删除
        int delete = addressService.deleteById(1L);
        System.out.println(delete);
        //测试地址查询全部信息
        List<Address> selectall = addressService.selectAll();
        System.out.println(selectall);
    }
}