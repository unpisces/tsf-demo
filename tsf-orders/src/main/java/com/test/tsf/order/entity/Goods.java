package com.test.tsf.order.entity;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 14:53
 */
public class Goods {

    private String goodsId;
    private String goodsName;
    private int goodsPrices;

    public Goods() {
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsPrices() {
        return goodsPrices;
    }

    public void setGoodsPrices(int goodsPrices) {
        this.goodsPrices = goodsPrices;
    }
}
