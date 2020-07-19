package com.webshop.dao;

import java.util.List;

import com.webshop.entity.Address;

public interface AddressDao {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

	List<Address> selectByUserId(String userId);

	Address selectByAddress(String uid, String add);

	boolean insertAddress(Address address);
}