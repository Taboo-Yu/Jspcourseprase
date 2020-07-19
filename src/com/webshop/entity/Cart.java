package com.webshop.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cart  {
    private Integer cartId;

    private String userId;

    private String goodsId;

    private Integer buyNum;

    private Date addTime;

    public Cart() {}
    
	public Cart(String userId2, String goodsId2, int num, Date time) {
		this.userId = userId2;
		this.goodsId = goodsId2;
		this.buyNum = num;
		this.addTime = time;
	}

	public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
    
    
    private String goodsName;

    private String goodsImg;
    
    private BigDecimal goodsPrice;

    private Integer goodsNum;

    private Integer salesNum;

    private String goodsSize;

    private String goodsFrom;

    private String goodsTime;

    private String goodsSaveCondition;

    private String goodsDescribe;

    private String goodsExplain;

    private String goodsClass;

    private BigDecimal goodsDiscount;

    private Date discountStartTime;

    private Date discountEndTime;

	public String getGoodsName() {
		return goodsName;
	}


	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsImg() {
		return goodsImg;
	}


	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}


	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getSalesNum() {
		return salesNum;
	}

	public void setSalesNum(Integer salesNum) {
		this.salesNum = salesNum;
	}

	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}

	public String getGoodsFrom() {
		return goodsFrom;
	}

	public void setGoodsFrom(String goodsFrom) {
		this.goodsFrom = goodsFrom;
	}

	public String getGoodsTime() {
		return goodsTime;
	}

	public void setGoodsTime(String goodsTime) {
		this.goodsTime = goodsTime;
	}

	public String getGoodsSaveCondition() {
		return goodsSaveCondition;
	}

	public void setGoodsSaveCondition(String goodsSaveCondition) {
		this.goodsSaveCondition = goodsSaveCondition;
	}

	public String getGoodsDescribe() {
		return goodsDescribe;
	}

	public void setGoodsDescribe(String goodsDescribe) {
		this.goodsDescribe = goodsDescribe;
	}

	public String getGoodsExplain() {
		return goodsExplain;
	}

	public void setGoodsExplain(String goodsExplain) {
		this.goodsExplain = goodsExplain;
	}

	public String getGoodsClass() {
		return goodsClass;
	}

	public void setGoodsClass(String goodsClass) {
		this.goodsClass = goodsClass;
	}

	public BigDecimal getGoodsDiscount() {
		return goodsDiscount;
	}

	public void setGoodsDiscount(BigDecimal goodsDiscount) {
		this.goodsDiscount = goodsDiscount;
	}

	public Date getDiscountStartTime() {
		return discountStartTime;
	}

	public void setDiscountStartTime(Date discountStartTime) {
		this.discountStartTime = discountStartTime;
	}

	public Date getDiscountEndTime() {
		return discountEndTime;
	}

	public void setDiscountEndTime(Date discountEndTime) {
		this.discountEndTime = discountEndTime;
	}
}