package com.webshop.dao;

import java.util.List;

import com.webshop.entity.Cart;
import com.webshop.entity.Goods;

public interface CartDao {
    int deleteByPrimaryKey(Integer cartId);

    int insert(Cart record);

    boolean insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

	List<Cart> selectByUserId(String userId);

	boolean updateByUserIdAndGoodsId(String userId, String goodsId, int num);

	boolean deleteByUserIdAndGoodsId(String userId, String goodsId);

	Cart selectByUserIdAndGoodsId(String userId, String goodsId);
}