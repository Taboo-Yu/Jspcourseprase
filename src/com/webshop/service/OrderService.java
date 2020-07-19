package com.webshop.service;

import java.util.List;

import com.webshop.entity.Order;


public interface OrderService {


	boolean addOrder(Order order);


	boolean addOrderChildTable(String userId, String orderid, String[] goodsIdArray, String[] goodsBuyNum, String[] isChoose);

	List<Order> getOrderByUserId(String userId);

}
