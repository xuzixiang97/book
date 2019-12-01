package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.AddressMapper;
import com.laofuzi.book.entity.Address;
import com.laofuzi.book.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;


    @Override
    public int deleteById(Long id) {
        return addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Address insert(Address record) {
        addressMapper.insert(record);
        return record;
    }

    @Override
    public Address selectById(Long id) {
        return addressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Address record) {
        return addressMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Address> selectAll() {
        return addressMapper.selectAll();
    }
}
