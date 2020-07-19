package com.webshop.service;

import java.util.List;

import com.webshop.entity.Address;
import com.webshop.entity.Cart;
import com.webshop.entity.Goods;

public interface CartService {
	
	public List<Cart> getGoodsByUserId(String userId);

	public List<Cart> getGoodsByGoodsIdList(List<String> goodsIdList);

	public boolean deleteGoodsFromCart(String userId, String goodsId);

	public boolean updateBuyNumForGoods(String userId, String goodsId,
			int buyNum);

	public Cart getCartGoodsByUserIdAndGoodsId(String userId, String goodsId);

	public boolean addGoodsToCart(String userId, String goodsId, int num);

}
