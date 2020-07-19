package com.webshop.service;

import java.util.List;

import com.webshop.entity.Goods;
import com.webshop.entity.GoodsImg;


public interface GoodsService {

	Goods getGoodsByGoodsId(String goodsId);

	List<GoodsImg> getGoodsImg(String goodsId);

	List<Goods> getSellingGoods();

	List<Goods> searchGoods(String condition);

	List<Goods> getGoodsByType(String string, int type);
	
}
