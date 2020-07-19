package com.webshop.service;

import java.util.List;

import com.webshop.entity.Address;

public interface AddressService {

	List<Address> getAddressByUserId(String userId);
	
	public Address getAddressByUserIdAndAddress(String uid, String add);

	public boolean insertAddress(Address address);

}
