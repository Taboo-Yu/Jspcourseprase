package com.webshop.dao;

import java.util.List;

import com.webshop.entity.Goods;
import com.webshop.entity.GoodsImg;


public interface GoodsDao {
    int deleteByPrimaryKey(String goodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(String goodsid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    //List<Goods> selectByGoodsClass();
    List<Goods> selectAllGoods();


	List<GoodsImg> selectGoodsImg(String goodsId);

	
	List<Goods> selectSellingGoods();

	
	List<Goods> selectGoodsByCondition(String condition);
	
	List<Goods> selectGoodsByClass(String type, String sql);

	boolean updateByPrimaryKey( String string2, int num, int num2);

	Goods selectByGoodsId(String string);
    
}